package smartphone;

import smartphone.funcoes.ReprodutorMusical;
import smartphone.funcoes.NavegadorInternet;
import smartphone.funcoes.AparelhoTelefonico;
import smartphone.Iphone;

public class execucao {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        ReprodutorMusical reprodutorMusical = iPhone;
        NavegadorInternet navegadorInternet = iPhone;
        AparelhoTelefonico aparelhoTelefonico = iPhone;

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        aparelhoTelefonico.ligar("11 91038 1095");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }    
}