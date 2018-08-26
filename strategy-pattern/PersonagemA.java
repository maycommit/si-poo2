public class PersonagemA extends Personagem {

    public PersonagemA() {
        setStrategy(new AtaqueForte(), new PuloMedio(), new CorridaMedia());
    }
}
