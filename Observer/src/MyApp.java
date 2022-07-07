
public class MyApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Cria o Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		
		//Cria o Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		//Vincula o observador ao observado
		carroRoubado.addObserver(carroPolicia);
		
		//Realiza as ações do observado e automaticamente a do observador também
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.para();
	}

}
