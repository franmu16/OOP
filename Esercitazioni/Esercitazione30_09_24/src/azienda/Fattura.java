package azienda;

public class Fattura {
    private int codiceFattura;
    private String descrizioneFattura;
    private Prodotto prodotti[];
    private int riemp;

    public Fattura(int codiceFattura, String descrizioneFattura, int numProdotti){
        this.codiceFattura=codiceFattura;
        this.descrizioneFattura=descrizioneFattura;  //COMPOSIZIONE
        this.prodotti=new Prodotto[numProdotti];  //AGGREGAZIONE rispetto ai prodotti, COMPOSIZIONE rispetto all'array
        this.riemp=0;
    }
    public void aggiungi(Prodotto p){
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
