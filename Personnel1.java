package TD3;

public class Personnel extends Personne{

	protected String adresse;
	protected float salaire;
	
	public Personnel(){
		
	}
	
	public Personnel(String nom, Byte age, String adresse, float salaire) {
		super(nom,age);
		this.adresse = adresse;
		this.salaire = salaire;
	}
	
	public Personnel(Personnel P) {
		super(P);
		this.adresse = P.adresse;
		this.salaire = P.salaire;
		
	}
	
	public void setPersonnel(String nom, Byte age, String adresse, float salaire) {
		setPersonne(nom,age);
		this.adresse = adresse;
		this.salaire = salaire;
		
	}
	
	public String getAdresse() {
		return adresse;
	}
	public float getSalaire() {
		return salaire;
	}
	public String toString() {
        return super.toString() + ", Adresse: " + adresse + ", Salaire: " + salaire;
    }
}
