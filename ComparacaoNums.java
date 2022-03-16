import java.util.Scanner;

class ComparacaoNums {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Inform um numero: ");
        int num1 = ler.nextInt();
        System.out.print("Inform outro numero: ");
        int num2 = ler.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros sao iguais");
        }
        else {
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            }
            else {
                System.out.println(num1 + " é menor que " + num2);
            }
        }
    }
}