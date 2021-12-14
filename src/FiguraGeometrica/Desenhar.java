/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraGeometrica;

/**
 *
 * @author IFSC
 */
public class Desenhar {
     public static void main(String[] args) {
         Circulo cir = new Circulo();
         Lapis la = new Lapis (cir);
         cir.desenhar();
     }
}
