package LatArr;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;


public class DaftarNasabah{

  public static void main(String[] args){
    Nasabah Arief = new Nasabah("001","Arief",new BigDecimal(10000000));
    System.out.println(Arief.toString());

    List<Nasabah> list = new ArrayList<>();
    list.add(Arief);
    list.add(new Nasabah("002","Agumon",new BigDecimal(2000000)));
    list.add(new Nasabah("003","Gabumon",new BigDecimal(300000000)));

    Nasabah indexKe2 = list.get(2);
    System.out.println("index ke 2 adalah" + indexKe2.toString());

    list.forEach((isi)->{
      System.out.println(isi);

    }
  );

}
}
