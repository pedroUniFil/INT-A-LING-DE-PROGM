
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class ex4 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        System.out.println("escreva os dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a == b){
            c = a+b;
            System.out.printf(" os numeros sao iguais e essa é a soma deles: %d", (c));
        }else{
            c = a * b;
            System.out.printf(" os numeros sao diferentes e essa é a multiplicação deles: %d", (c));
        }
    }
}
