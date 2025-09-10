
import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];

        // Receber as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }

        // Calcular médias bimestrais (2 notas por bimestre)
        double media1 = (notas[0] + notas[1]) / 2;
        double media2 = (notas[2] + notas[3]) / 2;
        double media3 = (notas[4] + notas[5]) / 2;
        double media4 = (notas[6] + notas[7]) / 2;

        // Calcular médias semestrais
        double semestre1 = (media1 + media2) / 2;
        double semestre2 = (media3 + media4) / 2;

        // Calcular média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibir resultados
        System.out.println("\n1º Bimestre: " + media1);
        System.out.println("2º Bimestre: " + media2);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("--------------------");
        System.out.println("3º Bimestre: " + media3);
        System.out.println("4º Bimestre: " + media4);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("--------------------");
        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}