
public class MyApp {

	public static void main(String[] args) {
		//Criar objeto zoo
		Zoo zoo = new ZooImpl();
		
		//Adiciona animais ao zoológico
		zoo.addAnimal(new Animal("tigre", "mamifero"));
		zoo.addAnimal(new Animal("baleia", "mamifero"));
		zoo.addAnimal(new Animal("pinguim", "ave"));
		zoo.addAnimal(new Animal("tucano", "ave"));
		zoo.addAnimal(new Animal("jacaré", "reptil"));
		zoo.addAnimal(new Animal("lagarto", "reptil"));
		zoo.addAnimal(new Animal("leão", "mamifero"));
		zoo.addAnimal(new Animal("pica-pau", "ave"));
		zoo.addAnimal(new Animal("elefante", "mamifero"));
		zoo.addAnimal(new Animal("águia", "ave"));
		
		System.out.println("Listando todas as aves:");
		AveIterator ai = new AveIterator(zoo);

		while(ai.hasNext()){
			System.out.println(ai.next().getNome());
		}

		
		System.out.println("Listando todos os répteis:");
		ReptilIterator ri = new ReptilIterator(zoo);
		
		while(ri.hasNext()){
			System.out.println(ri.next().getNome());
		}

		
		System.out.println("Listando todos os mamíferos:");
		MamiferoIterator mi = new MamiferoIterator(zoo);
		
		while(mi.hasNext()){
			System.out.println(mi.next().getNome());
		}

	}

}
