public class Aluno extends Pessoa {
    public Aluno(String nome, String cpf) {
        // Envia informações para a super classe
        super(nome, cpf);
    }

    @Override
    public void calcularPontos(int minutos) {
        int pontos = minutos * 2;
        this.setPontos(pontos);
    }
}
