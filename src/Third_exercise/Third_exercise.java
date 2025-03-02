package Third_exercise;

import java.util.Scanner;

public class Third_exercise {
    public static void main(String[] args) {
        /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
        Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

        Scanner read_option = new Scanner(System.in);
        System.out.println("Please, select one option: \n" +
                "1 - Calculate area of the square.\n" +
                "2 - Calculate area of the circle.");
        int option = read_option.nextInt();

        if (option == 1){
            System.out.println("Please, enter the side length of the square.: ");
            int lado = read_option.nextInt();
            double area_quadrado = lado * lado;
            System.out.println("The area of the square is: " + area_quadrado);
        }else if(option == 2) {
            System.out.println("Please, enter the radius of the circle: ");
            double area = read_option.nextDouble();
            double area_circuclo = 3.1416 * (area * area);
            System.out.println("The area of the circle is:" + area_circuclo);
        }else {
            System.out.println("ERROR");
        }
    }
}
