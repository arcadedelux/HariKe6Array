package LatArr;

import java.util.Map;
import java.util.HashMap;
public class ArrayMap{
   public static void main(String[] args) {
     Map berkas = new HashMap();
     berkas.put("laporan 2017","untung");
     berkas.put("laporan 2018","untung juga");

     System.out.println(berkas.get("laporan2018"));

     berkas.forEach((kunci,nilai) ->{
        System.out.println(String.format("Kata kunci %s dan nilainya adalah %s",kunci,nilai));

     });

  }

}
