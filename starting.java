public class starting {
    public static void main(String[] args) {
        // String nome = "teste";
        // System.out.println("Olá " + nome);
        boleanos(args);
        condicionais(args);
        strings(args);
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

    public static void boleanos(String[] args) {
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

    public static void condicionais(String[] args) {
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

    public static void strings(String[] args) {
        String nome = "JoSé";
        String outro = "Jose";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.equalsIgnoreCase(outro));
    }
}