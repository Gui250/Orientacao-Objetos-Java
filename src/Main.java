public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca", "Volkswagen", 1978, "preto");
        System.out.println(fusca.getLigado());
        Carro gol = new Carro("Gol", "Volkswagen", 1990, "branco");

        System.out.println(gol.getLigado());
        gol.acelerar("forte");
        gol.acelerar("fraco");

        System.out.println(gol.getAceleracao());
    }
}