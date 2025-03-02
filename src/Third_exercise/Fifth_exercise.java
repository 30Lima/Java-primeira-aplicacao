package Third_exercise;

import java.util.Scanner;

public class Fifth_exercise {
    public static void main(String[] args) {
        /*Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        * */

        Scanner read_number = new Scanner(System.in);
        System.out.println("Please, type one number: ");
        int number = read_number.nextInt();
        //int verify = number % 2; -> não é necessária pois podemos realizar a conta dentro do IF.

        if(number % 2 == 0){
            System.out.println("The number " + number + " is EVEN.");
        }else{
            System.out.println("The number " + number + " is ODD.");
        }
        read_number.close(); //boa prática
    }
}
