
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ex9 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         float a, c;
         float b;
         System.out.println("insira seu sexo:\n1 - para masculino\n2 - para feminino: ");
         a = sc.nextFloat();
         System.out.println("\nInsira sua altura: ");
         b = sc.nextFloat();
         if(a == 1){
             c = (float) (72.7 * b);
             a = (float) c - 58;
         }else{
             a = (float) ((62.1 * b) - 44.7);
         }
         
         System.out.printf("seu peso ideal é: %f", (a));
    }
}
