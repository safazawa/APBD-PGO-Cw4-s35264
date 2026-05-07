public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }
    @Override
    public double obliczKosztMiesieczny() {
        double premia = liczbaRepozytoriow > 4 ? getStawkaBazowa() * 0.35 : 0;
        return getStawkaBazowa() + premia;
    }

    @Override
    public String przedstawSie() {
        return "Programista: " + getImie() + " " + getNazwisko() + ", język: " + glownyJezyk + ", liczba repozytoriów: " + liczbaRepozytoriow;
    }
    public void wypiszTechnologie() {
        System.out.println(getImie() + " programuje w: " + glownyJezyk);
    }
    @Override
    public String toString() {
        return "Programista: " + super.toString() + ", język=" + glownyJezyk + ", liczba repozytoriów= " + liczbaRepozytoriow + ".";

    }

}
