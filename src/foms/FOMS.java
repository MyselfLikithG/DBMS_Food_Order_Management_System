/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foms;
import java.sql.*;
/**
 *
 * @author Hp
 */
public class FOMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con=FOMS_DB_Part.getConnection("root","YOUR PASSWORD");
        if(con !=null){
            System.out.println("Successfully connected!");
        Login_form.main(null);
        }
        else
            System.out.println("Error while connecting to Database!");
    }
    
}
