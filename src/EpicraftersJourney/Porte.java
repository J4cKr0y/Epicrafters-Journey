package EpicraftersJourney;

public class Porte extends Bloc {
	private boolean verrouille;
	
	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille) {
		// appel du constructeur de la classe mère avec le pot clef super
		    	super(longueur, largeur, hauteur); 
		    	this.verrouille = verrouille;
		        }
	
	public boolean estVerrouillee() {
    	return verrouille;
    }	
	
	@Override
    public void afficherDescription() {
        System.out.println("Ceci est une porte !");
    }
}
