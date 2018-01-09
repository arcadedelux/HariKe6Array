package Latihan5.Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Mahasiswa extends Kelas{
  private String nim,nama;
  private LocalDate tanggalLahir;
  private Integer angkatan;
  private Kelas kelas;
  private Kelas jurusan;

  public Mahasiswa (String nim,String nama, LocalDate tanggalLahir,Integer angkatan,Kelas kelas,Kelas jurusan){
  this.nim = nim;
  this.nama= nama;
  this.tanggalLahir = tanggalLahir;
  this.angkatan=angkatan;
    Kelas tab = new Kelas();
    tab.getNama();
    tab.getJurusan();
}


  public String getNim(){
    return this.nim;
  }

  public void setNim(String nim){
    this.nim = nim;
  }

  public String getNama(){
    return this.nama;
  }

  public void setNama(String nama){
    this.nama = nama;
  }

  public LocalDate getTanggalLahir(){
    return this.tanggalLahir;
  }
  public void setTanggalLahir(LocalDate tanggalLahir){
    this.tanggalLahir = tanggalLahir;
  }

  public Integer getAngkatan(){
    return this.angkatan;
  }
  public void setAngkatan(Integer angkatan){
    this.angkatan = angkatan;
  }

  public Kelas getKelas(){
    return this.kelas;
  }
  public void setKelas(Kelas kelas){
    this.kelas = kelas;
  }

  public String toString(){
    return String.format("{Nim : %s,Nama : %s,Tanggal Lahir: %s,Angkatan : %s,Nama Kelas : %s,Jurusan : %s}",nim,nama,tanggalLahir,angkatan,kelas,super.getJurusan());
  }
      public static void main(String[] args){

        List<Mahasiswa> list = new ArrayList<>();
        list.add(new Mahasiswa("10511148","Dimas Maryanto",1992-03-11,2014,"IF","Teknik Informatika") );
        list.add(new Mahasiswa("10511150","Muhammad Yusuf",1994-01-20,2014,"SI","Sistem Informasi"));
        list.add(new Mahasiswa("10511170","Adib",1995-02-12,2014,"IF","Teknik Informatika"));
        list.add(new Mahasiswa("10511160","Hari Sapto Adi",1991-03-15,2014,"SI","Sistem Informatika"));
        list.add(new Mahasiswa("10511110","Hariaty",1992-04-31,2014,"IF","Teknik Informatika"));

        Mahasiswa pang = new java.util.ArrayList();
        System.out.println(pang.toString());

        list.forEach((isi)->{
          System.out.println(isi);

        }
      );

    }
    }
