import javax.swing.text.html.HTMLDocument;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*
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

        //Condicionais
        int nota = 1;
        String graduacao;

        // A=80,  B=70, C=60, D=0
        if (nota>=80){
            graduacao = "A";
        } else if (nota<80 && nota >=70) {
            graduacao = "B";
        } else if (nota<70 && nota >=60) {
            graduacao = "C";
        } else if (nota<60 && nota >=0) {
            graduacao = "D";
        }else {
            graduacao = "";
        }
        //Estrutura Switch
        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado !");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Graduação invalida");
        }

        // Representando datas
        String nome = "Washington Gomes";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt" , "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour()>= 12 && agora.getHour() < 18){
            saudacao = "Bom dia ! ! !";
        }else if (agora.getHour() >= 12 && agora.getHour()<18){
            saudacao = "Boa tarde ! ! !";
        }else if(agora.getHour()>18 && agora.getHour()<24){
            saudacao = "Boa noite ! ! !";
        }else{
            saudacao = "Olá";
        }
        System.out.printf("Olá, %s. Hoje é %s %s %n", nome, diaSemana, saudacao.toUpperCase() );

         */
            for(int i=1; i<=10; i++){
                for(int j=1; j<=10; j++)
                    System.out.println(j + " X " + i + "=" + j * i);
                    // 1x1=1
                    // 2x1=2
            }

    }
}