package EpicraftersJourney;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//variables
		int num;
		num=5;
		num=10;
		final int immuable=20;
		System.out.println(num+immuable);

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
		commentLaMeteo("soleil");
		String film1="La petite sirène";
		String film2="Indiana Jones";
		System.out.println("La catégorie de "+ film1 +" est : " + categorieDeFilm(film1));
		System.out.println("La catégorie de "+ film2 +" est : " + categorieDeFilm(film2));
		afficherLangage2Prog();
		
		int[] chiffreDontOnDoitCompterLesZero = {26, 10, 1985, 0, 12, 11, 1955};
		combienYaDeZero(chiffreDontOnDoitCompterLesZero);
/* On ne peut plus appeler (instance) Bloc après l'avoir rendu abstrait
//class
		Bloc unBloc = new Bloc(2,3,4); //instanciation avec le mot clé new
		unBloc.afficherDescription();
		unBloc.afficherVolume();
*/		
//heritage
		Mur unBlocMur = new Mur(10,10,5,true); //instanciation avec le mot clé new
        unBlocMur.afficherBloc();
        unBlocMur.afficherDescription();
        unBlocMur.afficherVolume();
        
//injection de dépendance
    	IBloc murCostaud = new Mur(100,100,100,true); // un mur costaud!
        Rempart rempartNord = new Rempart(murCostaud); // injection de l’instance mur dans l’instance pour le rempart au nord

// utilisation de record (class immuable)
        var terre = new Planete("Terre", 40075.017, 510067420); 
        System.out.println(terre.nom()); // affiche Terre
        terre.afficher();
        
// utilisation de l'enum Couleur (liste)
        Couleur choixCouleur = Couleur.VERT;
        switch(choixCouleur) {
        case BLEU -> System.out.println("Pour des blocs représentant l'eau");
        case VERT -> System.out.println("Pour des blocs représentant l’herbe, les feuilles, etc.");
        case GRIS -> System.out.println("Pour des blocs représentant le sol ou un mur");
        case MARRON -> System.out.println("Pour des blocs représentant la terre ou un toit");
        case NOIR -> System.out.println("Pour des blocs représentant une roche");
        default -> System.out.println("Je ne sais pas à quoi sert cette couleur.");
        }
                
        List<Integer> quantiteBlocsUtilises= new ArrayList<Integer>();
        quantiteBlocsUtilises.add(1);
        quantiteBlocsUtilises.add(3);
        quantiteBlocsUtilises.add(1); // doublon autorisé
        for(Integer quantite : quantiteBlocsUtilises) {
        	System.out.println(quantite);
        }
        quantiteBlocsUtilises.remove(Integer.valueOf(3));                               

        Set<String> motsCles = new LinkedHashSet<String>(); //LinkedHashSet maintien l'ordre des elements
        motsCles .add("Cabane");
        motsCles .add("Cabane"); // doublon non autorisé
        motsCles .add("Muraille");       
        for(String motCle : motsCles) {
        	System.out.println(motCle);
        }                    

        Set<String> motsCles2 = new LinkedHashSet<String>();
        motsCles2.add("Cabane");
        for(String motCle2 : motsCles2) {
        	System.out.println(motCle2);
        }    
        if(motsCles2.contains("Cabane")) {
        	System.out.println("Le mot clé Cabane est présent !");
        	motsCles2.remove("Cabane");
        }
                            
        Map<Bloc, Integer> quantiteBloc= new HashMap<Bloc, Integer>();
        quantiteBloc.put(new Mur(1,1,1,true), 4);
        quantiteBloc.put(new Porte(1,1,1,false), 4);       
        Set<Bloc> cles = quantiteBloc.keySet();
        for(Bloc bloc : cles) {
        	Integer valeur = quantiteBloc.get(bloc);
        	System.out.println(bloc.getClass().getName() + " : " + valeur);
        }
            
           
       Kit kitDeDemarrage = new Kit();
       kitDeDemarrage.afficherKit();


       Kit kitDefectueux = new Kit();
       kitDefectueux.getMotsCles().remove("Cabane");
       kitDefectueux.getMotsCles().remove("Muraille");
       try {
    	   Set<String> MotsClesDefectueux = kitDefectueux.getMotsCles();
    	   System.out.println(MotsClesDefectueux);
          } catch (NullPointerException exception) {
        	  System.out.println("Liste de mots clés indisponible dans kitDefectueux");
          }
    	  
           
       
        
        
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
	
//	structure itérative switch
	public static void commentLaMeteo(final String meteo) {
		switch(meteo) {
		case "soleil" -> System.out.println("Beau temps");
        case "nuage" -> System.out.println("Couvert");
        case "pluie" -> System.out.println("Mauvais temps");
        default -> System.out.println("Je ne sais pas.");
		}
	}
	
	public static String categorieDeFilm(final String film) {
	    var resultat = switch (film) {
	        case "Star Wars" -> "Science fiction";
	        case "Blanche neige", "La petite sirène" -> "Disney";
	        case "Indiana Jones" -> {
	            String categorie = "Aventure";
	            yield categorie;
//Si les instructions sont dans un bloc { } le mot-clé yield doit être utilisé.
	        }
	        default -> "Inconnu";
	    };
	    return resultat;
	}
	
//	structure itérative for
	public static void afficherLangage2Prog() {
	    List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
	    for (String nomDUnLangage : nomsDesLangages) {
	        System.out.println(nomDUnLangage);
	    }
	}
	
	public static void combienYaDeZero(final int[] tableau) { 
		int cpt = 0;
//Bouclez sur chaque case.
		for (int chiffre : tableau) {
//Si la valeur est égale à 0, incrémentez une variable nommée cpt. 
	        if (chiffre == 0)
	        	{
	        	cpt++;
	        	}
	    }
//Après l’exécution de la boucle, afficher la variable cpt.
	System.out.println(cpt);
	}
}
