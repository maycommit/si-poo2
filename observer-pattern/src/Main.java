import javax.swing.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        PersonagemA personagemA = new PersonagemA(100, 0, 0);
        PersonagemB personagemB = new PersonagemB();
        PersonagemC personagemC = new PersonagemC();



        Inimigo inimigoA = new Inimigo(2, 10);
        Inimigo inimigoB = new Inimigo(20,20);
        Inimigo inimigoC = new Inimigo(10,10);

        personagemA.addObserver(inimigoA);
        personagemA.addObserver(inimigoB);
        personagemA.addObserver(inimigoC);

        while (true) {
            personagemA.show();
            Thread.sleep(500);
        }
        
    }
}
