/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payrollSystem.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
  *
 * @author acer
 */
public class DBConnection {
    private Connection connection ;
    private static DBConnection dBConnection;
    private DBConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{
        Class.forName("com.mysql.jdbc.Driver"); 
        
        File file = new File("resources/application.properties");
        FileReader fileReader = new FileReader(file);
        
        Properties properties = new Properties();
        properties.load(fileReader);
        
        String ip = properties.getProperty("ip");
        String port = properties.getProperty("port");
        String db = properties.getProperty("db");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        
        String jdbcURL = "jdbc:mysql://" + ip + ":" + port + "/" + db;
        
        //System.out.println(jdbcURL);
        
        connection=DriverManager.getConnection(jdbcURL, username,password);
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException, IOException{
        if(dBConnection==null){
            dBConnection=new DBConnection();
       }
        return dBConnection;
   }
    public Connection getConnection(){
          return connection;
    
}
   }



 












































































































































































