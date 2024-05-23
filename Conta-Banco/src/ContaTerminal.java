import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e Importar a Classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nossos usários
        System.out.println("Digite Número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da sua agência");
        String Agencia = scanner.next();
        
        System.out.println("Digite o nome do títular da conta");
        String nomeCliente = scanner.next();
        nomeCliente = scanner.nextLine();
        
        
        System.out.println("Digite o seu saldo: ");
        double saldoConta = scanner.nextDouble();


        //Obter pela classe scanner  os valores digitados no terminal
    


        //Exibir a mensagem criada 

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é \n"+Agencia+", Conta: "+numeroConta+" e seu Saldo: "+saldoConta+" já está disponível para saque ");
    
        scanner.close();
    }
}
