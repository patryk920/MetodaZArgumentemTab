/*Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.

 */
public class Metoda {

    private static int suma(int tab[]) {

        int wynik = 0;
        for (int i : tab) {
            wynik += i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        System.out.println(suma(tab));
    }

}
