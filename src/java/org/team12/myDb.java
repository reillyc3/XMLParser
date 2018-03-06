/*
    Created on : Mar 4, 2018, 11:46:26 PM
    Author     : Nick Mares & Connor Reilly
 */
package org.team12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nick Mares
 */
public class myDb {
    private String user;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
      /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
      /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
      /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
      /**
     * @return the State
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    
      /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public int store() throws SQLException, ClassNotFoundException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        
        String url="jdbc:derby://localhost:1527/db2;create=true;user=project2;password=project2";
        
        Connection con = DriverManager.getConnection(url);
        
        PreparedStatement ps = con.prepareStatement("insert into customerdata (username, email, pnum, address, city, state, zip) values(?,?,?,?,?,?,?)");
        
        ps.setString(1, user);
        
        ps.setString(2, email);
        
        ps.setString(3, phone);
         
        ps.setString(4, address);
          
        ps.setString(5, city);
           
        ps.setString(6, state);
            
        ps.setString(7, zip);
        
        
      int a =   ps.executeUpdate();
 
       if (a==1){
            return a;
       }else{
            return a;
      }
        
        
   }
}
