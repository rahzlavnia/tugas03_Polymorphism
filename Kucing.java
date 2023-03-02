
public class Kucing extends Animal implements Karnivora{
	private String ras;
	private int umur;

	public Kucing(String name, int kaki, String r, int age) {
		super(name, kaki);
		this.ras = r;
		this.umur = age;
	}
	
	@Override
	public String displayMakan() {
		return "\nJenis\t\t: " + jenisK 
				+ "\nMakanan\t\t: " + makananK;
	}

	@Override
	public String displayBinatang() {
		return super.displayBinatang() + displayMakan() 
			   + "\nRas\t\t: " + this.ras
			   + "\nUmur\t\t: " + this.umur + " tahun\n";
	}
	
	public String displaySuara() {
		return "Meong meong";
	}
	
}
