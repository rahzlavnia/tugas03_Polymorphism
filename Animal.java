
abstract class Animal {
	private String nama;
	private int jumlahKaki;
	
	public Animal(String name, int kaki) {
		this.nama = name;
		this.jumlahKaki = kaki;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getJumlahKaki() {
		return jumlahKaki;
	}

	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}

	public String displayBinatang() {
		return "\nNama\t\t: " + nama 
				+ "\nJumlah Kaki\t: " + jumlahKaki;
	}
	
}
