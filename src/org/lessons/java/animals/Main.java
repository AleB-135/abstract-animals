package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
       Animale Aquila = new Aquila("Zzz", "roditori, lepri, volpi, uccelli, rettili e carogne", "strido");
       System.out.println(Aquila);


       Animale Cane = new Cane("Zzz", "carne, pesce, verdure e frutta", "abbaio");
       System.out.println(Cane);

 
       Animale Passerotto = new Passerotto("Zzz", "semi, cereali, frutta, frutta secca e insetti", "cinguettio");
       System.out.println(Passerotto);

       Animale Delfino = new Delfino("Zzz", "pesci, crostacei e cefalopodi", "clicks e fischi");
       System.out.println(Delfino);
       
    }
}
