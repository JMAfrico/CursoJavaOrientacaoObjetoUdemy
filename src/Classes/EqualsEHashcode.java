/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


public class EqualsEHashcode {
    
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email="pedro.silva@gmail.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email="pedro.silva@gmail.com";
        
       // System.out.println(u1 == u2);//VERIFICANDO SE U1 É IGUAL A U2
        System.out.println(u1.equals(u2));//VERIFICANDO SE U1 É IGUAL A U2
        
        
    }
}
