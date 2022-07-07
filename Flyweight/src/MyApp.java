
public class MyApp {

	public static void main(String[] args) {

		//Criando uma figura linha e atribuindo uma cor - este objeto possui um estado extrínseco
		Figura f = FiguraFactory.getFigura("linha");
		f.desenha("amarela");
		
		//Criando uma figura oval sem preenchimento - este objeto possui um estado intrínseco
		f = FiguraFactory.getFigura("oval não preenchida");
		f.desenha("vermelha");

	}

}
