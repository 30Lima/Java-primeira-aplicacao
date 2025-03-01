package Second_exercise;

public class Sixth_exercise {
    public static void main(String[] args) {
        /*
         * Declare uma variável do tipo double precoOriginal.
         Atribua um valor em reais a essa variável, representando o preço original de um produto.
         Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de
         desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço
         original e imprima o novo preço com desconto.
         */

        double originalPrice = 300.50;
        double percentageDiscount = 10;

        double value = originalPrice * percentageDiscount / 100;

        System.out.println("Value with discount: " + value);
    }
}
