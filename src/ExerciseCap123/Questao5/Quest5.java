package ExerciseCap123.Questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Quest5class> prodCadastro = new ArrayList<>();

        prodCadastro.add(new Quest5class("Arroz", 4.56));
        prodCadastro.add(new Quest5class("Feijão", 4.99));
        prodCadastro.add(new Quest5class("Farinha", 5.00));

        System.out.println(prodCadastro.toString());

        


    }
}
