package TD3;

public class TestPersonnel {

    public static void main(String[] args) {
        Personne p1   = new Personne("Yassine", (byte)22);
        Personnel pers1 = new Personnel("Imane", (byte)28, "Marrakech", 9500);
        Enseignant ens1 = new Enseignant("Hicham", (byte)35, "Tanger", 13500, "Python");

        Personne[] tab = { p1, pers1, ens1 };

        for (Personne p : tab) {
            System.out.println(p.toString());
        }
    }

}
