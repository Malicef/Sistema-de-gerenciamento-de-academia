package academia;

public class Aluno extends Pessoa {
    public int idDoAluno;
    public boolean universitario; 
    
    public Aluno(int idDoAluno, boolean universitario, String nome, String cidade, String rua, String cpf, String cep){
        super(nome, cidade, rua, cpf, cep);
        this.idDoAluno = idDoAluno;
        this.universitario = universitario;
    }

    
}
