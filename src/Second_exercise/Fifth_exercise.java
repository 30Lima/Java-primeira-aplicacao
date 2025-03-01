package Second_exercise;

public class Fifth_exercise {
    public static void main(String[] args) {
        /*
         * Declare uma variável do tipo double valorEmDolares.
         * Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
         * Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         * */

        double valorDolars = 4.94;
        double quantidade_real = 5;

        double conversao = valorDolars * quantidade_real;

        System.out.println("Converting five dollars to real(BRL): " + conversao);
    }
}
