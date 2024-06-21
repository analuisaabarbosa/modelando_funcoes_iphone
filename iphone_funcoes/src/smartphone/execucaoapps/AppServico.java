package smartphone.execucaoapps;

import smartphone.apps.AparelhoTelefonico;
import smartphone.apps.NavegadorInternet;
import smartphone.apps.ReprodutorMusical;

public class AppServico implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada.");
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

    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página.");
    }
   

    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}