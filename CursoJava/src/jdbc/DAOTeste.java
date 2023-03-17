package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		System.out.println(dao.incluir(sql, "José da Silva"));
		System.out.println(dao.incluir(sql, "Jonas da Silva"));
		System.out.println(dao.incluir(sql, "Jota da Silva"));
		
		
		dao.close();
	}

}
