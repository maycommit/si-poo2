public class PersonagemB extends Personagem {

    public PersonagemB() {
        setStrategy(new AtaqueMedio(), new PuloAlto(), new CorridaRapida());
    }
}
