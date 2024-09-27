public class Fattura {
    private String nome;
    private int identificazione;
    private Prodotto lista[];
    private int i=0;


    public Fattura(String nome, int identificazione){
        this.nome=nome;
        this.identificazione=identificazione;
        this.lista=new Prodotto[5];
    }

    void aggiungiProdotti(int i){
        lista[i]=new Prodotto(23,"penna", 3.5F);
    }
    void stampa(){
        System.out.println("Cliente: "+ nome);
        System.out.println("Identificativo: "+ identificazione);
        for(i=0; i<5; i++) lista[i].stampaInfoProdotto();
    }


}
