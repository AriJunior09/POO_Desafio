package POO_Desafio.fabrica;

import POO_Desafio.iphone.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funções de Telefone no IPhone:-------------------------");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        System.out.println("\nFunções de Navegador no IPhone:-----------------------");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\nFunções de Navegador no IPhone:-----------------------");
        iphone.tocar();
        iphone.pausar();
        iphone.SelecionarMusica();
        System.out.println("\n \n FIM \n");
       

    }
    
}
