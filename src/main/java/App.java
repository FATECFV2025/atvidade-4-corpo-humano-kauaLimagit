import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CorpoHumano c1 = new CorpoHumano(0, 0, 0, 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a massa!");
        float massa = sc.nextFloat();

        System.out.println("Digite o volume!");
        float volume = sc.nextFloat();

        System.out.println("Digite a densidade!");
        float densidade = sc.nextFloat();

        System.out.println("Digite a altura!");
        float altura = sc.nextFloat();

        c1.setDensidade(densidade);
        c1.setMassa(massa);
        c1.setVolume(volume);
        c1.setAltura(altura);

        System.out.println("Valores iniciais");

        System.out.println("massa: " + c1.getMassa() + " kg volume: " + c1.getVolume() + " m³ densidade: " + c1.getDensidade() + " kg/(m³) altura: " + c1.getAltura() + " m IMC: " + (c1.imc()));

        System.out.println("Digite a nova massa!");
        massa = sc.nextFloat();

        System.out.println("Digite o nova altura!");
        altura = sc.nextFloat();
        

        c1.setMassa(massa);
        c1.setAltura(altura);

        System.out.println("Novos Valores");

        System.out.println("massa: " + c1.getMassa() + " kg altura: " + c1.getAltura() + " m novo IMC: " + (c1.imc()));

        sc.close();

    }
}

