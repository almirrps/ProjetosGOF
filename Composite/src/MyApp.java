
public class MyApp {

	public static void main(String[] args) {
		//Criando programadores (folhas)
		Programador pEstagiario = new Programador("Nivel 3 - José", 900);
		Programador pJunior = new Programador("Nivel 3 - Pedro", 2900);
		Programador pSenior = new Programador("Nivel 3 - Ricardo", 3900);
		
		//Criando Gerentes (todo-parte)
		Gerente g3 = new Gerente("Nivel 1 - João", 15000);
        Gerente g2 = new Gerente("Nivel 2 - Maria", 10000);
        Gerente g1 = new Gerente("Nivel 2 - Carlos", 5000);
        
        //Montando a estrutura em árvore
        
        //Carlos superviosiona os programadores José e Pedro
        g1.add(pEstagiario);
        g1.add(pJunior);
        
        //Maria superviosiona o programador Ricardo
        g2.add(pSenior);
        
        //João é raiz da estrutura em árvore
        g3.add(g1);
        g3.add(g2);
        
        //Mostrando a arvore hierárquica conforme montada
        g3.print();
	}

}
