package org.lessons.java.animals;

public class Cane extends Animale {
    private String mangia;
    private String verso;


    public Cane(String dormi, String mangia, String verso) {
        super(dormi, mangia, verso);
        this.mangia = "Croccantini, carne, pesce, verdure e frutta";
        this.verso = "Abbaio";
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
        return "\nCane: " + super.toString();
    }
    
    
}
    
        
    

