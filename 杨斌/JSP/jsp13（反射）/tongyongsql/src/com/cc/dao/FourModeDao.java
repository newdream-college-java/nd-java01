package com.cc.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FourModeDao<E> {
	private Class<?> cls;
	public FourModeDao() {
		Type sType=getClass().getGenericSuperclass();
		Type[] generics=((ParameterizedType) sType).getActualTypeArguments();
		cls=(Class<?>) (generics[0]);
	}
	//通用的数据库增删改操作，可以总结成update方法来实现
	public int update(String sql,Object...parameters) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		int affectedRow=0;
		conn=BaseDao.getConn();
		try {
			st=conn.prepareStatement(sql);
			setParameters(st,parameters);
			affectedRow=st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(rs, st, conn);
		}	
		return affectedRow;
	}
	//数据库单条查询
	public E get(String sql,Object...parameters) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		E obj=null;
		try {
			conn=BaseDao.getConn();
			st=conn.prepareStatement(sql);
			setParameters(st,parameters);
			rs=st.executeQuery();
			while(rs.next()) {
				obj=oneRowToObject(rs);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(rs, st, conn);
		}	
		return obj;
	}
	//数据库多条查询
	public List<E> list(String sql,Object...parameters) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<E> list = new ArrayList<E>();
		
		try {
			conn = BaseDao.getConn();
			st = conn.prepareStatement(sql);
			setParameters(st, parameters);
			rs = st.executeQuery();
			while(rs.next()) {
				E obj = oneRowToObject(rs);
				list.add(obj);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, st, conn);
		}
	
		return list;
	}
	private E oneRowToObject(ResultSet rs) throws InstantiationException, IllegalAccessException, SQLException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		E obj;
		obj=(E) cls.newInstance();
		//获取结果集元数据(获取此 ResultSet 对象的列的编号、类型和属性。)
		ResultSetMetaData rd=rs.getMetaData();
		for (int i = 0; i < rd.getColumnCount(); i++) {
			//获取列名
			String columnName=rd.getColumnLabel(i+1);
			//组合方法名
			String methodName="set"+columnName.substring(0, 1).toUpperCase()+columnName.substring(1);
			//获取列类型
			int columnType=rd.getColumnType(i+1);
			Method method=null;
			switch(columnType) {
			case java.sql.Types.VARCHAR:
			case java.sql.Types.CHAR:
				method=cls.getMethod(methodName, String.class);
				if(method!=null) {
					method.invoke(obj, rs.getString(columnName));	
				}
				break;
			
			case java.sql.Types.INTEGER:
			case java.sql.Types.SMALLINT:
				method=cls.getMethod(methodName, int.class);
				if(method!=null) {
					method.invoke(obj, rs.getInt(columnName));	
				}
				break;
			case java.sql.Types.BIGINT:
				method=cls.getMethod(methodName, long.class);
				if(method!=null) {
					method.invoke(obj, rs.getLong(columnName));	
				}
				break;
			case java.sql.Types.DATE:
			case java.sql.Types.TIMESTAMP:
				method=cls.getMethod(methodName, Date.class);
				if(method!=null) {
					method.invoke(obj, rs.getTimestamp(columnName));	
				}
				break;
			case java.sql.Types.DECIMAL:
				method=cls.getMethod(methodName, BigDecimal.class);
				if(method!=null) {
					method.invoke(obj, rs.getBigDecimal(columnName));	
				}
				break;
			case java.sql.Types.DOUBLE:
			case java.sql.Types.NUMERIC:
				method=cls.getMethod(methodName, double.class);
				if(method!=null) {
					method.invoke(obj, rs.getDouble(columnName));	
				}
				break;
			case java.sql.Types.BIT:
				method=cls.getMethod(methodName, boolean.class);
				if(method!=null) {
					method.invoke(obj, rs.getBoolean(columnName));	
				}
				break;
			default:
				break;
			}	
		}
		return obj;
	}
	
	private void setParameters(PreparedStatement st, Object[] parameters) {
		if(parameters!=null&&parameters.length>0) {
			for(int i=0;i<parameters.length;i++) {
				try {
					st.setObject(i+1,parameters[i] );
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
	}
}


