
public class Main {
	public static void main(String[] args) {
		Animal[] A = new Animal[3];
		
		A[0] = new Kucing("Garfield", 4, "Persia", 3);
		A[1] = new Gajah("Jumbo", 4, "Elephas maximus", 1.8);
		A[2] = new Beruang("Ice Bear", 2, 267, "Rusia");
		
		System.out.println ("\nData Animal");
		
		for (Animal a : A)
			System.out.print(a.displayBinatang());
		
		System.out.println ("\n\nSuara Kucing\t\t: " + ((Kucing)A[0]).displaySuara());
		System.out.println ("Keistimewaan Gajah\t: " + ((Gajah)A[1]).displayKeistimewaan());
		System.out.println ("Fun Fact Beruang\t: " + ((Beruang)A[2]).displayFunFact());
	}
}
