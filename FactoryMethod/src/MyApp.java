import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyApp {

	public static void main(String[] args) {
		//Instanciado as empresas de ônibus por meio das fábricas
		Empresa viacaoABCLocal = new EmpresaOnibusUrbano();
		Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();
		
		//Emitindo passagens e obtendo os produtos destas empresas
		Passagem pUrbano = viacaoABCLocal.emitePassagem("São Paulo", "Campinas", new
				GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));
		Passagem pInterestadual = viacaoXYZInter.emitePassagem("São Paulo", "Rio de Janeiro", new 
				GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

		//Exibindo detalhes das passagens
		pUrbano.exibeDetalhes();
		pInterestadual.exibeDetalhes();
	}

}
