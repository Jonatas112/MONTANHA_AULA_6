// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class atv1 {

    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        boolean resultado = ehPar(numero);

        if (resultado == true) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        sc.close();
    }
}
