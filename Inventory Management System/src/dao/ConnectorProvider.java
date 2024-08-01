/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author bhask
 */
public class ConnectorProvider {
    public static Connection getCon(){
        Connection conn=null;
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","197483");
      
     }
        catch(Exception e){
                System.out.println(e);
                }
     
     return conn;
    }
}
