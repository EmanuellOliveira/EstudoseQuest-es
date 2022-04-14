package ExerciseCap123;

import java.util.Scanner;

public class Quest1e2e3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, rest, total;
        String oper;
        
        System.out.println("Digite 'M' para multiplicar, 'S' para somar ou 'D' para dividir: ");
        oper = input.nextLine();
        
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();


        if(oper.equalsIgnoreCase("M")){
            total = num1 * num2;
            System.out.println("O resultado da Multiplicação de " + num1 + " x " + num2 + " = " + total);       
        }
        if(oper.equalsIgnoreCase("S")){
            total = num1 + num2;
            System.out.println("O resultado da soma de " + num1 + " + " + num2 + " = " + total); 
        } 
        if(oper.equalsIgnoreCase("D") && num2 != 0){
            total = num1 / num2;
            rest = num1 % num2;
            System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " = " + total);   
            System.out.println("E o resto é: " + rest);
            }
        input.close();
    } 
}

