package gitgyakorlo;

import java.util.Random;

public class GitGyakorlo {

    private static final String SEP = System.lineSeparator();
    private static int[] sorozat = new int[10];
    static Random rnd = new Random();

    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        sorozat = feltoltes(10);
        konzolraIr("A sorozat elemei:\n" + SEP);
        kiirTomb(sorozat);
        System.out.println("");
        progTetelekFelhasznalasa();
    }

    private static int[] feltoltes(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < 10; i++) {
            tomb[i] = rnd.nextInt(0, 50);
        }
        return tomb;
    }

    private static void kiirTomb(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println("");
    }

    private static void progTetelekFelhasznalasa() {
        osszegzesBemutatasa();
        megszamlalasBemutatasa();
        szelsoertekekBemutatasa();
        kivalasztasBemutatasa();
        eldontesekBemutatasa();
        linKerBemutatasa();
    }

    private static void osszegzesBemutatasa() {
        konzolraIr("Összegzés tétele:\n");
        osszegzes();
        konzolraIr("a sorozat összege: " + osszegzes() + "\n\n");
    }

    private static void megszamlalasBemutatasa() {
        konzolraIr("Megszámlálás tétele:\n");
        megszamlalas();
        konzolraIr("A sorozat páros értékeinek száma: " + megszamlalas() +"\n\n");
    }

    private static void szelsoertekekBemutatasa() {

    }

    private static void kivalasztasBemutatasa() {

    }

    private static void eldontesekBemutatasa() {

    }

    private static void linKerBemutatasa() {

    }

    private static int osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
        return osszeg;
    }

    private static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] % 2 == 0) {
                db++;
            }
        }
        return db;
    }

    private static int maximumKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] > sorozat[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int minimumKivalasztas() {
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] < sorozat[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int kivalasztas() {
        int ker = 0;
        int i = 0;
        while (!(sorozat[i] == ker)) {
            i++;
        }
        int index = i;
        return 0;
    }

    private static boolean eldontes_1_vanLegalabbEgy() {
        int N = sorozat.length;
        int ker = rnd.nextInt(0, 50);
        int i = 0;
        while (i < N && !(sorozat[i] > ker)) {
            i++;
        }
        boolean valasz = i < N;
        return valasz;
    }

    private static boolean eldontes_2_mind() {
        int N = sorozat.length;
        int ker = rnd.nextInt(0, 50);
        int i = 0;
        while (i < N && (sorozat[i] > ker)) {
            i++;
        }
        boolean valasz = i >= N;
        return valasz;
    }

    private static int linearisKereses() {
        int N = sorozat.length;
        int ker = rnd.nextInt(0, 50);
        int i = 0;
        while (i < N && !(sorozat[i] > ker)) {
            i++;
        }
        boolean van = i < N;
        if (van) {
            System.out.printf("A keresett elem (> %d):\n", ker);
            System.out.println("helye: " + i);
            System.out.println("értéke: " + sorozat[i]);
        } else {
            System.out.println("nincs a keresésnek megfelelő elem:");
            System.out.println("Nincs > " + ker);
        }
        return -1;
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

}
