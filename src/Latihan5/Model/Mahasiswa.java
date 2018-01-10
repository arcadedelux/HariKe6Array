package Latihan5.Model;


import java.time.LocalDate;

public class Mahasiswa {
  private String nim,nama;
  private LocalDate tanggalLahir;
  private Integer angkatan;
  private Kelas kelas;

  public Mahasiswa (String nim,String nama, LocalDate tanggalLahir,Integer angkatan,Kelas kelas){
  this.nim = nim;
  this.nama= nama;
  this.tanggalLahir = tanggalLahir;
  this.angkatan=angkatan;
  this.kelas = kelas;
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
    return String.format("{Nim : %s,Nama : %s,Tanggal Lahir: %s,Angkatan : %s,Nama Kelas : %s,Jurusan : %s}",this.nim,this.nama,this.tanggalLahir,this.angkatan,this.kelas.getNama(),this.kelas.getJurusan());
  }

    }
