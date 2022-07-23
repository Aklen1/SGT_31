import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println("Ýour age is "+ age );
        System.out.println("You are "+ age + " years old");

        System.out.println("Please enter your speed in mp/h");
        int speed = scanner.nextInt();
        System.out.println("Ýour speed is "+ speed * 1.6 + " km/h");

    }
}
