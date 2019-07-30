package mapper;
import entity.Items;
public interface HcMapper {
	Items hc(int Id);
	/*通过用户的id查询这个用户的所有信息*/	   
    int  update(Items user);
}
