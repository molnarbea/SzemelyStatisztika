package main;

public class Statisztika {
    public static void main(String[] args) {
        Szemely szemely = new Szemely("Anna", 2002);
        String[] koszones = {"Hello ", "Szia ", "Üdvözöllek "};
        
        System.out.println(koszontes(koszones) + szemely.getNev() + "!");

        System.out.println("Az életkorod: " + eletkor(szemely.getSzulEv()));

        if (nyugdijig(eletkor(szemely.getSzulEv())) < 1) {
            System.out.println("Már nyugdíjas vagy!");
        } else {
            System.out.println("A nyugdíjig ennyi év van hátra: " + nyugdijig(eletkor(szemely.getSzulEv())));
        }
    }
    
    
    private static void koszontes(String nev) {
        koszones(nev, false);
    }
    
    private static void koszones(String nev, boolean keveres) {
        String[] koszonesek = {"Szia", "Hello", "Jó napot"};
        
        String koszones=koszonesek[0];
        if (keveres) {
            int i = (int) (Math.random() * koszonesek.length);
            koszones = koszonesek[i];
        }
        
        System.out.println(koszones + "!" + nev + "!");
        }
    
    private static int eletkor(int szulEv) {
        return 2026 - szulEv;
    }
    
    private static int nyugdijig(int kor) {
        return 65 - kor;
    }
}
