package EpicraftersJourney;

public record Planete(String nom, double perimetre, int superficie) implements IPlanete { 

    public void afficher() {
        System.out.println("Je suis la planète " + this. nom);
    }
}
