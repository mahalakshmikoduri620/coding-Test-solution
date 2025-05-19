import java.util.*;
public class NumberSeries{
  public static void main(String[] args){
    int[] inputNumbers={1,2,8,9,12,46,76,82,15,20,30}
      int[] divisors={1,2,3,4,5,6,7,8,9};
    Map<Integer,Integer> result=new Hash Map<>[];
    for(int divisor:divisor){
      int count=0;
      for(int num:inputNumbers){
        if(num%divisors==0){
          count++;
        }
      }
      result.put(divisor,count);
    }
    System.out.println(result);
  }
}
