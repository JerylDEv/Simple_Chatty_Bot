//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());
        names.add(scanner.next());

        Collections.reverse(names);
        for (String i: names) {
            System.out.println(i);
        }
    }
}