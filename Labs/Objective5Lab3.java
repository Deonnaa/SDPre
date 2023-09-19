public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if(userNum >= 0) {
        System.out.println("The number is positive");
      }
      else {
        System.out.print("The number is negative" );
      }













      /*
        Your solution goes here
        userNum = scanner.nextInt();

        System.out.println("The number is " + );
      */

      scanner.close();
  }
}







Please enter a number:
3
The number is positive