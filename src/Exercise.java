public class Exercise {
  public static void greeting(){
    System.out.println("Hello world");
  }
  public static void totalNumber(){
    int total=0;
    for (int i=1;i<=50;i++){
      total+=i;
    }
    System.out.println("The total natural numbers are: "+total);
  }
  public static void main(String[] args) {
    greeting();
    totalNumber();
  }
}
