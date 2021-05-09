package tamanho;

import java.util.Scanner;

public class TamanhoString
{
    public TamanhoString() {
    }

    public int calculaTamanho(String s)
    {
        char[] caracteres = s.toCharArray();
        int soma = 0;
        for (char c: caracteres)
        {
            soma += 1;
        }
        return soma;
    }
}

class Main {
    public static void main(String[] args)
    {
        // cria uma instancia da classe tamanho.TamanhoString
        TamanhoString t = new TamanhoString();

        // cria um Scan para ler a entrada do usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a String que deseja calcular o tamanho: ");
        String input = scan.nextLine();

        scan.close();

        int tamanho = t.calculaTamanho(input);

        System.out.println("O tamanho da String inserida é: " + tamanho);
    }
}
