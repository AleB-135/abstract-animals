package org.lessons.java.animals;

public class Delfino extends Animale implements Testing {

    private String mangia;
    private String verso;


    public Delfino(String dormi, String mangia, String verso, String nuota) {
        super(dormi, mangia, verso);
        this.mangia = "Pesci, crostacei e cefalopodi";
        this.verso = "Clicks e fischi";
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
        return "\nDelfino: " + super.toString();
    }
    
     @Override
    public void faiNuotare(){
        System.out.println("Sto nuotando!!!");
    }
    

}

