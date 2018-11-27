package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL {
	
	private String url = "sys:mysql://localhost/ZeroDechet";
	private String user = "root";
	private String pwd = "root";
	
	private Connection cn = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	public static void connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, user, pwd);
			st = cn.createStatement();
			rs = st.executeQuery(sql);
		}
		
		

}
