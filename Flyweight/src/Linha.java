
public class Linha extends Figura {
	
	public Linha(){
		super();
	}
	
	//cor é o estado extrínseco do objeto
	public void desenha(String cor) {
		System.out.println("Figura linha " + cor);
	}

}
