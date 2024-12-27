public class Aluno extends Pessoa implements Usuario {
    public Aluno(String nome, String cpf) {
        // Envia informações para a super classe
        super(nome, cpf);
    }

    @Override
    public void calcularPontos(int minutos) {
        int pontos = minutos * 2;
        this.setPontos(pontos);
    }


    public String imprimirSaudacao() {
        return "Aluno(a): " + this.getNome();
    }
}
