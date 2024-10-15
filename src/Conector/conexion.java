/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conector;
import java.sql.*;
/**
 *
 * @author EiruonzOK
 */
public class conexion {
    //Conexion local
    Connection co;       
    
    public static Connection Conectar(){
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  co=DriverManager.getConnection ("jdbc:mysql://localhost/pizzeriaDB","Admin","password");
            System.out.println("CONEXION EXITOSA");
            return co;
        }  catch(SQLException ex){
            System.out.println("ERROR CON MYSQL" + ex);
        } catch(ClassNotFoundException exc){
            exc.printStackTrace();
        }
         return null;
    }
    
    public static ResultSet getTabla(String Consulta){
	Connection cn=Conectar();
	Statement st;
	ResultSet datos = null;
	try{
		st= cn.createStatement();
		datos = st.executeQuery(Consulta);
	}catch(Exception e){
		System.out.print(e.toString());
	}return datos;
}
    
}
