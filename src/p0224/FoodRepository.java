package p0224;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class FoodRepository {
	public List<Map<String,String>> selectFoodInfos(Map<String,String> foodInfo) {
		try(SqlSession session = MybatisConfig.getSSF.openSession();){
			return session.selectList("p0224.FoodinfoMapper.selectFoodInfos",foodInfo);
			
			
	public sa		
		}
	}
}
