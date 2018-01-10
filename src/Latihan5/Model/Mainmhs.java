package Latihan5.Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Mainmhs{

public static void main(String[] args){

  Kelas IF = new Kelas ("IF",11,"Teknik Informatika");
  Kelas SI = new Kelas ("IS",11,"Sistem Informasi");

  List<Mahasiswa> daftarmhs = new ArrayList<>();
  daftarmhs.add(new Mahasiswa("10511148","Dimas Maryanto",LocalDate.of(1992,03,11),2014,IF) );
  daftarmhs.add(new Mahasiswa("10511150","Muhammad Yusuf",LocalDate.of(1994,01,20),2014,SI));
  daftarmhs.add(new Mahasiswa("10511170","Adib",LocalDate.of(1995,02,12),2014,IF));
  daftarmhs.add(new Mahasiswa("10511160","Hari Sapto Adi",LocalDate.of(1991,03,15),2014,SI));
  daftarmhs.add(new Mahasiswa("10511110","Hariaty",LocalDate.of(1992,04,20),2014,IF));

  daftarmhs.forEach((isi)->{
    System.out.println(isi.toString());

  }
);

}
}
