
//ConcreteCommand - Classe concreta onde definimos o corpo dos métodos  
//                  do Command que farão parte da calculadora
public class Soma extends Command {

	private Calculadora calculadora;
	private int numero;
	
	public Soma(Calculadora calculadora, int numero){
		this.calculadora = calculadora;
		this.numero = numero;
	}
	
	public void execute() {
		calculadora.setValor(calculadora.getValor() + numero);
    	System.out.println(calculadora.getValor());
	}

	public void undo() {
		calculadora.setValor(calculadora.getValor() - numero);
    	System.out.println(calculadora.getValor());
	}

}
