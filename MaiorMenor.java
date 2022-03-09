import java.util.Scanner;

class MaiorMenor {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua idade.");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de Idade");
        }
        else {
            System.out.println("Menor de Idade");
        }
    }
}