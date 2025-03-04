package elektroshop;

public class Fridge {
    private Spotreba spotreba;
    private String znacka;
    private String model;
    private int rokVyroby;

    public Fridge (Spotreba spotreba,String znacka, String model, int rokVyroby) {
        this.spotreba = spotreba;
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public Spotreba getSpotreba() {
        return spotreba;
    }

    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }
}
