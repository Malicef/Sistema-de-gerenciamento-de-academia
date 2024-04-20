package academia;
import java.util.Scanner;
import java.util.ArrayList;

public class Treino {
    public String[] diaDoTreino;
    public String treino;

    public Treino() {
        this.diaDoTreino = new String[7];
    }

    ArrayList<Treino> listaDeTreino = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void cadastrarTreino(String treino, String dia) {
        int indiceDia = converterDia(dia);

        if (indiceDia >= 0 && indiceDia < 7) {
            diaDoTreino[indiceDia] = treino;
            System.out.println("Treino do dia " + dia + " cadastrado com sucesso: " + treino);
        } else {
            System.out.println("Dia da semana inválido.");
        }
    }

    private int converterDia(String dia) {
        switch (dia.toLowerCase()) {
            case "domingo":
                return 0;
            case "segunda":
                return 1;
            case "terca":
                return 2;
            case "quarta":
                return 3;
            case "quinta":
                return 4;
            case "sexta":
                return 5;
            case "sabado":
                return 6;
            default:
                return -1;
        }
    }

    public void removerTreino(){
        System.out.println("Digite o dia da semana que deseja remover do sistema: ");
        String dia = input.nextLine();
        boolean removido = false;
        for(Treino treino : this.listaDeTreino){
            if(treino.diaDoTreino.equals(dia)) {
                this.listaDeTreino.remove(treino);
                removido = true;
                System.out.println("Treino do dia " + dia + " removido com sucesso!");
                break;
                }
            }
            if (!removido) {
                System.out.println("Treino do dia " + dia + " não encontrado na lista.");
            }
        }

    public void editarTreino(){

    }

    public void listarTreino(){

    }

    public void visualizarTreino(){

    }
}
