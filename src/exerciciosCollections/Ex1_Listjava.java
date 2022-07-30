package exerciciosCollections;
import java.util.*;

public class Ex1_Listjava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");
        
        //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        //calculando e exibindo a media das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da media
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        //exibindo o mes das temperaturas acima da media por extenso:
        System.out.println("\n\nMeses das temperaturas acima da media: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - marco: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Nao houve temperatura acima da media.");
                }
            }
            count++;
        }
    }
}
