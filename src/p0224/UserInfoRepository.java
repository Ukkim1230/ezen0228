package p0224;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class UserInfoRepository {
	public List<Map<String,String>> selectUserInfos(Map<String,String> param) {
		try(SqlSession session = MybatisConfig.getSSF().openSession()) {
			return session.selectList("p0224.UserInfoMapper.selectUserInfos",param);
		}
	}
	public List<Map<String,String>> selectUserInfo(int uiNum) {
		try(SqlSession session = MybatisConfig.getSSF().openSession()) {
			return session.selectOne("p0224.UserInfoMapper.selectUserInfos", uiNum);
		}
	}
	public int deleteUserInfo(int param) {
		try(SqlSession session = MybatisConfig.getSSF().openSession(true)) {
			return session.delete("p0224.UserInfoMapper.deleteUserInfo", param);
		}
	}
	public int insertUSerInfo(Map<String,String> param) {
		try(SqlSession session = MybatisConfig.getSSF().openSession(true)) {
			return session.insert("p0224.UserInfoMapper.updateUserInfo",param);
		}
	}
	public int updateUserInfo(String uiName, String uiId, String uiPwd) {
		try(SqlSession session = MybatisConfig.getSSF().openSession(true)) {
			return session.update("p0224.UserInfoMapper.updateUserInfo");
		}
	}
	
	public static void main(String[]args) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		List<Map<String,String>> userInfos = uiRepo.selectUserInfos(null);
		for(Map<String,String> userInfo:userInfos) {
			System.out.print(userInfo);			
		}
		Map<String,String> param = new HashMap<>();
		param.put("uiName", "강호동");
		param.put("uiId", "gang");
		param.put("uiPwd", "ho1234");
		List<Map<String,String>> userInfo = uiRepo.selectUserInfo(2);
		System.out.println(userInfo);
		int result = uiRepo.insertUSerInfo(param);
		System.out.print("입력갯수"+result);
		param.put("ui, null)
				
		
		}
}
