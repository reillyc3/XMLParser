<%-- 
    Created on : Mar 4, 2018, 11:46:26 PM
    Author     : Nick Mares & Connor Reilly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Team 12: Customer Data</title>
    </head>
    <body>
        <h1 align="center"></h1>
      
        <jsp:useBean id="myBean" scope="session" class="org.team12.myDb" />
        <jsp:setProperty name="myBean" property="user"/>
        <jsp:setProperty name="myBean" property="email"/>
        <jsp:setProperty name="myBean" property="phone"/>
        <jsp:setProperty name="myBean" property="address"/>
        <jsp:setProperty name="myBean" property="city"/>
        <jsp:setProperty name="myBean" property="state"/>
        <jsp:setProperty name="myBean" property="zip"/>
        
        <h1 align="center">
            <%--
            This is not working just yet...could just scrap it, 
            but i was looking for something to tell the user
            there was an error.
            --%>
            <%
                        int a = myBean.store();
                        if(a==1){
                            out.println("Username/Password Accepted.");
                            
                        }else{
                            out.println("Username/Password NOT Accepted.");
                        }
            %>
        </h1>
        
        <table border="1" align="center">
            <thead>
                <tr>
                    <td>User Information:</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><jsp:getProperty name="myBean" property="user" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="email" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="phone" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="address" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="city" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="state" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="myBean" property="zip" /></td>
                </tr>
            </tbody>
        </table>                   
    </body>
</html>
