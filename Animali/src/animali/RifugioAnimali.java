/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;

/**
 *
 * @author franz
 */
public class RifugioAnimali {
    Animale[] listaAnimali;
    int i;
    
    public RifugioAnimali(int dimensione) {
        listaAnimali = new Animale[dimensione];
        i= 0;
    }
    void aggiungiAnimale(Animale a){
        if(i<listaAnimali.length)
            listaAnimali[i]=a;
        i++;
    }
    void mostraAnimali(){
        for(int j=0; j<i; j++){
            System.out.println(listaAnimali[j].getNome() + " " + listaAnimali[j].getEtà());
        }
    }
}
