
public class MyApp {

	public static void main(String[] args) {
		//Target (Alvo) - Tomada brasileira
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		//Adaptado - Plug padrão americado
		PlugAmericano plugEUA = new PlugAmericano();

		//Não é possível conectar diretamente plugEUA em tomadaBras
		//String s = tomadaBras.conecta(plugEUA);
		
		//Adapter - adaptador para conectar tomada brasileira em plug americano
		AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
		String s = tomadaModificada.conecta(plugEUA);
		
		System.out.println(s);		
	}

}
