public class Fattura {
    private String nome;
    private int identificatore;
    private Prodotto lista[];
    private int i=0;


    public Fattura(String nome, int identificatore){
        this.nome=nome;
        this.identificatore=identificatore;
        this.lista=new Prodotto[5];
    }

    void aggiungiProdotti(int i){
        lista[i]=new Prodotto(23,"penna", 3.5F);
    }
    void stampa(){
        String str = new String();
        str = "Cliente ";
        System.out.println(str.concat(nome));
        System.out.println("Identificativo: "+ identificatore);
        for(i=0; i<5; i++) lista[i].stampaInfoProdotto();
        System.out.println("Totale: " + lista[0].stampaSomma());
    }


}
