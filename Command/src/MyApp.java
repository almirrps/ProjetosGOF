
public class MyApp {

	public static void main(String[] args) {

		//Criando a calculadora
		Calculadora calculadora = new Calculadora();
		
		//Criando o Invoker para enfileirar as solicitações
		Invoker invoker = new Invoker();
		
		//Adicionando valores a calculadora
		invoker.compute(new Soma(calculadora, 10));
		invoker.compute(new Soma(calculadora, 5));
		invoker.compute(new Soma(calculadora, 10));
		
		//Desfazendo as duas últimas operações
		invoker.undo(2);

	}

}
