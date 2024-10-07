/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;
import Proprietario.Proprietario;
/**
 *
 * @author franz
 */
public class Animali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proprietario proprietarioCane = new Proprietario("Mario Rossi", "Via Roma 1");
        Cane cane = new Cane("Fido", 3, "Labrador", proprietarioCane);
        Gatto gatto = new Gatto("Micio", 2, "Nero");

        RifugioAnimali rifugio = new RifugioAnimali(10);
        rifugio.aggiungiAnimale(cane);
        rifugio.aggiungiAnimale(gatto);

        rifugio.mostraAnimali();
        Animale animale = cane;
        if (animale instanceof Cane) {
            Cane caneCast = (Cane) animale;
            caneCast.mostraDettagli();
        }
    }
    
}
