package classe;

public class DesafioData {

	int dia,mes,ano;
	
	DesafioData (){
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	DesafioData(int dia, int mes, int ano){
		this.ano = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
