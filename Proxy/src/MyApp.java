
public class MyApp {

	public static void main(String[] args) {
		//Criando o objeto por meio do objeto controlador
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        
        //Visualizando objetos criados
        image1.displayImage();
        image2.displayImage();
        
        //Se um objeto é chamado novamente, o controlador somente chama ele
        //pois neste momento ele já sabe onde está o objeto controlado e não
        //precisa carregá-lo novamente.
        image1.displayImage();
	}

}
