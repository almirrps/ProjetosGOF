
//Esta classe implementa a classe Cloneable existente em Java para clonar objetos
public abstract class NotaMusical implements Cloneable {

	//Sobrepondo o método clone da classe Cloneable para controlar a clonagem do objeto
	public NotaMusical clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return (NotaMusical) clone;
	}
	
	public abstract void desenha();

}
