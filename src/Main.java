import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //variaveis
        String nome = "Autor: Washington";
        System.out.println(nome);
        int a;
        int b =2;
        a=3;
        int soma = a+b;
        int subtracao = a-b;
        int multiplicacao = a*b;
        float divisao = (float)a/b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        //operador booleano
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        //operador ternario
        String mensagem = fimDeSemana ? "E fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);


    }


}