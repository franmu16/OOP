public class MainArray {
    public static void main(String[] args){
        int vett[];
        vett = new int[3];
        Prodotto prodotti[];
        prodotti = new Prodotto[2]; //abbiamo creato solo l'array per i riferimenti
        prodotti[0] = new Prodotto(4, "Penne", 1.5F);
        for(int i=0; i<vett.length; i++){
            //System.out.println(prodotti[i]); //stampa i riferimenti
            System.out.println(prodotti[i].getCostoProdotto());
        }

    }
}
//stringa, intero, array di prodotti, aggiungere un prodotto alla volta (metodo1), stampa di tutto (metodo2)