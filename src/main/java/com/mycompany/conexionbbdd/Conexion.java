

package com.mycompany.conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static String ip = "188.78.176.33"; 
    private static String url ="jdbc:mysql://"+ip+":3306/tienda_db?serverTimezone=UTC" ; 
    public static String pass ="123"; 
    public static String user = "root"; 
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
