
public class MyApp {

	public static void main(String[] args) {

        //Criando o objeto concreto ArvoreNatal com base no objeto abstrato Arvore
		Arvore a = new ArvoreNatal();
		
		//Adicionando responsabilidades ao objeto ArvoreNatal
		a = new Estrela(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new Bola(a);
		a = new PiscaPisca(a);
		
		//Mostrando o objeto ArvoreNatal com suas novas responsabilidades
		a.showEnfeites();
	}

}
