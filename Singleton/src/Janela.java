import java.awt.Dimension;
import javax.swing.JFrame;

//Exemplo Singleton
public class Janela extends JFrame {
	
	private static Janela j = null;
	
	//Definindo o construtor da classe como private para impedir que utilize diretamente o new
	private Janela() {
		setPreferredSize(new Dimension(640, 480));
	}
	
	//Método estático para conseguir instanciar o objeto
	public static Janela getInstance() {
		if (j==null) {
			j = new Janela();
		}
		
		return j;
	}

}
