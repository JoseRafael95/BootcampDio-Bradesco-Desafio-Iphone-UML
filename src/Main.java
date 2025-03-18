import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int entrada;


        do{

            System.out.println("ESCOLHA UMA FUNÇÃO DO IPHONE\n");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("4 - Exibir página");
            System.out.println("5 - Adicionar aba");
            System.out.println("6 - Atualizar página");
            System.out.println("7 - Selecionar música");
            System.out.println("8 - Tocar música");
            System.out.println("9 - Pausar música");
            System.out.println("0 - para sair");
            entrada = scanner.nextInt();
            switch (entrada){
                case 1:
                    System.out.println("Digite um numero de telefone: ");
                     int numero = scanner.nextInt();
                    iphone.ligar(numero);
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 4:
                    System.out.println("Digite um url: ");
                    String url = scanner.next();
                    iphone.exibirPagina(url);
                    break;
                case 5:
                    iphone.adicionarNovaAba();
                    break;
                case 6:
                    iphone.atualizarPagina();
                    break;
                case 7:
                    System.out.println("Digite o nome de uma música: ");
                    String musica = scanner.next();
                    iphone.selecionarMusica(musica);
                    break;
                case 8:
                    iphone.tocarMusica();
                    break;
                case 9:
                    iphone.pausarMusica();
                    break;


            }

        }while(entrada != 0);

    }
}
