
public class Oval extends Figura {

	private boolean preenchido;
	
	public Oval(boolean preenchido) {
		super();
		this.preenchido = preenchido;
	}
	
	//cor é o estado extrínseco do objeto
	//preenchido é o estado intrínseco do objeto, pois é declarado e criado aqui mesmo
	public void desenha(String cor) {
		if(preenchido){
			System.out.println("Figura oval preenchida " + cor);
		} else {
			System.out.println("Figura oval não preenchida " + cor);
		}
	}

}
