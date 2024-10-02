import azienda.Fattura; 
import azienda.Prodotto;

public class MainFattura {
    public static void main(String[] args){
        Fattura f = new Fattura(32, "Acquisto cancelleria", 5);
        Prodotto p = new Prodotto(8, "Gomma", 0.5F); //prodotto istanziato fuori da fattura, fattura ha un riferimento del prodotto. Se cancello f prodotto rimane
        f.aggiungi(p);
        f.aggiungi(new Prodotto(2,"Matita", 1.5F)); //creazione tramite inv. del metodo
        f.aggiungi(new Prodotto(4, "Penna", 0.8F));
        f.stampaProdotti();
    }
}
