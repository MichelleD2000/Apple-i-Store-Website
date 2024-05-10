/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopassignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Oopassignment3 {

  public static Connection c() {
        String username = "root";
        String password = "root";
          
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopassignment3?zeroDateTimeBehavior=CONVERT_TO_NULL",username,password);
          return c;
          
      }catch(Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
      return null;
  }
}
