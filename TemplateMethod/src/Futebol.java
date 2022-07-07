
//Classe Futebol extende de Game e não precisa implementar metodo play
public class Futebol extends Game {

	public void initialize() {
		System.out.println("11 jogadores.");		
	}

	public void startPlay() {
		System.out.println("Inicia a partida de futebol.");
	}

	public void endPlay() {
		System.out.println("Termina a partida de futebol.");
	}

}
