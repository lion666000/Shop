package cinema;

public class People {
    Gender gender;
    String jmeno;
    String rodneMesto;

    public People(Gender gender, String jmeno, String rodneMesto) {
        this.gender = gender;
        this.jmeno = jmeno;
        this.rodneMesto = rodneMesto;
    }

    public void printInfo(){
        System.out.print(jmeno + " - " + gender);
    }

    public Gender getGender() {
        return gender;
    }
}
