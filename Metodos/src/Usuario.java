public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.aumentarVolume();
        System.out.println("Volume ap�s aumentar: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Volume ap�s diminuir: " + smartTV.volume);

        smartTV.mudarCanal(5);
        System.out.println("Canal ap�s mudar: " + smartTV.canal);

        smartTV.canalAnterior();
        System.out.println("Canal ap�s canal anterior: " + smartTV.canal);

        smartTV.canalSeguinte();
        System.out.println("Canal ap�s canal seguinte: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.desligar(); // Teste para desligar a TV novamente
        System.out.println("Tentando desligar novamente a TV...");
        smartTV.ligar(); // Teste para ligar a TV novamente
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.mudarCanal(0); // Teste com canal inv�lido
        smartTV.mudarCanal(101); // Teste com canal inv�lido
        smartTV.aumentarVolume(); // Teste para aumentar volume quando a TV est� desligada
        smartTV.ligar(); // Ligar a TV novamente para testar o aumento de volume
        smartTV.aumentarVolume(); // Aumentar volume com a TV ligada
        smartTV.diminuirVolume(); // Diminuir volume com a TV ligada
        smartTV.diminuirVolume(); // Diminuir volume novamente
        smartTV.diminuirVolume(); // Diminuir volume at� o m�nimo
        smartTV.diminuirVolume(); // Tentativa de diminuir volume abaixo do m�nimo
        smartTV.canalAnterior(); // Teste para canal anterior quando j� est� no canal 1
        smartTV.canalSeguinte(); // Teste para canal seguinte quando a TV est� desligada

    }
}
