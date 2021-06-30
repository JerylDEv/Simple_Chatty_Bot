//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        ArrayList<String> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            tokens.add(scanner.next());
        }
        Collections.reverse(tokens);
        for (String token: tokens) {
            System.out.println(token);
        }
    }
}