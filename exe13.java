import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, MA, ME, NUMB;
        System.out.println("insira o numero do aluno");
        NUMB = sc.nextInt();
        
        System.out.println("insira o valor da prova 1:");
        a = sc.nextInt();
        
        System.out.println("insira o valor da prova 2:");
        b = sc.nextInt();
        
        System.out.println("insira o valor da prova 3:");
        c = sc.nextInt();
        
        ME = (a + b + c) / 3;
        MA = (((a + b) * 2) + (c * 3) + ME) / 7;
        if (MA > 60) {
            if (MA >= 90) {
                System.out.println("numero do aluno: " + NUMB + " nota: " + a + " " + b + " " + c + " media dos exercicios: " + ME + " media de aproveitamento: " + ME + "Conceito 'A' Aprovado");
            } else if (MA >= 75 && MA < 90) {
                System.out.println("numero do aluno: " + NUMB + " nota: " + a + " " + b + " " + c + " media dos exercicios: " + ME + " media de aproveitamento: " + ME + "Conceito 'B' Aprovado");
            } else if (MA >= 60 && MA < 75) {
                System.out.println("numero do aluno: " + NUMB + " nota: " + a + " " + b + " " + c + " media dos exercicios: " + ME + " media de aproveitamento: " + ME + "Conceito 'C' Aprovado");
            }
        } else if (MA < 60) {
            if (MA >= 40 && MA < 60) {
                System.out.println("numero do aluno: " + NUMB + " nota: " + a + " " + b + " " + c + " media dos exercicios: " + ME + " media de aproveitamento: " + ME + "Conceito 'D' Reprovado");
            } else if (MA < 40) {
                System.out.println("numero do aluno: " + NUMB + " nota: " + a + " " + b + " " + c + " media dos exercicios: " + ME + " media de aproveitamento: " + ME + "Conceito 'E' Reprovado");
            }
        }
    }
}