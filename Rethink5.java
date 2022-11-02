/*LINGUAGEM JAVA*/ package rethink;

public class Rethink5 {

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
        inserirId(pessoas);
        buscar(pessoas);
    }

    static void inserirId(pessoas pessoas[]) {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].id = i + 1;
        }
    }

    static void buscar(pessoas[] pessoas) {
        System.out.println("[");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("   {id: %s, name: \"%s\", age: %s}\n", pessoas[i].id, pessoas[i].name, pessoas[i].age);
        }
        System.out.println("]");
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
