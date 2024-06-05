package local.domain.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connec {
	
	private static final String HOST = "localhost";
	private static final String URL = "jdbc:mysql://"+HOST+":3306";
	private static final String DBNAME = "local";
	
	
	private static final String TIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
				
	private static final String USUARIO = "root";
	private static final String PASSWORD = "";
	

	private static Connec instance = Connec.getInstance();
	 
	private Connection con;
	
	private Connec() {}
	
	public Connection dameConnection() {
		
		try {
			Class.forName(DRIVER);
			con =  DriverManager.getConnection(URL+"/"+ DBNAME+TIMEZONE, USUARIO, PASSWORD);
			if (!con.isClosed()) {
				
				//log.info("conectado a la base de datos");
			}
			return con;
		} catch (ClassNotFoundException e) {
			//log.error("Error de acceso al driver" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			//log.error("Error de SQL" + e.getMessage());
		}
		return null;
	}
	


	public static Connec getInstance() {
	       if (instance == null) {
	    	   instance = new Connec();
	       }
	       return instance;
	   }
		
		

}
