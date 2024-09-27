//package Lez.20_09_24;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Prodotto p;   //variabile non inizializzata, variabile temporanea (non allocata)
        Prodotto p = null;   //in questo modo non alloco spazio se poi non lo uso
        boolean procedi = true;
        if(procedi) {
            p = new Prodotto();    //riferimento parte memoria degli attributi  //Prodotto() non è altro che un metodo "costruttore dell'oggetto"
            p.setCodiceProdotto(30);   //se non inizializzati sono a NULL
            p.descrizioneProdotto = "Penna";
            p.costoProdotto = 1.5F;  //non è più possibile farlo se l'attr. è privato
            p.stampaInfoProdotto();
            System.out.println(p.getCostoProdotto());
        }
    }
}