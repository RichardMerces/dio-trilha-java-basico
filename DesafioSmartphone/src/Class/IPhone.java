package Class;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;


public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //Aparelho Telefonico
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    public void atender() {
        System.out.println("Atendeu!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciou Correio de Voz!");
    }

    //Navegador Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar Página!");
    }


    // Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando!");
    }

    public void pausar() {
        System.out.println("Pausando!");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica);
    }
}
