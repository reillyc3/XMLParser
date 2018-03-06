package org.team12;

import java.sql.*;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class MysqlCon{  
public static void main(String args[]){  
    
try{  
Class.forName("com.mysql.jdbc.Driver");  

String dbUrl="jdbc:mysql://localhost/RideShare?user=root&password=Chairman19113$";

Connection conn = DriverManager.getConnection(dbUrl);

//Statement stmt=conn.createStatement();  
conn.createStatement()
    .execute("CREATE TABLE vehicle(\n" +
         "  id integer primary key auto_increment,\n" +
         "  modelType varchar(25) not null,\n" +
         "  makeType varchar(50) not null,\n" +
         "  licensePlate varchar(8) not null,\n" +
         "  year integer(4)\n" +
         ")");
 
conn.close();  
}catch(Exception e){ 
    
    System.out.println(e);
    }  
}  

}  


