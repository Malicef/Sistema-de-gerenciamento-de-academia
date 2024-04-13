package academia;
//import java.util.ArrayList;
import java.util.List;

public class Plano {
    private String nome;
    private float valor;

    public Plano(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void editarPlano() {
        System.out.println("Plano editado com sucesso.");
    }
public void removerPlano() {
        System.out.println("Plano removido com sucesso.");
    }

    public void visualizarPlano() {
        System.out.println("Nome do plano: " + nome);
        System.out.println("Valor do plano: " + valor);
    }

    public static void listaPlanos(List<Plano> planos) {
        for (Plano plano : planos) {
            plano.visualizarPlano();
        }
    }

    public boolean ehUniversitario() {
        return nome.toLowerCase().contains("universitario");
    }
}
