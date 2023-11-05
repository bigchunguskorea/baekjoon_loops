import java.util.Scanner;

public class baekjoon_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int fact = 1;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
