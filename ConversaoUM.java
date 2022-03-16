import java.util.Scanner;

class ConversaoUM {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a distancia em metros: ");
        double dist = ler.nextDouble();

        double km = dist / 1000;
        System.out.println("\n" + dist + "m =" + km + "km");
        
        double hm = dist / 100;
        System.out.println("\n" + dist + "m =" + hm + "hm");
        
        double dam = dist / 10;
        System.out.println("\n" + dist + "m =" + dam + "dam");
        
        double dm = dist * 10;
        System.out.println("\n" + dist + "m =" + dm + "dm");
        
        double cm = dist * 100;
        System.out.println("\n" + dist + "m =" + cm + "cm");
        
        double mm = dist * 1000;
        System.out.println("\n" + dist + "m =" + mm + "mm");
    }
}