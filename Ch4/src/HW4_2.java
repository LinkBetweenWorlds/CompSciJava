import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN(DDD-DD-DDDD)");
        String SSN = input.nextLine();
        SSN = SSN.trim();

        if (SSN.length() == 11) {
        } else {
            System.out.println(SSN + " is a invalid SSN.");
        }
    }
}
