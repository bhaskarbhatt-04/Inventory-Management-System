/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author bhask
 */
public class tables {

    public static void main(String args[]) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = ConnectorProvider.getCon();
            st = conn.createStatement();
            //st.executeUpdate("Create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50)");
            //st.executeUpdate("insert into appuser(userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','SuperAdmin','8755300911','superadmin@gmail.com','admin','India','Active')");
            //st.executeUpdate("Create table category(category_pk int AUTO_INCREMENT primary key, name varchar(200))");

            //st.executeUpdate("Create table product(product_pk int AUTO_INCREMENT primary key, name varchar(200),quantity int,price int,description varchar(500),category_fk int)");
            //st.executeUpdate("Create table customer(customer_pk int AUTO_INCREMENT primary key, name varchar(200),mobileNumber varchar(50),email varchar(200))");
            st.executeUpdate("Create table orderDetails(order_pk int AUTO_INCREMENT primary key, orderId varchar(200),customer_fk int,orderDate varchar(200),totalPaid int)");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (Exception e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }

        }

    }
}
