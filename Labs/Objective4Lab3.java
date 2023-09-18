
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = (2023 - age);

    Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");
    age = input.nextInt();

    /*
    age = input.nextInt();
    */

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}