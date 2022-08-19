
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ex14 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int a;
         System.out.println("quantos lados tem seu triangulo?");
         a = sc.nextInt();
         if(a == 3){
             System.out.println("\n triangulo?");
    }else if(a == 4){
        System.out.println("quadrado");
    }else if(a == 5){
        System.out.println("pentagono");
    }else if(a > 5){
        System.out.println("poligono nao identificado");
    }else{
        System.out.println("nao é poligono");
    }
    }
}