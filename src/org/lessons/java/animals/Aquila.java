package org.lessons.java.animals;

public class Aquila extends Animale {
    private String mangia;
    private String verso;

    

    public Aquila(String dormi, String mangia, String verso) {
        super(dormi, mangia, verso);
        this.mangia = "Roditori, lepri, volpi, uccelli, rettili e carogne";
        this.verso = "Strido";
    }

    public String getMangia() {
        return this.mangia;
    }

    public void setMangia(String mangia) {
        this.mangia = mangia;
    }

    public String getVerso() {
        return this.verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    @Override
    public String toString(){
        return "Aquila: " + super.toString();
    }
    
    
}
