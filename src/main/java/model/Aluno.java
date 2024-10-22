
package model;

import javax.swing.JOptionPane;


public class Aluno extends Pessoa {
    
    private String curso;
    
    public Aluno() {
        this("","",0);
    }



    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
        public void leituraAluno() {

        setNome(JOptionPane.showInputDialog("Digite o nome"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do veiculo")));

    }
    public String mostrarAluno() {
        super.mostrar();
        return "Peso do veiculo: " + getNome() + "Kg" + ", " + "Velocidade maxima do veiculo: " + getIdade();
    }
}


