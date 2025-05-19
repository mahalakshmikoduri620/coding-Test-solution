import  java.util.Scanner;
class Calculator{
  double a,b;
  String operation;
  Calculator (double a, double b, String operation){
    this.a=a;
    this.b=b;
    this.operation=operation.toLowerCase();
  }
  public String Calculate(){
    switch (operation){
      case "add" : 
        return "result :" +(a+b);
      case "substract":
        return "result:" +(a-b);
      case "multiply":
        return "result:" +(a*b);
      case "divide":
        if(b!=0)
          return "result:" +(a/b);
        else
          return "Error:Division by Zero";
      default:
        return "Error:unsupported operation";
    }
  } 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value for a:");
    double a = sc.nextDouble();
    System.out.println("Enter value for b:");
    double b = sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter operation (add,substract,multiply,divide):");
    String op=sc.nextLine();
    Calculator calc=new Calculator(a,b,op);
    System.out.println(calc.Calculate());
    sc.close();
  }
}
    
    
