
public class MyApp {

	public static void main(String[] args) {
		//Carregando os diferentes tipos de notas musicais
		Partitura.carregaNotas();

		//Compondo a canção
		//Se a nota não existir ele cria, se existir ele clona
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Mi").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
	}

}
