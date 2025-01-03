public class Professor extends Pessoa implements Usuario {
    private int salario;

    public Professor(String nome, String cpf, int salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    @Override
    public void calcularPontos(int minutos) {
        int pontos = minutos * 3;
        this.setPontos(pontos);
    }


    public String imprimirSaudacao() {
        return "Olá professor: " + this.getNome();
    }
}
