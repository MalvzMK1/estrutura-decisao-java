import java.util.Scanner;

class Idade {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    }
}