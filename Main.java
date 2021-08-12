package Exercicio;
//1.4
public class Main {
    public static void main(String[] args) {

        try {
            Lancha lanchas[] = new Lancha[5];
            Carro carros[] = new Carro[5];
            Aviao avioes[] = new Aviao[5];

            for (int i = 0; i < 5; i++) {
                Lancha lancha = new Lancha();
                lanchas[i] = lancha;
            }

            for (int i = 0; i < 5; i++) {
                Carro carro = new Carro();
                carros[i] = carro;
            }

            for (int i = 0; i < 5; i++) {
                Aviao aviao = new Aviao();
                avioes[i] = aviao;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}