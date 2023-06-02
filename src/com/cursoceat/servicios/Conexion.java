package com.cursoceat.servicios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;

   public Connection conectar(){
       String url = "jdbc:mariadb://localhost:3306/instituto";
       String user = "root";
       String pass = "";
       try {
           con = DriverManager.getConnection(url,user,pass);
           System.out.println("conexion exitosa");

       }catch (SQLException e){
           e.printStackTrace();
       }
       return con;
   }
}
