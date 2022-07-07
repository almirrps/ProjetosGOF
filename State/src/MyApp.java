
public class MyApp {

	public static void main(String[] args) {
		//Criando o objeto 
		Pato p = new Pato();

		//Apresenta um comportamento para do pato
		p.voar();

		//Altera o comportamento de voar
		p.setComportamentoVoar(new NaoVoar());
		
		//Apresenta os comportamentos alterados e não alterados
		p.voar();
		p.grasnar();

	}

}
