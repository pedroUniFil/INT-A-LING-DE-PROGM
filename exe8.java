
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class exe8 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = 0;
         int b = 0;
         int c = 0;
         int d = 0;
         int e = 0;
         int vetor[]= {a, b, c, d, e};
         int i = 0;
         
         System.out.println("insira os valores: ");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         d=sc.nextInt();
         e=sc.nextInt();
         
         Arrays.sort(vetor);
         
         System.out.print(vetor);
  
         /*for(i=0; i<=4; i++){
             System.out.println("insira os valores: ");
             vetor[i] = sc.nextInt();
         }
          Arrays(vetor);
           System.out.println(vetor);
		for(int a : vetor) {
			System.out.print(a);
		}*/
         
         
    }
}
