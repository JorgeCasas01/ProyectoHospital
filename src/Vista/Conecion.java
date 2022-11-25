/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.sql.*;
/**
 *
 * @author juanl
 */
public class Conecion {
    public static Connection enlaze;
    public static final String driver ="com.mysql.cj.jdbc.Driver";
    public static final String user ="Juan";
    public static final String passwork = "Perro16tonto";
    public static final String url = "jdbc:mysql://localhost:3306/hospital";
    
    public Connection conectar(){
        enlaze = null;
        try {
            Class.forName(driver);
            enlaze = DriverManager.getConnection(url, user, passwork);
            if(enlaze!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        return enlaze;
    }
}
