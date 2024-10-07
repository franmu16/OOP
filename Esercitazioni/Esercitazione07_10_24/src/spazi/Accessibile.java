package spazi;

import persone.Persona.Persona;

//le interfacce hanno nomi di aggettivi, esplicitano la loro funzionalità.
//SERVE PER FAR ENTRARE E USCIRE LE PERSONE DALLE AULE
public interface Accessibile {
    //definiamo solo metodi astratti
    void entra(Persona p);    //non mettiamo public perchè lo diamo per scontato
    Persona esce();

}
