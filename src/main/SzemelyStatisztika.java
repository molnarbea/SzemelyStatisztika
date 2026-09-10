package main;

public class SzemelyStatisztika {
    
    public static void main(String[] args) {
        
        Program();
        
    }

    private static void Program() throws IllegalArgumentException {
        String nev = "Anna";
        int szulEv = 2003;
        
        System.out.println(koszontes(nev));
        System.out.println("Az életkorod: " + eletkor(szulEv));
        if(nyugdijig(eletkor(szulEv))<1){
            System.out.println("Már nyugdíjas vagy!");
        }else{
            System.out.println("A nyugdíjig ennyi év van hátra: " + nyugdijig(eletkor(szulEv)));
        }
        
        if(!NevHosszabbMint2Karakter(nev)){
            throw new IllegalArgumentException("A név legyen hosszabb mint 2 karakter!");
        }
        
        if(!MegfeleloEletkor(eletkor(szulEv))){
            throw new IllegalArgumentException("Nem megfelel? születési év!");
        }
        
        if(!NyugdijigEvek(nyugdijig(eletkor(szulEv)))){
            throw new IllegalArgumentException("Nem megfelel? nyugdíjas évek!");
        }
    }
    
    private static String koszontes(String nev){
        String koszontes = "Hello %s!".formatted(nev);
        return koszontes;
    }
    
    private static int eletkor(int szulEv){
        return 2026-szulEv;
    }
    
    private static int nyugdijig(int kor){
        return 65-kor;
    }
    
    //tesztek
    private static boolean NevHosszabbMint2Karakter(String nev){
        return nev.length() > 2;
    }
    
    private static boolean MegfeleloEletkor(int kor){
        return kor > 0 && kor < 100;
    }
    
    private static boolean NyugdijigEvek(int evek){
    return evek < 66;
    }
}
