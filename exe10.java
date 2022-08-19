
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class exe10{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a, b, c;
         
         System.out.println("Informe o primeiro valor:");
        a = sc.nextInt();
        System.out.println("Informe o segundo valor:");
        b = sc.nextInt();
        System.out.println("Informe o terceiro valor:");
        c = sc.nextInt();
         
         if(a >= (b + c)){
            System.out.println("nao é trianglo");
        } else if(a == b && b == c){
            System.out.println("EQUILATERO");
        } else if((a == b && a !=c) || (a == c && a != b) || (b == c && b != a)){
            System.out.println("ISOSCELES");
        } else if(a != b && a != c){
            System.out.println("ESCALENO");
        }
    }
}
