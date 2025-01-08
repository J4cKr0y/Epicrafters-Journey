package EpicraftersJourney;

public class Main {

	public static void main(String[] args) {
		//variables
		int num;
		num=5;
		num=10;
		final int immuable=20;

		String langage="Java";
		String phrase=langage + " est un langage de programmation.";
		System.out.println(phrase);
		//tableau
		int[] unTableauDEntier = {5,10,15,20};
		int num2dutableau;
		num2dutableau= unTableauDEntier[1];
		System.out.println(num2dutableau);
		//fonctions
		int somme = Main.addition(2,7);
		System.out.println(somme);
		decompte(5);
		affichage("Marty");
	}

	public static int addition(final int entier1, final int entier2) {
		return entier1+entier2;
	}
	
	public static void decompte(final int valeur) {
	    if(valeur >= 0) {
	        System.out.println(valeur);
	        decompte(valeur-1);
	    }
	}
	
	public static void affichage(final String nom1) {
		final String salutation="Bonjour ";
		String phrase=salutation+nom1;
		System.out.println(phrase);
	}
}
