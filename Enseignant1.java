package TD3;

public class Enseignant extends Personnel{

	private String matiereEnseignant;
	
	public Enseignant() {
		
	}
	
	public Enseignant(String nom, byte age, String adresse, float salaire, String matiereEnseignant) {
		super(nom,age,adresse,salaire);
		this.matiereEnseignant = matiereEnseignant;
	}
	
	
	public Enseignant(Enseignant E) {
		super(E);
		this.matiereEnseignant = E.matiereEnseignant;
	}
	
	public void setEnseignant(String nom, byte age, String adresse, float salaire, String matiereEnseignant) {
        setPersonnel(nom, age, adresse, salaire);
        this.matiereEnseignant = matiereEnseignant;
    }
	
	public String getEnseignant() {
		return matiereEnseignant;
	}
	
	public String toString() {
		return super.toString() + ", Matiere : " + matiereEnseignant;
	}
}
