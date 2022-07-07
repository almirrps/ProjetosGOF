import java.util.Calendar;

//Fábrica abstrata dos produtos PassagemOnibusUrbano e PassagemOnibusInterestadual
public abstract class EmpresaOnibus {

	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida);
	
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida);
	
}
