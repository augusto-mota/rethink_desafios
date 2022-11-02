/*LINGUAGEM JAVA*/ package rethink;

public class Rethink6 {

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
        pessoas suficiente[] = buscarMaior(pessoas);
        for (int i = 0; i < suficiente.length; i++) {
            if (suficiente[i] != null) {
            System.out.printf("{id: %s, name: \"%s\", age: %s }\n",
                    suficiente[i].id, suficiente[i].name, suficiente[i].age);
            }else{
                break;
            }
        }
    }

    static void inserirId(pessoas pessoas[]) {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].id = i + 1;
        }
    }

    static pessoas[] buscarMaior(pessoas[] pessoas) {
        pessoas suficiente[] = new pessoas[pessoas.length];
        for (int i = 0, j = 0; i < suficiente.length; i++) {
            if (pessoas[i].age >= 18) {
                suficiente[j] = pessoas[i];
                j++;
            }
        }
        return suficiente;
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
