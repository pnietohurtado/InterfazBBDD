

package com.mycompany.conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static String url ="jdbc:mysql://localhost:3306/tienda_db?serverTimezone=UTC" ; 
    private static String pass = "Med@c"; 
    private static String user = "root"; 
    private static Connection con; 
    
    public static Connection getConnection()throws SQLException{
        if(con == null){
            try{
                con = DriverManager.getConnection(url,user,pass ); 
                
                
            }catch(Exception e){}
        }
        return con; 
    }
}
