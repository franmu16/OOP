import azienda.Fattura;  //il main non è nel package azienda.fattura, si potrebbe anche mettere il nome completo della classe
import azienda.Prodotto;

public class MainFattura {
    public static void main(String[] args){
        Fattura f = new Fattura(32, "Acquisto cancelleria", 5);
        Prodotto p = new Prodotto(8, "Gomma", 0.5F);
        f.aggiungi(p);
        f.aggiungi(new Prodotto(2,"Matita", 1.5F));
        f.aggiungi(new Prodotto(4, "Penna", 0.8F));
        f.stampaProdotti();
    }
}
