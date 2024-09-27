public class Prodotto {
    //sezione attributi
    private int codiceProdotto;   //convenzione: 1a parola minuscola, le successive maiuscole
    String descrizioneProdotto; //in Java stringa non è un tipo primitivo
    float costoProdotto;

    public Prodotto() {
        codiceProdotto = 1;
        descrizioneProdotto = "Prodotto vuoto";    //permette un inizializzazione diversa da null
        costoProdotto = 0F;
    }
    void stampaInfoProdotto(){

        System.out.println(codiceProdotto);
        System.out.println(descrizioneProdotto);
        System.out.println(costoProdotto);

    }
    void setCodiceProdotto(int codiceProdotto){
        this.codiceProdotto = codiceProdotto;   //this per risolvere l'ambiguità
    }
    float getCostoProdotto() {
        return this.costoProdotto;
    }
}
