package autosaloon;

public class Car {

    private int rokVyroby;
    private int pocetKm;
    private String barva;
    private Condition stavAuta;

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getPocetKm() {
        return pocetKm;
    }

    public String getBarva() {
        return barva;
    }

    public Condition getStavAuta() {
        return stavAuta;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }

    public void setPocetKm(int pocetKm) {
        this.pocetKm = pocetKm;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public void setStavAuta(Condition stavAuta) {
        this.stavAuta = stavAuta;
    }

    public Car (int rokVyroby, int pocetKm, String barva, Condition stavAuta) {
        this.rokVyroby = rokVyroby;
        this.pocetKm = pocetKm;
        this.barva = barva;
        this.stavAuta = stavAuta;
    }

    public void printInfo(){
        System.out.println("Info o aute");
        System.out.println("Rok Vyroby: "+rokVyroby);
        System.out.println("Pocet Km: "+pocetKm);
        System.out.println("Barva: "+barva);
        System.out.println("Stav auta: "+stavAuta);
    }

	
}
