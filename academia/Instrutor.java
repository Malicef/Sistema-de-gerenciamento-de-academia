package academia;
public class Instrutor extends Pessoa {
    private int caef;

    public Instrutor(int caef, String nome, String cidade, String rua, int cpf, int cep) {
        super(nome, cidade, rua, cpf, cep);
        this.caef = caef;
    }

    public int getCaef() {
        return caef;
    }

    public void setCaef(int caef) {
        this.caef = caef;
    }

}
