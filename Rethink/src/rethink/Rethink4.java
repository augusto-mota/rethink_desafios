/*LINGUAGEM JAVA*/ package rethink;

public class Rethink4 {

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
        String nomes []= retornaNomes(pessoas);
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("'%s'", nomes[i]);
            if (i == pessoas.length - 1) {
                System.out.print("]\n");
            } else {
                System.out.print(",");
            }
            if (i % 4 == 0 && i != 0) {
                System.out.println();
            }
        }
    }

    static String[] retornaNomes(pessoas[] pessoas) {
        String[] nomes = new String[pessoas.length];
        System.out.print("[");
        String a = "";
        String b = "";
        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < pessoas[i].name.length(); j++) {
                b += pessoas[i].name.charAt(j);
                if (!b.equals(" ")) {
                    a += pessoas[i].name.charAt(j);
                    b = "";
                } else {
                    break;
                }
            }
            nomes [i] = a;
            a = "";
        }
        return nomes;
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
