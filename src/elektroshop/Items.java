package elektroshop;
import autosaloon.Car;
import autosaloon.Condition;

import java.util.Scanner;

public class Items {
    private Fridge[] items;

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    static Scanner sc = new Scanner(System.in);
    public void addItems(int count) {
      //  items = new ....
        items = new Fridge[count];
        for (int i=0; i<count; i++){
            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek
            System.out.println("Jaká je míra spotřeby ledníčky ? (A-G)");
            String spotrebaString = sc.nextLine().toUpperCase();
            Spotreba spotreba = Spotreba.valueOf(spotrebaString);
            System.out.println("Značka lednice");
            String znacka = sc.nextLine();
            System.out.println("Model lednice");
            String model = sc.nextLine();
            System.out.println("Rok výroby lednice: ");
            int rokVyroby = sc.nextInt();
            sc.nextLine();

            items[i] = new Fridge(spotreba,znacka,model,rokVyroby);
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        for (Fridge item : items) {
            switch (item.getSpotreba()){
                case A ->
                        System.out.println(item.getRokVyroby()+": very low");
                case B ->
                        System.out.println(item.getRokVyroby()+": low");
                case C ->
                        System.out.println(item.getRokVyroby()+": normal");
                case D ->
                        System.out.println(item.getRokVyroby()+": above normal");
                case E ->
                        System.out.println(item.getRokVyroby()+": high");
                case F ->
                        System.out.println(item.getRokVyroby()+": very high");
                case G ->
                        System.out.println(item.getRokVyroby()+": extremely high");
            }
        }
        System.out.println("-----");
    }


    public void fridgeSpotrebaA(){
        System.out.println("Lednice se spotrebou A");
        for (Fridge item : items) {
            if (item.getSpotreba() == Spotreba.A) {
                System.out.println("Znacka lednice: " + item.getZnacka());
                System.out.println("Model lednice: " + item.getModel());
                System.out.println("Rok Vyroby: " + item.getRokVyroby());
            }
        }
    }

    public void printPocetLednicek(){
        System.out.println("Pocet lednicek: " + items.length);
    }

    public void fridgePocetSpotreb(){
        for (Fridge item : items) {
            switch (item.getSpotreba()){
                case A ->
                        a++;
                case B ->
                        b++;
                case C ->
                        c++;
                case D ->
                        d++;
                case E ->
                        e++;
                case F ->
                        f++;
                case G ->
                        g++;
            }
        }
        System.out.println("Pocet lednicek spotreby A: " + a);
        System.out.println("Pocet lednicek spotreby B: " + b);
        System.out.println("Pocet lednicek spotreby C: " + c);
        System.out.println("Pocet lednicek spotreby D: " + d);
        System.out.println("Pocet lednicek spotreby E: " + e);
        System.out.println("Pocet lednicek spotreby F: " + f);
        System.out.println("Pocet lednicek spotreby G: " + g);
    }
}
