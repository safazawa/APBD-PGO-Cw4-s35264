import java.util.ArrayList;
import java.util.prefs.PreferenceChangeEvent;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void wpiszSkladZespolu() {
        System.out.println("ZESPÓŁ: " + nazwaProjektu + ".");
        for (Pracownik p : pracownicy) {
            System.out.println(p.przedstawSie());
        }
    }
    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.obliczKosztMiesieczny();
        }
        return suma;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik p : pracownicy) {
            if (p.pobierzIdPracownika().equals(idPracownika)) {
                return p;
            }
        }
        return null;
    }
    public void wypiszProgramistow() {
        System.out.println("Programiści");
        for (Pracownik p : pracownicy) {
            if (p instanceof Programista) {
                Programista prog = (Programista) p;
                prog.wypiszTechnologie();
            }
        }
    }
}
