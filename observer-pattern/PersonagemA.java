public class PersonagemA extends Personagem {

    public PersonagemA(int life, int x, int y) {
        setStrategy(new AtaqueForte(), new PuloMedio(), new CorridaMedia());
        setPosition(x, y);
        setLife(life);
    }
}
