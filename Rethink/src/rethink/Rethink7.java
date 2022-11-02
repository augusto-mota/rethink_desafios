/*LINGUAGEM JAVA*/ package rethink;

public class Rethink7 {

    public static void main(String[] args) {
        final pessoas pessoas[] = {
            new pessoas("Fabiana Araújo", 33),
            new pessoas("Gabriel Gomes", 25),
            new pessoas("Fernando Henrique", 17),
            new pessoas("Ana Luiza", 2),
            new pessoas("Geralda do Nascimento", 93),
            new pessoas("Miguel Souza", 70),
            new pessoas("Antonio Miguel", 69)
        };
        System.out.printf("Media de idades: %.2f\n", mediaIdade(pessoas));
    }

    static double mediaIdade(pessoas[] pessoas) {
        float soma = 0;
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].age;
        }
        return soma / pessoas.length;
    }

    static class pessoas {

        String name;
        int age;
        int id;

        public pessoas(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
