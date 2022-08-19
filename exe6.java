
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class exe6 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int a,b,c;
         System.out.println("insira 3 numeros: ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         
         if(a > b && b > c){
         System.out.printf(" essa é a ordem: %d - %d - %d", (a),(b),(c));
         }else if(a > c && c > b){
         System.out.printf(" essa é a ordem: %d - %d - %d", (a),(c),(b));
         }else if(b > c && c > a){
         System.out.printf(" essa é a ordem: %d - %d - %d", (b),(c),(a));
         }else if(b > c && a > c){
         System.out.printf(" essa é a ordem: %d - %d - %d", (b),(a),(c));
         }else if(c > b && b > a){
         System.out.printf(" essa é a ordem: %d - %d - %d", (c),(b),(a));
         }else if(c > b && a > b){
         System.out.printf(" essa é a ordem: %d - %d - %d", (c),(a),(b));
         }
    }
}
