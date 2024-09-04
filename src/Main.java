import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Questão 1
        int indice = 13, soma = 0, k = 0;

        while (k<indice){
            k += 1;
            soma += k;
        }
        System.out.println("SOMA = " + soma );

        //Questão 2
        int x=34;
        if (isInSequence(x)){
            System.out.println(x + " Está na sequência!!");
        }else {
            System.out.println(x + " não está na sequência!!");
        }

        //Questão 3
        List<Faturamento> faturamentos = new ArrayList<>();

        faturamentos.add(new Faturamento(1, 22174.1664));
        faturamentos.add(new Faturamento(2, 24537.6698));
        faturamentos.add(new Faturamento(3, 26139.6134));
        faturamentos.add(new Faturamento(4, 0.0));
        faturamentos.add(new Faturamento(5, 0.0));
        faturamentos.add(new Faturamento(6, 26742.6612));
        faturamentos.add(new Faturamento(7, 0.0));
        faturamentos.add(new Faturamento(8, 42889.2258));
        faturamentos.add(new Faturamento(9, 46251.174));
        faturamentos.add(new Faturamento(10, 11191.4722));
        faturamentos.add(new Faturamento(11, 0.0));
        faturamentos.add(new Faturamento(12, 0.0));
        faturamentos.add(new Faturamento(13, 3847.4823));
        faturamentos.add(new Faturamento(14, 373.7838));
        faturamentos.add(new Faturamento(15, 2659.7563));
        faturamentos.add(new Faturamento(16, 48924.2448));
        faturamentos.add(new Faturamento(17, 18419.2614));
        faturamentos.add(new Faturamento(18, 0.0));
        faturamentos.add(new Faturamento(19, 0.0));
        faturamentos.add(new Faturamento(20, 35240.1826));
        faturamentos.add(new Faturamento(21, 43829.1667));
        faturamentos.add(new Faturamento(22, 18235.6852));
        faturamentos.add(new Faturamento(23, 4355.0662));
        faturamentos.add(new Faturamento(24, 13327.1025));
        faturamentos.add(new Faturamento(25, 0.0));
        faturamentos.add(new Faturamento(26, 0.0));
        faturamentos.add(new Faturamento(27, 25861.8318));
        faturamentos.add(new Faturamento(28, 1718.1221));
        faturamentos.add(new Faturamento(29, 13220.495));
        faturamentos.add(new Faturamento(30, 8414.61));

        double maiorValor = 0;

        for (Faturamento faturamento : faturamentos){
            if (faturamento.getValor() > maiorValor){
                maiorValor = faturamento.getValor();
            }
        }
        System.out.println("O maior faturamento foi: "+ maiorValor);

        double menorValor = 100000;

        for (Faturamento faturamento : faturamentos){
            if (faturamento.getValor() == 0.0){
                continue;
            }
            if (faturamento.getValor() < menorValor){
                menorValor = faturamento.getValor();
            }
        }
        System.out.println("O menor faturamento, desconsiderando fins de semana e feriados, foi: "+ menorValor);

        double somaMedia = 0, contadorMedia = 0, media;

        for (Faturamento faturamento : faturamentos){
            if (faturamento.getValor() == 0.0){
                continue;
            }
            somaMedia += faturamento.getValor();
            contadorMedia ++;
            }
        media = somaMedia/contadorMedia;

        int fatAcimaMedia = 0;

        for (Faturamento faturamento : faturamentos){
            if (faturamento.getValor()>media){
                fatAcimaMedia ++;
            }
        }
        System.out.println("O número de dias com faturamento acima da média foi: "+ fatAcimaMedia);

        //Questão 4
        List<Faturamento> faturamentoMensal = new ArrayList<>();

        faturamentoMensal.add(new Faturamento("sp", 67836.43));
        faturamentoMensal.add(new Faturamento("rj",36678.66));
        faturamentoMensal.add(new Faturamento("mg", 29229.88));
        faturamentoMensal.add(new Faturamento("es", 27165.48));
        faturamentoMensal.add(new Faturamento("Outros", 19849.53));

        double percentual, faturamentoTotal = 0;

        for (Faturamento faturamento : faturamentoMensal){
            faturamentoTotal += faturamento.getValor();
        }

        for (Faturamento faturamento : faturamentoMensal){
            percentual = (faturamento.getValor()/faturamentoTotal)*100;
            System.out.printf("O percentual de %s no valor total é: %.2f.", faturamento.estado, percentual);
        }

        //Questão 5

        String ordemDireta = "Testando";
        String ordemInvertida = "";

        char[] palavra = ordemDireta.toCharArray();

        for (int i = palavra.length - 1; i>=0 ; i--){
            ordemInvertida += palavra[i];
        }

        System.out.println("\nPalavra invertida: "+ ordemInvertida);

    }
    public static boolean isInSequence (int x){
        int a=0, b=1;

        if (x==a || x==b){
            return true;
        }

        int teste = a+b;
        while (teste <= x) {
            if (teste == x){
                return true;
            }
            a = b;
            b = teste;
            teste = a + b;
        }

        return false;

    }


}