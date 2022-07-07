
//Classe que define o objeto e seus métodos para coletar e ordenar os dados
public class Vetor {

	private AlgoritmoOrdenacao algoritmo;
	
	public Vetor(AlgoritmoOrdenacao algoritmo){
		this.algoritmo = algoritmo;
	}

	public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
		this.algoritmo = algoritmo;
	}
	
	public void ordenar() {
		algoritmo.sort();
	}

}
