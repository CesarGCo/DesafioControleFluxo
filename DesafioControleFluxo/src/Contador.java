import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args){

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = terminal.nextInt();

        try{

            conta(numero1, numero2);
        }
        catch(ParametrosInvalidosException e){

            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
   }
   
   public static void conta(int valor1, int valor2) throws ParametrosInvalidosException{

        if(valor1 > valor2){

            throw new ParametrosInvalidosException();
        }

        int contagem = valor2 - valor1;

        for(int indice = 1; indice <= contagem; indice++){

            System.out.println("Imprimindo o número " + indice);
        }
   }    

}