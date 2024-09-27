package azienda;

public class Fattura {
    private int codiceFattura;
    private String descrizioneFattura;
    private Prodotto prodotti[];
    private int riemp;

    public Fattura(int codiceFattura, String descrizioneFattura, int numProdotti){
        this.codiceFattura=codiceFattura;
        this.descrizioneFattura=descrizioneFattura;
        this.prodotti=new Prodotto[numProdotti];
        this.riemp=0;
    }
    public void aggiungi(Prodotto p){  //deve essere public altrimenti il livello di vis. è "package" (un publi ristretto che non avrebbe permesso l'aggiunta)
        if(riemp == prodotti.length){
            System.out.println("Massimo num. prodotti raggiunto");
            return;
        }
        this.prodotti[riemp++] = p;
    }
    public void stampaProdotti(){
        System.out.println("Elenco prodotti in fattura: ");
        for(int i=0; i<riemp; i++){
            this.prodotti[i].stampaInfoProdotto();
        }
    }
}
