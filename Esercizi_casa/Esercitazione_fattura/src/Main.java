public class Main {
    public static void main(String[] args) {
        Fattura f;
        int i;
        f = new Fattura("Client1", 21);
        for(i=0; i<5; i++)
            f.aggiungiProdotti(i);
        f.stampa();
    }
}