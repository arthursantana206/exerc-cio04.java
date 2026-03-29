// Nome: Arthur Gabriel Santana dos Santos 
// Matrícula: 1261940088

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Valor inválido.");
        } else {
            int i = 1;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
            System.out.println("Contagem concluída.");
        }

        input.close();
    }
}
