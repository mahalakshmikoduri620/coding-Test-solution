import java.util.Scanner;
public class Series{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for x:");
int x=sc.nextInt();
int num=1, count=0;
while(count<x){
System.out.println(num);
if(count!=x-1){
System.out.println(",");
}
num+=2;
count++;
}
sc.close();
}
}

