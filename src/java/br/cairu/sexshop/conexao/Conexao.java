
package br.cairu.sexshop.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Conexao {
 
      public static final void main(String[] args) {

        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasejava", "root", "");
            System.out.println("Conexão Sucedida");
        } catch (Exception e) {
            System.out.println("Falha na Conexão! ");
        }
    }

    static Connection open() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}