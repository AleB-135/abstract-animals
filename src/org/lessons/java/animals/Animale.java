package org.lessons.java.animals;

public abstract class Animale {
    private String dormi = "Zzz";
    private String mangia;
    private String verso;


    public String getDormi() {
        return this.dormi;
    }

    public void setDormi(String dormi) {
        this.dormi = dormi;
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

    public Animale(String dormi, String mangia, String verso) {
        this.dormi = dormi;
        this.mangia = mangia;
        this.verso = verso;
    }

    @Override
    public String toString(){
        return "\nDorme: " + this.dormi + " "  + "\nMangia: " + this.getMangia() + "\nVerso: " + this.getVerso();
    }

    public void faiVolare() {
        System.out.println("Sto volando!!!");
    }

    public void faiNuotare(){
        System.out.println("Sto nuotando!!!");
    }

    
}


