import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();
        List<String> grupoOutro = new ArrayList<>();

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidade = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo (M/F/O) da pessoa " + (i + 1) + ":");
            String sexo = scanner.nextLine().trim().toUpperCase();

            switch (sexo) {
                case "M":
                    grupoMasculino.add(nome);
                    break;
                case "F":
                    grupoFeminino.add(nome);
                    break;
                default:
                    grupoOutro.add(nome);
                    break;
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        System.out.println("\n--- Outros Gêneros ---");
        for (String nome : grupoOutro) {
            System.out.println(nome);
        }

        scanner.close();
    }
}