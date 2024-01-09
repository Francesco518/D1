import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println("Enter the third string: ");
        String str3 = scanner.nextLine();

        String concatenationInsertionOrder = str1 + str2 + str3;
        System.out.println("Concatenation in insertion order: " + concatenationInsertionOrder);

        String concatenationReverseInsertionOrder = str3 + str2 + str1;
        System.out.println("Concatenation in reverse insertion order: "+ concatenationReverseInsertionOrder);

        scanner.close();

    }
}
