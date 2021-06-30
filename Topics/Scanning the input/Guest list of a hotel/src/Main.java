//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            names.add(scanner.next());
        }

        Collections.reverse(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}