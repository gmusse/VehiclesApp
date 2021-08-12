package Exercicio;
//1.5
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        try {
            ArrayList<Lancha>lanchas = new ArrayList();
            ArrayList<Carro>carros = new ArrayList();
            ArrayList<Aviao>avioes = new ArrayList();

            for (int i = 0; i < 3; i++) {
                Lancha lancha = new Lancha();
                lanchas.add(lancha);
            }

            for (int i = 0; i < 3; i++) {
                Carro carro = new Carro();
                carros.add(carro);
            }

            for (int i = 0; i < 3; i++) {
                Aviao aviao = new Aviao();
                avioes.add(aviao);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
