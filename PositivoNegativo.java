import java.util.Scanner;

class PositivoNegativo {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        if (num == 0) {
            System.out.println("Zero");
        }
        else {
            if (num > 0) {
                System.out.println("Positivo");
            }
            else {
                System.out.println("Negativo");
            }
        }
    }
}