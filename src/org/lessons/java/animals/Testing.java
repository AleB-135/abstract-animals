package org.lessons.java.animals;

public interface Testing {
    public static void main(String[] args) {

        Animale Aquila = new Aquila("Zzz", "roditori, lepri, volpi, uccelli, rettili e carogne", "strido");
        System.out.println(Aquila);
        Aquila.faiVolare();


        Animale Cane = new Cane("Zzz", "carne, pesce, verdure e frutta", "abbaio");
        System.out.println(Cane);

 
        Animale Passerotto = new Passerotto("Zzz", "semi, cereali, frutta, frutta secca e insetti", "cinguettio", "Sto volando!!!");
        System.out.println(Passerotto);
        Passerotto.faiVolare();

        Animale Delfino = new Delfino("Zzz", "pesci, crostacei e cefalopodi", "clicks e fischi", "Sto nuotando!!!");
        System.out.println(Delfino);
        Delfino.faiNuotare();
    }

    void faiVolare();
    void faiNuotare();

   
    
}
