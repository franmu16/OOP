//package Lez.23_09_24;
public class Main {
    public static void main(String[] args) {  //il main deve essere tipo statico perchè dobbiamo essere sicuri che il main sia raggiungibile non ci siano istanze tipo main 01:18:00 23/09
        System.out.println("Hello world!");
        //Prodotto p;   //variabile non inizializzata, variabile temporanea (non allocata)
        Prodotto p = null;   //in questo modo non alloco spazio se poi non lo uso
        boolean procedi = true;
        if(procedi) {
            System.out.println(Prodotto.getConteggioProdotti());  //valore già presente prima di instanziare il 1o prodotto
            p = new Prodotto(6,"Matita", 1.6F);    //riferimento parte memoria degli attributi  //Prodotto() non è altro che un metodo "costruttore dell'oggetto"
            p.stampaInfoProdotto();
            Prodotto p1 = new Prodotto(4, "Penna", 1.5F);
            //p1=p;   in questo modo i due oggetti puntano allo stesso elemento in memoria, 1 oggetto sarà senza riferimento e così eliminato
            p1.stampaInfoProdotto(); //Difatti stampa la stessa cosa!!!
            //Prodotto.conteggioProdotti = 5; //cosa possibile -> soluzione: INCAPSULAMENTO
            System.out.println(Prodotto.getConteggioProdotti());
        }
    }
}