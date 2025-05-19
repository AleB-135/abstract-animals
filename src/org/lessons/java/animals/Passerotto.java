package org.lessons.java.animals;

public class Passerotto extends Animale implements Testing{
    private String mangia;
    private String verso;


    public Passerotto(String dormi, String mangia, String verso, String vola) {
        super(dormi, mangia, verso);
        this.mangia = "Semi, cereali, frutta, frutta secca e insetti";
        this.verso = "Cinguettio";
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
        return "\nPasserotto: " + super.toString();
    }

     @Override
    public void faiVolare(){
        System.out.println("Sto volando!!!");
    }

	 @Override
	 public void faiNuotare() {
        System.out.println("Sto nuotando!!!");;
	 }
   

}
