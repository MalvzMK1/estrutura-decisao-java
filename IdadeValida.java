import java.util.Scanner;

class IdadeValida {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua idade.");
        int idade = ler.nextInt();

        if (idade >= 1 && idade <= 150) {
            if (idade >= 18) {
                System.out.println("Maior de Idade");
            }else {
                System.out.println("Menor de Idade");
            }
        }
        else {
            System.out.println("Idade Inválida");
        }
    }
}