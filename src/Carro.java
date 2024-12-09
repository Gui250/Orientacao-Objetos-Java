public class Carro {
   public int ano;
   public String modelo;
   public String marca;
   public String cor;
   public boolean ligado;
   public int aceleracao;

   public Carro(String modelo, String marca, int ano, String cor) {
      this.modelo = modelo;
      this.marca = marca;
      this.ano = ano;
      this.cor = cor;
      this.ligado = false;
      this.aceleracao = 0;
   }

   public void ligar() {
      if(this.ligado) {
         return;
      }
      this.ligado = true;
   }

   public void desligar() {
      if(!this.ligado) {
         return;
      }
      this.aceleracao = 0;
      this.ligado = false;
   }

   public void acelerar(String tipoAceleracao) {
         switch(tipoAceleracao) {
            case "forte":
               this.aceleracao += 1000;
               break;
            case "fraco":
               this.aceleracao += 500;
               break;
         }
   }


   public void acelerar() {
         this.aceleracao += 750;
   }

}
