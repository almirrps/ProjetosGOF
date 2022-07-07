
//ConcreteDecorator - Objeto de decoração
public class Bola extends Decoracao {

	public Bola(Arvore a) {
		super(a);
	}

	public void showEnfeites() {
		super.showEnfeites();
		System.out.print("Bola, ");
	}

}
