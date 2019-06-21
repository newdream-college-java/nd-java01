package com.dy.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.dy.po.A;

public class test1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class cl=A.class;
		A a=(A)cl.newInstance();
		Field[] fileds=cl.getDeclaredFields();
		Field.setAccessible(fileds, true);
		Method [] ms1 = cl.getDeclaredMethods();
		for(Method mm:ms1){
		     //System.out.println(mm);                  
		     System.out.println(mm.getModifiers()+"\t"+mm.getReturnType().getSimpleName()+"\t"+pa(mm.getParameterTypes()));
		 }
		for(int i=0;i<fileds.length;i++){
			System.out.println(modifyToString(fileds[i].getModifiers())+"----"+fileds [i].getType()+"-----"+fileds[i].getName());
		}
	}
	private static String soEasy(int modifiers) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String modifyToString(int modify) {
        if(modify == Modifier.PUBLIC) {
            return "public";
        }else if(modify==Modifier.PRIVATE) {
            return "private";
        }else if(modify==Modifier.PROTECTED) {
            return "protected";
        }else if(modify==(Modifier.PRIVATE | Modifier.STATIC) ) {
            return "private static";
        }
        return "Ä¬ÈÏÐÞÊÎ·û";
        
    }
	public static String pa(Class [] cs){
		StringBuffer sb=new StringBuffer();
		sb.append("(");
		for(int i=0;i<cs.length;i++){
			sb.append(cs[i].getSimpleName());
			if(i<cs.length-1){
	            sb.append(",");
	        }
		}
		sb.append(")");
		return sb.toString();
	}
}
