import java.util.Scanner;
public class oddSeriesGeneration{
  public static void generateSeries(int x){
    int count=0, num=1;
    while(count<x){
      System.out.println(num+ " ");
      num+=2;
      count ++;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int x= sc.nextInt();
    System.out.println("output:");
    generateSeries(x);
  }
}
