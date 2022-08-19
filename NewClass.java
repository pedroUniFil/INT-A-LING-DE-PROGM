
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class NewClass {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a,b,c,delt, cont1,cont2,divs;
        float baska, baskb, raiz;
        
        System.out.println("Insira os valores:\n");
        a = sc.nextInt();
        if ( a < 0){
            System.out.println("função não é de segundo grau");
        }else{
        b = sc.nextInt();
        c = sc.nextInt();
        
           
        b = (int) Math.pow(b, 2);
        cont1 = a*c;
        cont2 = 4 * cont1;
        delt = b - cont2;
        System.out.printf("resusltado de delta: %d", (delt));
        
        raiz =(float) Math.sqrt(delt);
        divs = 2 * a;
        baska = (b + raiz) / divs;
        baskb = (b - raiz) / divs;
        
        if(delt < 0){
            System.out.println(" a formula nao possui raizes");
        }else if(delt == 0){
                System.out.printf(" a equação possui apenas uma raiz real: %f", (baska));
            }else{
                System.out.printf(" a equação possui duas raizes reais sao elas: %f e %f", (baska), (baskb));
            }
        
        
        }
    }
}
