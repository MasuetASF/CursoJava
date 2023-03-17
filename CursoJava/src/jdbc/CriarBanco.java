package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		
		  final String url =
		  "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; final
		  String usuario = "root"; final String senha = "admin";
		  
		  Connection conexao = DriverManager.getConnection(url, usuario, senha);
		  
		  
// 	o c�digo acima pode ser substituido por:		  
//		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_2");
		
		
		System.out.println("Banco criado com sucesso");
		conexao.close();
	}

}
