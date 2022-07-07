import java.util.Observable;

//Classe observada que extende Observable e implementa carro
@SuppressWarnings("deprecation")
public class CarroRoubado extends Observable implements Carro {

	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado segue em frente.");
		this.mudaEstado();
	}

	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado vira a direita.");
		this.mudaEstado();
	}

	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado vira a esquerda.");
		this.mudaEstado();
	}
	
	public void para() {
		acao = "pára";
		System.out.println("Carro roubado pára.");
		this.mudaEstado();
	}
	
	//Método que informa a mudança que ocorreu no observado
	public void mudaEstado(){
		setChanged(); // Mudou o estado
		notifyObservers(acao); // Notifica os observadores
	}
	
}
