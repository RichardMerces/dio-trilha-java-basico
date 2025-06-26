import Class.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        iPhone.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        iPhone.selecionarMusica("musica");
        iPhone.tocar();
        iPhone.pausar();
    }
}
