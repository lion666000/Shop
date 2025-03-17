package library;
import java.util.Scanner;


public class Library {
	private Book[] items;
	private Magazine [] magazines;

	static Scanner sc = new Scanner(System.in);
	public void addItems(int count,int z) {
		//  items = new ....
		items = new Book[count];
		for (int i=0; i<count; i++){
			//vytvor instanci
			//pridej instanci do pole

			System.out.println("Název knihy "+(i+1)+":");
			String nazev = sc.nextLine();
			System.out.println("Jméno autora knihy "+(i+1)+":");
			String jmeno = sc.nextLine();
			System.out.println("Počet stran knihy "+(i+1)+":");
			int strany = sc.nextInt();
			sc.next();

			items[i] = new Book(nazev,jmeno,strany);

		}
		magazines = new Magazine[z];
		for (int x=0; x<z; x++){
			//vytvor instanci
			//pridej instanci do pole

			System.out.println("Název časopisu "+(x+1)+":");
			String nazev = sc.nextLine();
			System.out.println("Jméno redakce časopisu "+(x+1)+":");
			String jmeno = sc.nextLine();
			System.out.println("Počet stran časopisu "+(x+1)+":");
			int strany = sc.nextInt();
			sc.next();

			magazines[x] = new Magazine(nazev,jmeno,strany);

		}
	}


	public void printInfo(){
		System.out.println("-----INFO O KNIHOVNE-----");
		//sem dopln kod
		for (int k=0; k<items.length; k++){
			items[k].printInfo();
		}
		for (int k=0; k< magazines.length; k++){
			magazines[k].printInfo();
		}
		System.out.println("-----");
	}
}
