public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar(int numeroTelefone) {
        System.out.println("Ligando pra o número: " + numeroTelefone );
    }

    @Override
    public void atender() {
        System.out.println("O iPhone foi atendido");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O iPhone iniciou o correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("O iPhone exibiu a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O iPhone adicionou uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O iPhone atualizou a página");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("O iphone selecionou a música: " + nome );
    }

    @Override
    public void tocarMusica() {
        System.out.println("O iPhone está tocando a música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("O iphone pausou a música");
    }
}
