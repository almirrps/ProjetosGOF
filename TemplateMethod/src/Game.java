
//Classe abstrata com métodos abstratos e o método template (play)
public abstract class Game {
	
	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	public void play() {
		this.initialize();
		this.startPlay();
		this.endPlay();
	}

}
