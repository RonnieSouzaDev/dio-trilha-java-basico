/**
 * <h1>SmartTV</h1>
 * Classe SmartTV que simula o funcionamento de uma TV inteligente.
 * <p>
 * Permite ligar/desligar, aumentar/diminuir volume, mudar canais e navegar entre canais.
 * <p>
 * @author Ronnie de Souza
 * @version 1.0
 * @since 2023-10-01
 * <p>
 */

public class SmartTV {
    /**
     * Este metodo � utilizado para ligar a TV.
     * <p>
     * @param ligada Indica se a TV est� ligada ou n�o.
     * @param canal Indica o canal atual da TV.
     * @param volume Indica o volume atual da TV.
     * @return void
     */

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (!ligada)
            System.out.println("Ligando a TV...");
        else
            System.out.println("A TV j� est� ligada.");
        ligada = true;
    }

    public void desligar() {
        if (ligada)
            System.out.println("Desligando a TV...");
        else
            System.out.println("A TV j� est� desligada.");
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100 && ligada)
            volume++;
        else if (volume >= 100)
            System.out.println("Volume m�ximo atingido.");
        else
            System.out.println("A TV est� desligada, n�o � poss�vel aumentar o volume.");
    }

    public void diminuirVolume() {
        if (volume > 0 && ligada)
            volume--;
        else if (volume <= 0)
            System.out.println("Volume m�nimo atingido.");
        else
            System.out.println("A TV est� desligada, n�o � poss�vel diminuir o volume.");
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0  && ligada)
            canal = novoCanal;
        else if (novoCanal <= 0)
            System.out.println("Canal inv�lido. O canal deve ser maior que 0.");
        else
            System.out.println("A TV est� desligada, n�o � poss�vel mudar o canal.");
    }

    public void canalAnterior() {
        if (canal > 1 && ligada)
            canal--;
        else if (canal <= 1)
            System.out.println("Voc� j� est� no canal 1.");
        else
            System.out.println("A TV est� desligada, n�o � poss�vel mudar o canal.");
    }

    public void canalSeguinte() {
        if (ligada && canal < 100)
            canal++;
        else if (canal >= 100)
            System.out.println("Voc� j� est� no canal 100.");
        else
            System.out.println("A TV est� desligada, n�o � poss�vel mudar o canal.");
    }
}
