package thisKeywordpkg;

public class SuperCallingWithMultilevel extends Place{			//main class
	
	SuperCallingWithMultilevel(){
		System.out.println("Constructor Name");
	}
	public static void main(String[] args) {										//psvm
		new SuperCallingWithMultilevel();
	}
}

class Place extends Animal{														//supercalling class
	Place(){
		System.out.println("Constructor place");
	}
}

class Animal extends Thing{												//supercalling class
	public Animal() {
		System.out.println("Constructor Animal");
	}
}

class Thing{																				//supercalling class
	Thing(){
		System.out.println("Constructor thing");
	}
}
