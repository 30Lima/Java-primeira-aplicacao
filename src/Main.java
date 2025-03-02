public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPLano = true;
        double notaDoFilme = 8.1;

        //Média calculada com base nas notas da Jack, Paulo e Pedro
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                 Filme Top Gun Maverick
                 Filme de aventura com galã dos anos 80
                 Muito bom!
                 Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao; //Podemos fazer também int classificacao = (int) (media/2)
        classificacao = (int) (media/2); //Casting explícito
        System.out.println(classificacao);
    }
}