package model;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {

        this("", 0);

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void leituraPrincipal() {

        setNome(JOptionPane.showInputDialog("Digite o nome"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do veiculo")));

    }
    
    public String mostrar() {
        return "nome: " + getNome() + "Kg" + ", " + "idade: " + getIdade();
    }
}
