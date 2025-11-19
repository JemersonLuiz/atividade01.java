import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = teclado.nextInt();

        // nome do arquivo: tabuada_num.txt
        String nomeArquivo = "tabuada_" + num + ".txt";

        try (PrintWriter gravador = new PrintWriter(new FileWriter(nomeArquivo))) {

            for (int i = 1; i <= 10; i++) {
                gravador.println(num + " x " + i + " = " + (num * i));
            }

            System.out.println("Tabuada salva no arquivo: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        teclado.close();
    }
}
