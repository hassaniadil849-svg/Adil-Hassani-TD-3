package TD3;

public class Personne {
	protected String nom;
	protected byte age;
	
	public Personne() {
		
	}
	
	public Personne(String nom, byte age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Personne(Personne P) {
		this.nom = P.nom;
		this.age = P.age;
	}
	
	public void setPersonne(String nom, byte age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public Byte getAge() {
		return age;
	}
	
	public String toString() {
        return "Nom: " + nom + ", Âge: " + age;
    }
}
