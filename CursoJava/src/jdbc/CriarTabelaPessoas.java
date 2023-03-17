package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	public static void main(String[] args) throws SQLException {
		
		String sql= "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		Connection conexao = FabricaConexao.getConexao();
		Statement stm = conexao.createStatement();
		stm.execute(sql);
		
		System.out.println("Tabela criado com sucesso");
		conexao.close();
	}
}
