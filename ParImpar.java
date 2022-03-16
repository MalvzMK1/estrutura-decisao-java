import java.util.Scanner;

class ParImpar {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = ler.nextInt();

        int res = num % 2;
        if (res == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}