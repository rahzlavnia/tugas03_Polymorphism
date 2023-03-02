
public class Gajah extends Animal implements Herbivora{
	String jenis;
	double panjangBelalai;

	public Gajah(String name, int kaki, String jns, double belalai) {
		super(name, kaki);
		this.jenis = jns;
		this.panjangBelalai = belalai;
	}

	@Override
	public String displayMakan() {
		return "\nJenis\t\t: " + jenisH 
				+ "\nMakanan\t\t: " + makananH;
	}

	@Override
	public String displayBinatang() {
		// TODO Auto-generated method stub
		return super.displayBinatang() + displayMakan() 
		   + "\nSpesies\t\t: " + this.jenis
		   + "\nPanjang Belalai\t: " + this.panjangBelalai + " meter\n";
	}

	public String displayKeistimewaan() {
		return "Gajah punya kecerdasan di atas rata-rata "
				+ "binatang lain \n\t\t\t  dan mampu menunjukkan emosi";
	}
}
