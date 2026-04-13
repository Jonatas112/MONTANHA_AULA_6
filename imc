// Nome: Jonatas Natanael Antunes Oliveira
// Matrícula: 1232021950

import java.util.Scanner;

public class imc {

    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura;

        System.out.println("Digite o peso:");
        peso = sc.nextDouble();

        System.out.println("Digite a altura:");
        altura = sc.nextDouble();

        double imc = calcularIMC(peso, altura);
        String resp = classificarIMC(imc);

        System.out.println("IMC = " + imc);
        System.out.println("Resultado: " + resp);

        sc.close();
    }
}
