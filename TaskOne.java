import java.util.Scanner;

public class TaskOne {

  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Insert a number: ");
    int numberOfSteps = keyboardInput.nextInt();

    String drawStairs = "";

    for (int i = 1; i <= numberOfSteps; i++) {
      for (int j = 1; j <= numberOfSteps - i; j++) {
        drawStairs += " ";
      }

      for (int z = 0; z < i; z++) {
        drawStairs += "*";
      }

      drawStairs += "\n";
    }

    System.out.print(drawStairs);
  }
}
