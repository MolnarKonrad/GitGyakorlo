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
        maxKivBemutatasa();
        minKivBemutatasa();
    }
    
    private static void maxKivBemutatasa() {
        konzolraIr("Maximum kiválasztás tétele:\n");
        maximumKivalasztas();
        konzolraIr("A legnagyobb elem indexe: " + maximumKivalasztas() + "\n\n");
    }
    
    private static void minKivBemutatasa() {
        konzolraIr("Minimum kiválasztás tétele:\n");
        minimumKivalasztas();
        konzolraIr("A legkisebb elem indexe: " + minimumKivalasztas() + "\n\n");
    }

    private static void kivalasztasBemutatasa() {
        konzolraIr("Kiválasztás tétele:\n");
        kivalasztas();
        konzolraIr("Az első páros elem indexe: " + kivalasztas() + "\n\n");
    }

    private static void eldontesekBemutatasa() {
        eldontes_1_Bemutatasa();
        eldontes_2_Bemutatasa();
    }
    
    private static void eldontes_1_Bemutatasa() {
        konzolraIr("Eldöntés 1.tétele:\n");
        eldontes_1_vanLegalabbEgy();
        konzolraIr("Van-e páratlan eleme: " + eldontes_1_vanLegalabbEgy() + "\n\n");
    }
    
    private static void eldontes_2_Bemutatasa() {
        konzolraIr("Eldöntés 2.tétele:\n");
        eldontes_2_mind();
        konzolraIr("Van-e negativ eleme: " + eldontes_2_mind() + "\n\n");
    }

    private static void linKerBemutatasa() {
        konzolraIr("Lineáris keresés tétele:\n");
        linearisKereses();
        konzolraIr("Az első 10-nél nagyobb, páratlan elem indexe: " + linearisKereses() + "\n\n");
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
        int i = 0;
        while (!(sorozat[i]%2 == 0) || (sorozat[i] == 0)) {
            i++;
        }
        return i;
    }

    private static boolean eldontes_1_vanLegalabbEgy() {
        int i = 0;
        int N = sorozat.length;
        while (i < N && !(sorozat[i] % 2 == 1)) {
            i++;
        }
        return i < N;
    }

    private static boolean eldontes_2_mind() {
        int N = sorozat.length;
        int ker = -1;
        int i = 0;
        while (i < N && (sorozat[i] < ker)) {
            i++;
        }
        return i >= N;
    }

    private static int linearisKereses() {
        int N = sorozat.length;
        int i = 0;
        while (i < N && !(sorozat[i] % 2 == 1 && sorozat[i] > 10)) {
            i++;
        }
        boolean van = i < N;
        if (i < N) {
            return i;
        } else {
            return -1;
        }        
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

}
