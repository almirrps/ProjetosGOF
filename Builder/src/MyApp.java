
public class MyApp {

	public static void main(String[] args) {
		//Instancia a classe cozinha para fazer os sanduiches
		Cozinha cozinha = new Cozinha();
		
		//Builders para a instanciação dos sanduiches e construção dos métodos encapsulados
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishBuilder();
		
		//cozinha faz os respectivos sanduiches e entrega
		cozinha.fazSanduiche(b1);
		b1.getSanduiche();
		
		cozinha.fazSanduiche(b2);
		b2.getSanduiche();

	}

}
