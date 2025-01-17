package EpicraftersJourney;

public abstract class Bloc implements IBloc { //implementation de l'interface
	protected int longueur;
	protected int largeur;
	protected int hauteur;
	protected String description;
	protected Couleur couleur;
    
    
    public Bloc(final int longueur, final int largeur, final int hauteur) {
    	this.description="Ceci est un bloc du jeu Epicrafter's Journey";
    	this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur; 
    }
    
  
    public String getDescription() {
		return description;
	}
	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}	
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
    
	
	public void afficherDescription() {
        System.out.println(description);
    }
	void afficherVolume() {
        System.out.println(longueur*largeur*hauteur);
    }
	
}