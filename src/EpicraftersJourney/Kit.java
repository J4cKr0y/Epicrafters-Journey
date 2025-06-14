package EpicraftersJourney;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {
	
	//List init
	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<String>();
	
	public Kit() {
		
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Porte(1, 2, 2, true));
		
		motsCles.add("Cabane");
		motsCles.add("Muraille");
	}
	
	public void afficherKit() {
		System.out.println("Nombre de blocs dans le kit : " + blocs.size());
		System.out.print("Liste des mots clés du kit : ");
		for(String motCle : motsCles) {
			System.out.print(motCle + " ");
		}
	}
	
	public Set<String> getMotsCles() {
        return motsCles;
    }
    
    public Set<IBloc> getBlocs() {
        return blocs;
    }

	

}




/*public class Kit {
    
    private Liste<Bloc> blocs;
    private Liste<String> motsclés;
    
    public Kit() {
        Liste<Bloc> blocs = new Liste<Bloc>(Bloc.class, 5);
        blocs .add(0, new Mur(1,1,1,true));
        blocs .add(1, new Mur(1,1,1,true));
        blocs .add(2, new Mur(1,1,1,true));
        blocs .add(3, new Mur(1,1,1,true));
        blocs .add(3, new Porte(1,1,1,false));
        
        Liste<String> motsclés= new Liste<String>(String.class, 2);
        motsclés.add(0, "cabane");
        motsclés.add(1, "muraille");
    }
}*/