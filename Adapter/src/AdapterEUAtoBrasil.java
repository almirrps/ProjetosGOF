
//Adapter (Adaptador) - adapta tomada brasileira com plug americano
public class AdapterEUAtoBrasil extends TomadaBrasileira {

	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}

}
