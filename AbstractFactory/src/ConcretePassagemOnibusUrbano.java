import java.util.Calendar;

//Produto concreto de PassagemOnibusUrbano
public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano {

	public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println("Passagem de ônibus urbana: " + this.getOrigem() + 
				" para " + this.getDestino() + 
				", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
	}

}
