public class Main {
    public static void main(String[] args) {
        Fattura f;
        int i=0;
        f = new Fattura("Client1", 21);
        while (i<5) {
            f.aggiungiProdotti(i);
            i++;
        }
        f.stampa();
    }
}