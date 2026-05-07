public class Tester  extends Pracownik{
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super (idPracownika,imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }
    @Override
    public double obliczKosztMiesieczny() {
        double premia = czyAutomatyzujacy ? getStawkaBazowa() * 0.3 : 0;
        return getStawkaBazowa() + premia;
    }

    @Override
    public String przedstawSie(){
        return "Tester: " + getImie() + " " + getNazwisko() + ", automatyzujący: " + czyAutomatyzujacy + ", scenariusze: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestowy() {
        System.out.println("Raport testowy dla " + getImie() + " " + getNazwisko() + ": " + liczbaScenariuszy + "scenariuszy, " + (czyAutomatyzujacy ? "testy automatyczne" : "testy manualne"));
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public String toString() {
        return "Tester: " + super.toString() + ", automatyzujący=" + czyAutomatyzujacy + ", scenariusze=" + liczbaScenariuszy + ".";
    }
}
