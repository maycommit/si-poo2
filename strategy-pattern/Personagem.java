public abstract class Personagem {

    private Atacar a;
    private Pular p;
    private Correr c;

    public void setStrategy(Atacar ataque, Pular pular, Correr correr) {
        this.a = ataque;
        this.p = pular;
        this.c = correr;
    }

    public void atacar() {
        a.atacar();
    }

    public void pular() {
        p.pular();
    }

    public void correr() {
        c.correr();
    }

}
