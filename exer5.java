
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class exer5 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int a;
         System.out.println("insira o numero: ");
         a = sc.nextInt();
         
         if(a > 0){
             a = a * 2;
             System.out.printf(" seu dobro é %d", (a));
         }
         else{
             a = a * 3;
             System.out.printf(" seu triplo é:  %d", (a));
         }
    }
}
