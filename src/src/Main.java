import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZespolProjektowy zespol = new ZespolProjektowy("Dżawowi kawosze");

        Pracownik p1 = new Programista("001", "Wojciech", "Gola", 13.02, "Java", 6);
        Pracownik p2 = new Programista("002", "Tajłin", "Lanister", 500000.00, "C sharp", 2500);
        Pracownik p3 = new Programista("003", "Piotr", "Kogucik", 200.00, "C++", 20);
        Pracownik p4 = new Programista("004", "Kim", "Kardaszjan", 0.06, "it's obvious it's english, da", 1);

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(p2);
        zespol.dodajPracownika(p3);
        zespol.dodajPracownika(p4);

        System.out.println(p1);
        System.out.println(p3);

        System.out.println();
        zespol.wpiszSkladZespolu();

        System.out.println("\nŁączny koszt miesięczny: " + zespol.policzLacznyKoszt() + " zł");

        System.out.println();
        zespol.wpiszSkladZespolu();

        System.out.println("Szukanie po ID: ");
        Pracownik znaleziony = zespol.znajdzPoId("002");
        if (znaleziony != null) {
            System.out.println("Znaleziono: " + znaleziony.przedstawSie());

            if (znaleziony instanceof Tester) {
                Tester t = (Tester) znaleziony;
                t.uruchomRaportTestowy();
            }
        }
        Pracownik kopia = new Programista("001", "Marek", "Aureliusz", 32574927.62, "łaciński", 0);
        System.out.println("p1 equals kopia (to samo ID):" + p1.equals(kopia));
        System.out.println("p1 equals p2 (różne ID):" + p1.equals(p2));

    }
}