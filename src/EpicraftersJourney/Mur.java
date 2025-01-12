package EpicraftersJourney;

public class Mur extends Bloc {
	
    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
// appel du constructeur de la classe mère avec le pot clef super
    	super(longueur, largeur, hauteur); 
    	this.porteur = porteur;
        }
        
        public void afficherBloc() {
            System.out.println(
                super.longueur + " " +
                super.largeur + " " +
                super.hauteur + " " +
                this.porteur);
        }
        
        @Override
        public void afficherDescription() {
            System.out.println("Ceci est un mur !");
        }
}