import java.util.Random;

public class Personagem {
    //atributos 
    private String nome;
    private int energia, fome, sono;
    private boolean rand;
    int comida = 0;

    //construtor
    Personagem(String nome) {
        this.nome = nome;
    }

    //metodos
    public String getNome(String nome) {
        return nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }

    //comportamentos
    public void cacar() {
        Random gerador = new Random();
        rand = gerador.nextBoolean();
        if (this.energia > 2) {
            this.sono = this.sono + 1;
            this.fome = this.fome + 1;
            this.energia = this.energia - 2;
            sono();
            morrer();
            if (rand == true) {
                System.out.println("---------------------------------");
                System.out.println("Encontrou comida!");
                System.out.println("---------------------------------");
                this.comida = this.comida + 1;
            } else {
                System.out.println("---------------------------------");
                System.out.println("Nao encontrou comida.");
                System.out.println("---------------------------------");
            }

        } else {
            System.out.println("---------------------------------");
            System.out.println("Sem energia suficiente");
            System.out.println("---------------------------------");
        }
    }

    public void comer() {
        if (comida > 0) {
            if (this.fome > 1) {
                
                System.out.println("---------------------------------");
                System.out.println("Comendo...");
                System.out.println("---------------------------------");
                this.fome = 0;
                this.energia = this.energia - 1;
                this.sono = this.sono + 2;
                this.comida = 0;
                sono();
            } else {
                System.out.println("---------------------------------");
                System.out.println("Estou sem fome!");
                System.out.println("---------------------------------");
            }
        } else {
            System.out.println("---------------------------------");
            System.out.println("Você nao tem comida.");
            System.out.println("---------------------------------");
        }
    }

    public void dormir() {
        if (this.sono > 3) {
            System.out.println("---------------------------------");
            System.out.println("ZzZzZzZ");
            this.sono = 0;
            this.energia = 10;
            this.fome = this.fome + 2;
            morrer();
            System.out.println("Acordei!");
            System.out.println("---------------------------------");
        } else {
            System.out.println("---------------------------------");
            System.out.println("Estou sem sono!");
            System.out.println("---------------------------------");
        }
    }

    public void sono() {
        if (this.sono > 7) {
            System.out.println("---------------------------------");
            System.out.println("Estou com sono, vou dormir!");
            dormir();
        }
    }

    void setStatus(int energia, int fome, int sono) {
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }

    public void getStatus() {
        System.out.println("---------------------------------");
        System.out.println("Fome: " + this.fome 
                + "\nEnergia: " + this.energia 
                + "\nSono: " + this.sono);
        System.out.println("---------------------------------");
    }

    public void morrer() {
        if (this.fome == 10) {
            getStatus();
            System.out.println("---------------------------------");
            System.out.println("VOCE ME MATOU DE FOME IDIOTA! o.o");
            System.out.println("           GAME OVER");
            System.out.println("---------------------------------");
            System.exit(0);                   
        }
    }

}
