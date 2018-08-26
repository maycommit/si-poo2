public class Main {


    public static void main(String[] args) {
        PersonagemA personagemA = new PersonagemA();
        PersonagemB personagemB = new PersonagemB();
        PersonagemC personagemC = new PersonagemC();

        System.out.println("Personagem A:");
        personagemA.atacar();
        personagemA.pular();
        personagemA.correr();

        System.out.println("");
        System.out.println("Personagem B:");
        personagemB.atacar();
        personagemB.pular();
        personagemB.correr();

        System.out.println("");
        System.out.println("Personagem C:");
        personagemC.atacar();
        personagemC.pular();
        personagemC.correr();
    }
}
