package LatArr;

public class PrimitifArray{
public static void main(String[] args){
String[] pesertaBoothcamp={"Dimas Maryanto","Yusuf","Gian","Ikbal"};

System.out.println(String.format("Peserta bootcamp index ke 2 adalah %s",pesertaBoothcamp[1]));

for(int i =0;i<pesertaBoothcamp.length;i++){
  System.out.print(pesertaBoothcamp[i]+ ",");
}

}

}
