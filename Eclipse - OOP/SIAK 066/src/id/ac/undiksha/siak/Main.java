package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa(
				"Risva Darma Sentana",
				"Karangasem",
				true,
				"2115101066",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
				);
		mhs1.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"Dosen",
				"Singaraja",
				true,
				"12345678",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK",
				"Dosen Ilmu Komputer"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"Buleleng",
				false,
				"12345678",
				"Lab Ilmu Komputer"
				);
		pegawai1.printAllInfo();
	}
}