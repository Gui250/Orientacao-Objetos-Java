public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca", "Volkswagen", 1978, "preto");
        System.out.println(fusca.getLigado());
        Carro gol = new Carro("Gol", "Volkswagen", 1990, "branco");

        System.out.println(gol.getLigado());
        gol.acelerar("forte");
        gol.acelerar("fraco");
        System.out.println(gol.getCor());
        gol.setCor("Azul");
        System.out.println(gol.getAceleracao());
        System.out.println(gol.getCor());
        System.out.println(gol.getIdade());

       Aluno boby = new Aluno("Boby", "12345678900");
       Professor joao = new Professor("João", "23451678910", 100000);
       Pessoa maria = new Pessoa("Maria", "912345678910");
    }
}