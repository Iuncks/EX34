package model;

public class Professor extends Pessoa {

    private String titulo;
    private double salario;

    public Professor() {
        
        this("", 0.0, "", 0);
    }



    public Professor(String titulo, double salario, String nome, int idade) {
        super(nome, idade);
        this.titulo = titulo;
        this.salario = salario;
    }



    public String getTitulo() {
        return titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String mostrarProfessor() {
        super.mostrar();
        return "nome: " + getNome() + "idade: " + getIdade() + "titulo: " + getTitulo() + "getSalario" + getSalario();
    }
}
