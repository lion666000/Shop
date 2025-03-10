package cinema;
import moviestore.Movie;

import java.util.Scanner;

public class Film {

    private String name;
    private int year;
    private People[] actors;

    private People director;


    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */
    static Scanner sc = new Scanner(System.in);
    public void addActors(int count) {
        //actors = new ....
        actors = new People[count];
        for (int i=0; i<count; i++){
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
            System.out.println("Jméno herce "+(i+1)+":");
            String jmeno = sc.nextLine();
            System.out.println("Roné město herce "+(i+1)+":");
            String rodneMesto = sc.nextLine();
            System.out.println("Pohlaví herce "+(i+1)+":   (muz/zena)");
            Gender pohlavi = Gender.valueOf(sc.nextLine().toLowerCase());

            actors[i] = new People(pohlavi,jmeno,rodneMesto);
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        //sem dopln kod
        System.out.println("Název: "+name+", Rok vydání: "+year);
        System.out.print("Herci: ");
        for (int i=0; i<actors.length; i++){
            actors[i].printInfo();
            System.out.print(" , ");
        }
        System.out.println();
        System.out.println("-----");
    }

    public void pocetpohlavi(){
        int a = 0;
        int b = 0;
        for (People actor : actors){
            switch (actor.getGender()){
                case muz ->
                    a++;
                case zena ->
                    b++;
            }
        }
        System.out.println("Počet herců ve filmu: "+a);
        System.out.println("Počet hereček ve filmu: "+b);
        System.out.println("-----");
    }
}
