
//Classe que envelopa os métodos dos três subsistemas
class Facade {
	
	//Os subsistemas são criados como private para não permitir o acesso direto à eles pelo usuário
	private SubsistemaUm sis1;
	private SubsistemaDois sis2;
	private SubsistemaTres sis3;
	
	//Criando os subsistemas
	public Facade(){
		sis1 = new SubsistemaUm();
		sis2 = new SubsistemaDois();
		sis3 = new SubsistemaTres();
	}
	
	//Executando os métodos dos subsistemas
	public void metodoA(){
		sis1.metodoUm();   //subsistema 1
		sis2.metodoDois(); //subsistema 2
		sis3.metodoTres(); //subsistema 3
	}
	
	public void metodoB(){
		sis3.metodoTres(); //subsistema 3
		sis2.metodoDois(); //subsistema 2
		sis1.metodoUm();   //subsistema 1
	}

}
