
public class MyApp {

	public static void main(String[] args) {
		//Não é possível instanciar com o new, somente com getInstance()
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
		
		//Não importa quantas janelas eu tente criar, o getInstance()
		//instancia uma única vez.
		Janela j2 = Janela.getInstance();
		j2.pack();
		j2.setVisible(true);
	}

}
