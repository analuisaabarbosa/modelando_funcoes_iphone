package smartphone;

import smartphone.funcoes.AparelhoTelefonico;
import smartphone.funcoes.NavegadorInternet;
import smartphone.funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando.");
    }

    public void atender() {
        System.out.println("Atendeu.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

}
