package academia;
import java.util.ArrayList;
import java.util.Scanner;


public class Instrutor extends Pessoa {
    private String caef;

    public Instrutor(String caef, String nome, String cidade, String rua, String cpf, String cep) {
        super(nome, cidade, rua, cpf, cep);
        this.caef = caef;
    }

    public void setCaef(String novoCaef) {
        this.caef = caef;
    }

    Scanner input = new Scanner(System.in);
    ArrayList<Instrutor> listaDeInstrutor = new ArrayList<>();

    @Override
    public void cadastraPessoa(String nome, String cpf, String cidade, String rua, String cep){
        super.cadastraPessoa(nome, cpf, cidade, rua, cep);
        this.caef = input.nextLine();
    }

    public void visualizarPessoa(String caef){
        super.visualizarPessoa(caef);
    }

    public void editarInstrutor(int caef){
        System.out.println("Digite o cpf da pessoa que deseja alterar do sistema: ");
        cpf = input.nextLine();
        for(Instrutor instrutor : listaDeInstrutor){
            if(instrutor.caef.equals(caef)){
                System.out.println("Digite as novas informções: ");

                String novoNome, novoCpf, novaCidade, novaRua, novoCep, novoCaef;

                System.out.println("Digite o nome: ");
                novoNome = input.nextLine();
                instrutor.setNome(novoNome);

                System.out.println("Digite o CPF: ");
                novoCpf = input.nextLine();
                instrutor.setCpf(novoCpf);

                System.out.println("Digite a cidade: ");
                novaCidade = input.nextLine();
                instrutor.setCidade(novaCidade);

                System.out.println("Digite o nome da rua: ");
                novaRua = input.nextLine();
                instrutor.setRua(novaRua);

                System.out.println("Digite o CEP: ");
                novoCep = input.nextLine();
                instrutor.setCep(novoCep);

                System.out.println("Digite o novo CAEF: ");
                novoCaef = input.nextLine();
                instrutor.setCaef(novoCaef);
            }
        }
    }

    public void removerInstrutor(String caef){
        System.out.println("Digite o CAEF do instrutor que deseja remover do sistema: ");
        caef = input.nextLine();
        for(Instrutor instrutor : listaDeInstrutor){
            if (instrutor.caef.equals(caef)) {
                listaDeInstrutor.remove(instrutor);
                System.out.println("Instrutor removido com sucesso!");
                return;
            }
        }
        System.out.println("Instrutor não encontrado!");
    }

    public void listarInstrutor(){
        for(Instrutor instrutor : listaDeInstrutor){
            System.out.println(instrutor);
        }
    }
}