import java.util.Scanner;

public class baekjoon_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }
    }
}
