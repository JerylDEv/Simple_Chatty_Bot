//put imports you need here

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        scan.next();
        scan.next();
        scan.next();
        String cuisinePreference = scan.next();

        System.out.printf("The form for %s is completed. We will contact you if " +
                "we need a chef that cooks %s dishes.",
                firstName,
                cuisinePreference);
    }
}