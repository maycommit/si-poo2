public class PersonagemC extends Personagem {

    public PersonagemC() {
        setStrategy(new AtaqueForte(), new PuloBaixo(), new CorridaRapida());
    }
}
