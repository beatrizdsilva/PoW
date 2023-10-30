import java.util.Random;

public class Guerreiro extends Personagem{
    private boolean armadura;

    private String armaCurtoAlc;

    public Guerreiro(String nome, int forca, int inteligencia, int agilidade, Random random, boolean armadura, String armaCurtoAlc) {
        super(nome, forca, inteligencia, agilidade, random);
        this.armadura = armadura;
        this.armaCurtoAlc = armaCurtoAlc;
    }

    public boolean isArmadura() {
        return armadura;
    }

    public void setArmadura(boolean armadura) {
        this.armadura = armadura;
    }

    public String getArmaCurtoAlc() {
        return armaCurtoAlc;
    }

    public void setArmaCurtoAlc(String armaCurtoAlc) {
        this.armaCurtoAlc = armaCurtoAlc;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", armadura = " + armadura +
                ", arma de curto alcance = " + armaCurtoAlc;
    }
}
