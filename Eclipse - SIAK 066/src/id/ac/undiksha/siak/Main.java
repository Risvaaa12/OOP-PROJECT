package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs2 = new Mahasiswa(
				"Risva Darma Sentana",
				"Karangasem",
				true,
				"2115101066",
				"ILKOM21",
				"Ilmu Komputer",
				"TI21",
				"Teknik Informatika",
				"FTK"
				);
		mhs2.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"Dosen",
				"Singaraja",
				true,
				"123456789",
				"ILKOM",
				"Ilmu Komputer",
				"Dosen Ilkom",
				"TI",
				"Teknik Informatika",
				"FTK"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"Buleleng",
				false,
				"123456789",
				"Lab Ilkom"
				);
		pegawai1.printAllInfo();
	}
}