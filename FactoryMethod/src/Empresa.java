import java.util.Calendar;

//Fabrica abstrata do produto Passagem
public abstract class Empresa {
	
	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);

}
