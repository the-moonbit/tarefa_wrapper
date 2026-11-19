import java.util.Scanner;

public class ConversorPrimitivoWrapper {
    public static void main(String[] args) {
        //inicializa o scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico inteiro: ");
        
        //ler do console e armazenar em uma variável de tipo primitiva
        int valorPrimitivo = scanner.nextInt();

        //fazer a conversão para o tipo wrapper;
        Integer valorWrapper = valorPrimitivo; 

        System.out.println("----------------------------------------");
        System.out.println("Valor primitivo lido: " + valorPrimitivo);
        System.out.println("Valor convertido (Wrapper - Integer): " + valorWrapper);
        System.out.println("Tipo do objeto wrapper: " + valorWrapper.getClass().getName());
        System.out.println("----------------------------------------");

        scanner.close();
    }
}