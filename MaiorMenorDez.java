import java.util.Scanner;

class MaiorMenorDez {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = ler.nextInt();

        if (num == 10) {
            System.out.println(num + " e dez");
        }
        else {
            if (num > 10) {
                System.out.println(num + " e maior que dez");
            }
            else {
                System.out.println(num + " e menor que dez");
            }
        }
    }
}