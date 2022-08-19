
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class ex11{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a,b;
         System.out.println("selecione a opção:\n1 - dinheiro/cheque\n2 - a vista no cartao\n3 - duas vezes\n4 - em duas vezes com juros de 10%");
         b = sc.nextInt();
         System.out.println("\ninsira o valor:");
         a = sc.nextInt();
         if(b == 1){
             a = a / 10;
             a = a * 9;
    }else if( b==2){
        a = a - (a * (15/100));
    }else if(b==3){
        a = a;
    }else if(b==4){
         a = a + (a * (15/100));
    }else{
    System.out.println("insira um valor valido :( ");}
             System.out.printf("valor: %d", (a));
}
}