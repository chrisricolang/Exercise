import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();
        int numberFive = scanner.nextInt();

        int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;

        System.out.println(sum);
    }
}
