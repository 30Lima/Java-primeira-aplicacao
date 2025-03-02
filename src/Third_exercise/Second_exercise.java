package Third_exercise;

import java.util.Scanner;

public class Second_exercise {
    public static void main(String[] args) {
        /*
        * Peça ao usuário para inserir dois números inteiros.
        * Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        * */

        /*Input bloco*/
        Scanner read_user = new Scanner(System.in);
        System.out.println("Please, enter an integer: ");
        int first_number = read_user.nextInt();
        System.out.println("Please, enter one more an integer: ");
        int second_number = read_user.nextInt();
        /**/

        /*Conditions*/
        if (first_number == second_number){
            System.out.println("The numbers are the same.");
        }else if(first_number != second_number){
            System.out.println("The numbers are different.");
        }if(first_number > second_number){
            System.out.println("Number one is bigger.");
        }else if(second_number > first_number){
            System.out.println("Number two is bigger.");
        }else{
            System.out.println("ERROR");
        }
    }
}
