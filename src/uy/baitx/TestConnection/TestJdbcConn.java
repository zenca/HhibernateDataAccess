package uy.baitx.TestConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbcConn {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		String usuario="root";
		String contr="";
		
		try {
			
			System.out.println("intentando conectar con DB "+ jdbcUrl);
			Connection miConexion=DriverManager.getConnection(jdbcUrl, usuario, contr);
			System.out.println("Conexión exitosa");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		

	}
	}


