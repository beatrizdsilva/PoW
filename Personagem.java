import java.util.ArrayList;
import java.util.Random;
public class Personagem {

    protected ArrayList<Personagem> personagens;
    protected String nome;
    protected int forca,inteligencia,agilidade;

    Random random = new Random();
    protected int experiencia = random.nextInt(25) + 1;

    public Personagem(String nome, int forca, int inteligencia, int agilidade, Random random) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }

    @Override
    public String toString() {
        return "Personagem =>>" +
                " nome = '" + nome + '\'' +
                ", forca = " + forca +
                ", inteligencia = " + inteligencia +
                ", agilidade = " + agilidade +
                ", experiencia = " + experiencia + "*******" + personagens;
    }
}
