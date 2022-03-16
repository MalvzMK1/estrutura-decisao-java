import java.util.Scanner;

class IMC {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira seu peso em kg: ");
        double peso = ler.nextDouble();
        System.out.print("Insira sua altura em m: ");
        double altura = ler.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.print("Seu IMC e: " + imc + ", voce esta: ");

        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        }
        else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        }
        else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        }
        else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        }
        else if (imc >= 40) {
            System.out.println("Obesidade III (morbida)");
        }
    }
}