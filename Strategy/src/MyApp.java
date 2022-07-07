
public class MyApp {

	public static void main(String[] args) {
		//Cria o objeto e define o tipo de ordenação
		Vetor v = new Vetor(new BubbleSort());
		v.ordenar();
		
		//Muda o tipo de ordenação sem precisar recriar o objeto
		v.setAlgoritmo(new QuickSort());
		v.ordenar();
	}

}
