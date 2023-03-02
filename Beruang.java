
public class Beruang extends Animal implements Karnivora, Herbivora{
	private int berat;
	private String habitat;

	public Beruang(String name, int kaki, int weight, String tinggal) {
		super(name, kaki);
		this.berat = weight;
		this.habitat = tinggal;
	}

	@Override
	public String displayMakan() {
		return "\nJenis\t\t: " + this.convertJenis()
				+ "\nMakanan\t\t: " + makananH + " dan " + makananK;
	}
	
	public String convertJenis() {
		String jenisA;
		if (jenisH == "Herbivora" && jenisK == "Karnivora")
			jenisA = "Omnivora";
		
		return jenisA;
	}

	@Override
	public String displayBinatang() {
		return super.displayBinatang() + displayMakan() 
		   + "\nBerat\t\t: " + this.berat + " kg"
		   + "\nHabitat\t\t: " + this.habitat;
	}
	
	public String displayFunFact() {
		return "Panda termasuk dalam anggota keluarga beruang";
	}

}
