package academia;

public class Aluno extends Pessoa {
    public int idDoAluno;
    public boolean universitario; 
    
    public Aluno(int idDoAluno, boolean universitario, String nome, String cidade, String rua, String cpf, String cep){
        super(nome, cidade, rua, cpf, cep);
        this.idDoAluno = idDoAluno;
        this.universitario = universitario;
    }

    @Override
    public void cadastraPessoa(String nome, String cpf, String cidade, String rua, String cep) {
        super.cadastraPessoa(nome, cpf, cidade, rua, cep);
        System.out.println("Digite o ID do Aluno: ");
        this.idDoAluno = input.nextInt();
        input.nextLine(); 
    }

    public void removerPessoa(String cpf){
        super.removerPessoa(cpf);
    }

    public void listaDePessoas(){
        super.listarPessoas();
    }

    public void editarPessoa(String cpf){
        super.editarPessoa(cpf);
    }

    public void visualizarPessoa(){
        super.visualizarPessoa(cpf);
    }

    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                ", idDoAluno=" + idDoAluno +
                ", universitario=" + universitario +
                '}';
    }
}
