

package com.mycompany.conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static String url ="jdbc:mysql://188.78.176.33:3306/tienda_db?serverTimezone=UTC" ; 
    private static String pass ="123"; 
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
