/*LINGUAGEM JAVA*/
package rethink;

import java.util.Scanner;

public class Rethink3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final pessoas pessoas[] = {
            new pessoas("Fabiana Araújo", 33),
            new pessoas("Gabriel Gomes", 25),
            new pessoas("Fernando Henrique", 17),
            new pessoas("Ana Luiza", 2),
            new pessoas("Geralda do Nascimento", 93),
            new pessoas("Miguel Souza", 70),
            new pessoas("Antonio Miguel", 69)
        };
        System.out.print("Entrada = ");
        pessoas s = buscarnome(scan.nextLine(), pessoas);
        if (s == null) {
            System.out.println("Error: Nome nao encontrado");
        } else {
            System.out.printf("{ name: \"%s\", age: %s }\n", s.name, s.age);
        }

    }

    public static pessoas buscarnome(String name, pessoas[] pessoas) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].name.equals(name)) {
                return pessoas[i];
            }
        }
        return null;
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
