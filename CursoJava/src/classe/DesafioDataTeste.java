package classe;


public class DesafioDataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				
		DesafioData n = new DesafioData();
		
		var n2 = new DesafioData(31,12,2016);
		
		String dataFormatada1 = n.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(n2.obterDataFormatada());
		
		
		n.imprimirDataFormatada();
		n2.imprimirDataFormatada();
	}

}
