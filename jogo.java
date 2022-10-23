import java.util.Scanner;

public class jogo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeP;
        String selecP = "0";
        String continua = "0";

        System.out.println("Digite um nome ao personagem: ");
        nomeP = teclado.next();
        Personagem p = new Personagem(nomeP);
        System.out.println("Ola " + nomeP + "!");

        while (continua == "0") {
            System.out.println("Selecione o numero do seu personagem: "
                                + "\n 1 - Cacador"
                                + "\n 2 - Comilao"
                                + "\n 3 - Soneca");
            selecP = teclado.next();

            switch (selecP) {
                case "1":
                    p.setStatus(10, 0, 0);
                    continua = "1";
                    p.getStatus();
                    break;
                case "2":
                    p.setStatus(6, 5, 2);
                    continua = "2";
                    p.getStatus();
                    break;
                case "3":
                    p.setStatus(1, 4, 7);
                    continua = "3";
                    p.getStatus();
                    break;
                default:
                    System.out.println("Voce digitou um comando invalido!");
            }
        }

        while (selecP !="4") {
            System.out.println("O que voce deseja fazer? "
                    + "\n 1 - Cacar"
                    + "\n 2 - Comer"
                    + "\n 3 - Dormir"
                    + "\n 4 - Sair");
            selecP = teclado.next();
            switch (selecP) {
                case "1":
                    p.cacar();
                    break;
                case "2":
                    p.comer();
                    break;
                case "3":
                    p.dormir();
                    break;
                case "4":
                    System.out.println("Saindo.");
                    break;
                case "5":

                    break;
                default:
                    System.out.println("Comando invalido");
            }
            p.getStatus();
        }
    }
}
