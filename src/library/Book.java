package library;


public class Book implements IItem{
    private String nazev;
    private String jmeno;
    private int strany;


    Book(String nazev, String jmeno, int strany){
        this.nazev = nazev;
        this.jmeno = jmeno;
        this.strany = strany;
    }


    public void printInfo(){
        System.out.println("Kniha s názvem "+nazev+" má "+ strany + " stran a napsal ji "+jmeno+".");
    }

    public void printDelka() {
        System.out.println("Kniha má "+strany+" stran.");
    }
}
