package loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
