package academia;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cidade;
    protected String rua;
    protected String cpf;
    protected String cep;
    //usando o protected para as classes filhas herdarem os atributos 

    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Pessoa(String nome, String cidade, String rua, String cpf2, String cep2) {
        this.nome = nome;
        this.cidade = cidade;
        this.rua = rua;
        this.cpf = cpf;
        this.cep = cep;
    }

    public Pessoa(String nome2, String cidade2, String rua2, int cpf2, int cep2) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void cadastraPessoa(String nome, String cpf, String cidade, String rua, String cep){
        System.out.println("Digite as informações da pessoa que deseja cadastrar no sistema");
        System.out.println("Nome: ");
        nome = input.nextLine();
        System.out.println("CPF: ");
        System.out.println("Cidade: ");
        cidade = input.nextLine();
        System.out.println("Rua: ");
        rua = input.nextLine();
        System.out.println("CEP: ");
        cep = input.nextLine();
    }

    public void removerPessoa(String cpf){
        System.out.println("Digite o cpf da pessoa que deseja remover do sistema: ");
        cpf = input.nextLine();
        for(Pessoa pessoa : listaDePessoas){
            if(pessoa.getCpf().equals(cpf)) {
                listaDePessoas.remove(pessoa);
                System.out.println("Pessoa removida com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }

    public void editarPessoa(String cpf){
        System.out.println("Digite o cpf da pessoa que deseja alterar do sistema: ");
        cpf = input.nextLine();
        for(Pessoa pessoa : listaDePessoas){
            if(pessoa.getCpf().equals(cpf)){
                System.out.println("Digite as novas informções: ");

                String novoNome, novoCpf, novaCidade, novaRua, novoCep;

                System.out.println("Digite o nome: ");
                novoNome = input.nextLine();
                pessoa.setNome(novoNome);

                System.out.println("Digite o CPF: ");
                novoCpf = input.nextLine();
                pessoa.setCpf(novoCpf);

                System.out.println("Digite a cidade: ");
                novaCidade = input.nextLine();
                pessoa.setCidade(novaCidade);

                System.out.println("Digite o nome da rua: ");
                novaRua = input.nextLine();
                pessoa.setRua(novaRua);

                System.out.println("Digite o CEP: ");
                novoCep = input.nextLine();
                pessoa.setCep(novoCep);
            }
        }
    }

    public void listarPessoas(){
        for(Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }

    public void visualizarPessoa(String cpf) {
        System.out.println("Digite o CPF da pessoa que deseja visualizar: ");
        cpf = input.nextLine();
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("Informações da pessoa:");
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("CPF: " + pessoa.getCpf());
                System.out.println("Cidade: " + pessoa.getCidade());
                System.out.println("Rua: " + pessoa.getRua());
                System.out.println("CEP: " + pessoa.getCep());
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    } 
    
}