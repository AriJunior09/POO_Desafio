package POO_Desafio.iphone;

import POO_Desafio.aparelhoAudio.Reprodutor;
import POO_Desafio.aparelhoInternet.Navegador;
import POO_Desafio.aparelhoTelefonico.Telefone;

public class Iphone implements Telefone, Navegador, Reprodutor{

    public void ligar(){
        System.out.println("Ligando para contato via Iphone");
    }

    public void atender(){
        System.out.println("Atendendo a Chamada no Iphone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Atendendo a Chamada no Iphone");
    }

    public void exibirPagina(){
        System.out.println("Exibindo Página da Internet no Iphone");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no navegador no Iphone");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a Página no Iphone");
    }

    public void tocar(){
        System.out.println("Tocando Música no Iphone");
    }

    public void pausar(){
        System.out.println("Pausando Música no Iphone");
    }

    public void SelecionarMusica(){
        System.out.println("Selecionando Música no Iphone");
    }
    
}