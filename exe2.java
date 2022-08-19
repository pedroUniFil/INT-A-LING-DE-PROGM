/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoensw;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class NewClass {
    
    public static void main(String[] args){
        String nome, civil;
        int sexo;
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.printf("insira seu nome:\n");
        nome = sc.nextLine();
        System.out.println("insira seu estado civil:\n");
        civil = sc.nextLine();
        System.out.println("insira seu sexo:\n");
        sexo = sc.nextInt();
        if(sexo == 2 && civil == "casada"){
            System.out.printf("\ninforme sua idade:");
            idade = sc.nextInt();
    }else{
            System.out.printf("\ntchau");
        }
        System.out.printf("acabou");
    }
    
}
