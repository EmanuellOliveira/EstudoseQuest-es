package ExerciseCap123;

import java.util.Scanner;

public class Quest4 {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int peso1 = 2;
        int peso2 = 3;
        double nota1, nota2;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        media = ((nota1*peso1)+(nota2*peso2))/(peso1+peso2);

        System.out.println("A média ponderada da nota [" + nota1 + "] e [" + nota2 + "] é igual a [" + media + "] ");
        
    }
}
