import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.time.format.TextStyle;;

public class starting {
    public static void main(String[] args) {
        // String nome = "teste";
        // System.out.println("Olá " + nome);
        strings();
        tiposNumericos();
        boleanos();
        dateTime();
        condicionais();
        loops();
        arrays();
    }

    public static void tiposNumericos() {
        int a = 3;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        System.err.println("soma: " + soma);
        System.err.println("subtracao: " + subtracao);
        System.err.println("multiplicacao: " + multiplicacao);
        System.err.println("divisao " + divisao);
    }

    public static void boleanos() {
        boolean fimDeSemana = false;
        boolean fazSol = false;
        boolean vamosAPraia = fimDeSemana && fazSol;
        System.err.println("Vamos à praia " + vamosAPraia);

        // tabela verdade:
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // Operador ternário:
        String mensagem = vamosAPraia ? "Vamos à praia" : "Não vamos à praia";
        System.out.println(mensagem);
    }

    public static void condicionais() {
        int nota = 30;
        if (nota >= 70) {
            System.err.println("Aluno aprovado");
        } else {
            System.out.println("Aluno não aprovado");
        }
        // equivale ao código:
        System.out.println((nota >= 70) ? "Aluno aprovado" : "Não aprovado");
        String graduacao = "";
        // A 80 B 70 C 60 D 0
        if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else if (nota > 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Estudante aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Estudante reprovado");
                break;
            default:
                System.out.println("Houve algum problema com a nota do aluno");
                break;
        }
    }

    public static void strings() {
        String nome = "JoSé";
        String outro = "Jose";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.equalsIgnoreCase(outro));
    }

    public static void dateTime() {
        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();
        String diaDaSemana, saudacao;

        // System.out.println(hoje);
        Locale brasil = new Locale("Pt", "Br");
        diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        if (agora.getHour() <= 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }
        System.out.printf("%s%nHoje é %s e agora são %sh%n", saudacao, diaDaSemana, agora.getHour());
    }

    public static void loops() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%s x %s = %s%n", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void arrays() {
        int[] numeros = new int[5];
        String[] letras = { "A", "B", "C", "D", "E", "F" };
        int[] numerosAleatorios = { 8, 12, 2, 98, 13 };
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        System.err.println(Arrays.toString(letras));

        System.out.printf("maior\t%s\nmenor\t%s\n",
                maior(numerosAleatorios), menor(numerosAleatorios));
    }

    public static int maior(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static int menor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}