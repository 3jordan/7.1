import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String usersName = scanner.nextLine();

        System.out.println("Birth Year: ");
        int usersYear = scanner.nextInt();

        int newAge = 2050 - usersYear;
        System.out.println(usersName + ", in 2050 you will be " + newAge + " years old.");
    }
}