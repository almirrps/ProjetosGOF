
//Command - classe abstrata onde definimos os métodos que farão o Undo e Redo 
public abstract class Command {

	public abstract void execute();
	public abstract void undo();

}
