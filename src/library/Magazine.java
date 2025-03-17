package library;

public class Magazine implements IItem{
    private String nazev;
    private String jmeno;
    private int strany;


    Magazine(String nazev, String jmeno, int strany){
        this.nazev = nazev;
        this.jmeno = jmeno;
        this.strany = strany;
    }


    public void printInfo(){
        System.out.println("Časopis s názvem "+nazev+" má "+ strany + " stran a redakce je "+jmeno+".");
    }

    public void printDelka() {
        System.out.println("Časopis má "+strany+" stran.");
    }
}
