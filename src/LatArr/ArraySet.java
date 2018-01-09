package LatArr;

import java.util.Set;
import java.util.HashSet;

public class ArraySet{

  public static void main(String[] args){
    Set siswa = new HashSet();
    siswa.add("Arief");
    siswa.add("Arief");
    siswa.add(1);
    siswa.add(2);
    System.out.println(String.format("Jumlah Array di set adalah %s,",siswa.size()));

    Object obj = siswa.toArray()[0];
    System.out.println(String.format("nilai dari index ke 0 adalah %s",obj));

    System.out.println("-----------------------------");
    for(Object obj2 : siswa){
      System.out.println(obj2);
    }
  }
}
