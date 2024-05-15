package POO_Desafio.aparelhoAudio;

public class Mp3 implements Reprodutor {
    public void tocar(){
        SelecionarMusica();
        System.out.println("Tocando Música");
    }

    public void pausar(){
        System.out.println("Pausando Música");
    }

    public void SelecionarMusica(){
        System.out.println("Selecionando Música");
    }
}
