package EpicraftersJourney;
import java.lang.reflect.Array;


//<T> = type générique. Tant que l’objet n’est pas instancié, on ne sait pas quel type sera utilisé.  
public class Liste<T> {
    
    private T[] liste;
    
    @SuppressWarnings("unchecked")
	public Liste(Class<T> classe, int quantite) {
        this.liste = (T[]) Array.newInstance(classe, quantite);
    }
    
    public void add(int indice, T valeur) {
        this.liste[indice] = valeur;
    }
    
    public T get(int indice) {
        return this.liste[indice];
    }
    
}

/* C'est à dire qu'au lieu d'avoir un LinstString + un ListeBloc, on utilise un Liste générique avec <T>

public class ListeString {
private String[] liste;
public void ListeMotCle(int quantite) {
    this.liste = new String[quantite];
}
public void add(int indice, String valeur) {
    this.liste[indice] = valeur;
}
public String get(int indice) {
    return this.liste[indice];
}
}

public class ListeBloc {
private Bloc[] liste;
public ListeBloc(int quantite) {
    this.liste = new Bloc[quantite];
}
public void add(int indice, Bloc bloc) {
    this.liste[indice] = bloc;
}
public Bloc get(int indice) {
    return this.liste[indice];
}
} */