package autosaloon;
import java.util.Scanner;

public class CarDatabase {

    private String owner;
    private Car[] cars;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



    static Scanner sc = new Scanner(System.in);

    public CarDatabase(String owner){
        this.owner = owner;
    }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        //  cars = new ....
        cars = new Car[count];
        for (int i=0; i<count; i++){
            System.out.println("Zadej rok výroby u "+(i+1)+". auta:");
            int rokVyroby = sc.nextInt();
            System.out.println("Zadej počet najetých Km u "+(i+1)+". auta:");
            int pocetKm = sc.nextInt();
            sc.nextLine();
            System.out.println("Zadej barvu u "+(i+1)+". auta:");
            String barva = sc.nextLine();
            System.out.println("Zadej stav auta (bad,good,excellent,damaged) u "+(i+1)+". auta:");
            String stavAutaString = sc.nextLine().toLowerCase();
            Condition stavAuta = Condition.valueOf(stavAutaString);
            //nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            //vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            //pridej auto do pole aut
            cars[i] = new Car(rokVyroby,pocetKm,barva,stavAuta)  ;
            Car car = new Car(rokVyroby,pocetKm,barva,stavAuta);
        }
    }



    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
        for (Car car : cars) {
            if (car.getStavAuta() == Condition.good) {
                car.printInfo();
            }
        }
    }

    public void printCarMostKm(){
        for (Car car : cars){

        }
    }
}
