package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class AltualizarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Informe o código da Pessoa: ");
		int codigo = entrada.nextInt();
		
		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSQL  = "UPDATE pessoas SET nome = ? WHERE codigo = ?"; 
		
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é " +p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			
			stmt.close();
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1,novoNome);
			stmt.setInt(2,  codigo);
			stmt.execute();
		
			System.out.println("Nome atualizado com Sucesso !!!");
		}else {
			System.out.println("Código invalido, tente novamente. ");
		}
					
	  conexao.close();
	  entrada.close();
	 
	}

}
