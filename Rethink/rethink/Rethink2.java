/*LINGUAGEM JAVA*/ package rethink;

public class Rethink2 {

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
    }

    static class pessoas {

        String name;
        int age;

        public pessoas(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
