public class Prodotto {
    //sezione attributi
    private final int codiceProdotto;   //private final int codiceProdotto = 1: inizializzazione in linea, cosa possibile ma sconsigliata in presenza di costruttore
    String descrizioneProdotto; //in Java stringa non è un tipo primitivo
    float costoProdotto;
    private static float somma = 0F;  //variabile classe, comune a tutti gli oggetti di questa classe

    public Prodotto(int codiceProdotto, String descrizioneProdotto, float costoProdotto) {
        this.codiceProdotto = codiceProdotto;
        this.descrizioneProdotto = descrizioneProdotto;    //permette un inizializzazione diversa da null
        this.costoProdotto = costoProdotto;
        somma = somma + this.costoProdotto;
    }
    void stampaInfoProdotto(){

        System.out.println(codiceProdotto);
        System.out.println(descrizioneProdotto);
        System.out.println(costoProdotto);

    }
    float stampaSomma(){
        return Prodotto.somma;
    }
}