package p0220;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import p0219.DBCon;

class TestInfoVO{
	String tiName;
	Integer tiNum;
	
}
public class Exam {

	public static void main(String[] args) {
		TestInfoVO ti = new TestInfoVO();
		ti.tiName="가";
		ti.tiNum = 4000;
		
		String sql = "SELECT * FROM TEST_INFO WHERE 1=1 ";
		if(ti!=null) {
			if(ti.tiName!=null && ti.tiName.length()!=0) {
				sql += " AND TI_NAME LIKE CONTCAT('%',?,'%')";
			}
			if(ti.tiNum!=null && ti.tiNum!=0) {
				sql += " AND TI_NUM = ?";
			}
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){

			if(ti.tiName!=null && ti.tiName.length()!=0) {
				ps.setString(1, ti.tiName);
			}
			if(ti.tiNum!=null && ti.tiNum!=0) {
				if(ti.tiName!=null && ti.tiName.length()!=0) {
					ps.setInt(2, ti.tiNum);
				}else {
					ps.setInt(1, ti.tiNum);
				}
			}
			ResultSet rs = ps.executeQuery();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);
		
	}
}