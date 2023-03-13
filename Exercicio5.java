import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("===========================================\n");
        System.out.print("\nDigite uma string: ");
        String palavra = input.nextLine();
        String reversed = "";
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reversed += palavra.charAt(i);
        }
        System.out.print("\n===========================================\n");
        System.out.println("A string invertida é: " + reversed);
        System.out.print("===========================================\n");
    }
}