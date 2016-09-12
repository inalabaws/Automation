package application.main.stepDefImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

	public static Connection conn= null;
	public static void main(String args[]) throws SQLException
	{
		String url="";
		String username="";
		String password="";
		
		try {
			conn=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement pst=null;
		ResultSet rs=null;
		try{
			String query="";
			pst=conn.prepareStatement(query);
			rs=pst.executeQuery();
			while(rs.next())
			{
				//String val=rs.getString("");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally{
			if(pst!=null)
			{
				pst.close();
			}
			if(rs!=null)
			{
				rs.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		}
	}
}
