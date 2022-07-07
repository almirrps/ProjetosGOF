import java.util.Calendar;

//Produto concreto de PassagemOnibusInterestadual
public class ConcretePassagemOnibusInterestadual extends PassagemOnibusInterestadual {

	public ConcretePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {	
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println("Passagem de ônibus interestadual: " + this.getOrigem() + 
				" para " + this.getDestino() + 
				", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
	}

}
