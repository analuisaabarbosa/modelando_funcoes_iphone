package smartphone.ios;
import smartphone.apps.AparelhoTelefonico;
import smartphone.apps.NavegadorInternet;
import smartphone.apps.ReprodutorMusical;
import smartphone.execucaoapps.AppServico;

public class Iphone {
    public static void main(String[] args) {
        AppServico appServico = new AppServico();
        ReprodutorMusical reprodutorMusical = appServico;
        NavegadorInternet navegadorInternet = appServico;
        AparelhoTelefonico aparelhoTelefonico = appServico;

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        navegadorInternet.exibirPagina("www.dio.me");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        aparelhoTelefonico.ligar("11 91083-2387");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }
    
}