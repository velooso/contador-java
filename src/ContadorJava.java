import java.util.Scanner;

public class ContadorJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tBem-vindo(a) ao programa Contador Java!");
        System.out.println("Digite um número inteiro: ");
        int first = sc.nextInt();
        System.out.println("Agora digite um número inteiro que seja maior que o número anterior: ");
        int second = sc.nextInt();

        try{
            contar(first, second);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    } static void contar (int first, int second) throws ParametrosInvalidosException{

        if (first >= second){
            throw new ParametrosInvalidosException();
        }
        int diferenca = second - first;

        for (int x = 1; x <= diferenca; x++){
            System.out.println("Imprimindo numero: " + x);
        }
    }
}
