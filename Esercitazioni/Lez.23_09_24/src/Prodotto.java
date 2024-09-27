public class Prodotto {
    //sezione attributi
    private final int codiceProdotto;   //private final int codiceProdotto = 1: inizializzazione in linea, cosa possibile ma sconsigliata in presenza di costruttore
    String descrizioneProdotto; //in Java stringa non è un tipo primitivo
    float costoProdotto;
    private static int conteggioProdotti;  //variabile classe, comune a tutti gli oggetti di questa classe

    public Prodotto(int codiceProdotto, String descrizioneProdotto, float costoProdotto) {
        this.codiceProdotto = codiceProdotto;
        this.descrizioneProdotto = descrizioneProdotto;    //permette un inizializzazione diversa da null
        this.costoProdotto = costoProdotto;
        conteggioProdotti++;
    }
    //sezione metodi
    void stampaInfoProdotto(){

        System.out.println(codiceProdotto);
        System.out.println(descrizioneProdotto);
        System.out.println(costoProdotto);

    }
//    void setCodiceProdotto(int codiceProdotto){   NON UTILIZZABILE IN PRESENZA DI TIPO INT FINAL
//        this.codiceProdotto = codiceProdotto;   //this per risolvere l'ambiguità
//    }
    float getCostoProdotto() {
        return this.costoProdotto;
    }
    public static int getConteggioProdotti(){
        //non posso accedere a un contesto "dinamico" (es. this.descrizioneProdottto = "Nullo") perchè potrei non avere istanziato niente
        return Prodotto.conteggioProdotti;
    }
}
