import java.util.Calendar;

//Fábrica concreta do produto PassagemOnibusUrbano
public class EmpresaOnibusUrbano extends Empresa {

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}
}
