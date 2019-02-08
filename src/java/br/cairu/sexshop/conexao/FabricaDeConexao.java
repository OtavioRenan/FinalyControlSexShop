
package br.cairu.sexshop.conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class FabricaDeConexao {
    
    public Connection conn;
    public Statement stmt;
    public ResultSet rs;

    String url = "jdbc:mysql://localhost:3306/databasejava";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";

    public void abrirConexao() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            System.out.println("Conexão Bem Secedida...");
           

        } catch (Exception e) {
            System.out.println("Erro ao Conectar...");
           
        }
    }

    public static void main(String[] args) {
        FabricaDeConexao fab = new FabricaDeConexao();
        fab.abrirConexao();
    }

    public void Close() {
        throw new UnsupportedOperationException("Not supported yet.");     }
    
}