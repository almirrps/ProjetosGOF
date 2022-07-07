import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyApp {

	public static void main(String[] args) {
		//Instanciando a empresa de ônibus por meio da fábrica
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();
		
		//Emite passagens e obtendo produtos desta empresa
		PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano("São Paulo", "Campinas", new 
				GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));		
		PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("São Paulo", 
				"Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));
		
		//Exibe detalhes das passagens
		pUrbano.exibeDetalhes();		
		pInterestadual.exibeDetalhes();	
	}

}
