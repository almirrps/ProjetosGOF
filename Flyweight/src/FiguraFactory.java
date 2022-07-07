import java.util.HashMap;

public class FiguraFactory {

	//Tabela de Hash
	private static final HashMap<String, Figura> figuras = new HashMap<String, Figura>();
	 
    public static Figura getFigura(String nome) {
    	//Consultando a tabela de Hash
        Figura fig = figuras.get(nome);
 
        //Se a figura não existe na tabela de Hash
        if (fig == null) {
        	
        	//A figura é instanciada
            if (nome.equals("oval preenchida")) {
            	fig = new Oval(true);
            } else if (nome.equals("oval não preenchida")) {
            	fig = new Oval(false);
            } else if (nome.equals("linha")) {
            	fig = new Linha();
            }
            
            //E incluida na tabela de Hash
            figuras.put(nome, fig);
        }
        return fig;
    }

}
