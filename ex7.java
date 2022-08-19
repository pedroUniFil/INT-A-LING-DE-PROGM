
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ex7 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int a;
         System.out.println("insira o valor :");
         a = sc.nextInt();
         if(a%2 == 0){
             a = a + 5;
             System.out.printf(" \no numero é par");
         }else{
         System.out.printf(" \no numero é impar");
         a = a + 8;
         }
         System.out.printf(" \nresultado: %d", (a));
         
    }
}
