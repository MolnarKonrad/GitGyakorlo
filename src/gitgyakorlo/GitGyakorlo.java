package gitgyakorlo;

import java.util.Random;

public class GitGyakorlo {
    
    private static int[] sorozat = new int[5];
    static Random rnd = new Random();

    public static void main(String[] args) {
        feladatok();
        sorozat = feltoltes(5);
    }
    
    private static int[] feltoltes(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < 5; i++) {
            tomb[i] = rnd.nextInt();
        }
        return tomb;
    }

    private static void feladatok() {
        konzolraIr("");
    }
    
    private static int osszegzes(){
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
        return 0;
    }
    
    private static int megszamlalas(){
        return 0;
    }
    
    private static int maximumKivalasztas(){
        return 0;
    }
    
    private static int minimumKivalasztas(){
        return 0;
    }
    
    private static int kivalasztas(){
        return 0;
    }
    
    private static boolean eldontes_1_vanLegalabbEgy(){
        return false;
    }
    
    private static boolean eldontes_2_mind(){
        return false;
    }
    
    private static int linearisKereses(){
        return -1;
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }    
    
}
