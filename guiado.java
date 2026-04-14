// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atvMaior {

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, max;

        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = sc.nextInt();

        max = maior(n1, n2);

        System.out.println("Maior numero: " + max);

        sc.close();
    }
}
