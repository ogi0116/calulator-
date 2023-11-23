public class Main{
  public static void main(String[] args){
    double num1 =0;
    double num2 =0;
    char ope ;
    double answer=0;
    try{
      System.out.println("num1に数字を入力");
      double input = new java.util.Scanner(System.in).nextDouble();
      System.out.println("");
      System.out.println("演算子を入力");
      System.out.println("+,-,*,/を入力");
      String inope = new java.util.Scanner(System.in).nextLine();
      System.out.println("");
      System.out.println("num2に数字を入力");
      double input2 = new java.util.Scanner(System.in).nextDouble();
      if(inope.equals("+")){
        answer = (input + input2);
      }else if(inope.equals("-")){
        answer = (input - input2);
      }else if (inope.equals("*")){
        answer = (input * input2);
      }else{
        answer = (input / input2);
      }
      System.out.println("");
      System.out.println(input + inope + input2 + "=" + answer);
    }catch(Exception e){
      System.out.println("例外が発生しました");
    }
  }
}