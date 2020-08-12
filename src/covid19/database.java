/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADE NURJAMAN
 */
public class database {
    public String dbURL = "jdbc:postgresql://localhost:5432/rumahSakit";
    public String username ="postgres";
    public String password = "hello";
    public Connection dbCon = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    
    public database(){
        
    }
}
