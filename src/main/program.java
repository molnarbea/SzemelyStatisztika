
package main;

import java.io.IOException;


public class program {

    public static void main(String[] args) {
        Program();
        
    }

    private static void Program() throws IllegalArgumentException {
        int a = 5;
        int b = 3;
        int c = 6;
        
        int k = kerulet(a,b,c);
        double t = terulet(a,b,c);
        
        String adat = "A %d, %d, %d oldalú háromszög".formatted(a,b,c);
        adat += "\nKerülete: %d, területe: %.3f".formatted(k,t);
        
        megjelenites(adat);
        if(!(PozitivSzam(a)&&PozitivSzam(b)&&PozitivSzam(c))){
            throw new IllegalArgumentException("Nem lehet negatív szám!");
        }
        if(!SzerkezthetoHaromszog(a, b, c)){
            throw new IllegalArgumentException("Nem szerkezthet?!");
        }
    }

    private static int kerulet(int a, int b, int c) {
        return a+b+c;
    }

    private static double terulet(int a, int b, int c) {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    private static void megjelenites(String adat) {
        System.out.println(adat);
    }
    
    //tesztek
    private static boolean PozitivSzam(double szam){
        return szam>0;
    }
    
    private static boolean SzerkezthetoHaromszog(int a, int b, int c){
        return a+b > c && a+c > b && b+c > a;
    }
}