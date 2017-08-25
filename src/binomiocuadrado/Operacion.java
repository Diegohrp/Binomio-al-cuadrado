/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomiocuadrado;

/**
 *
 * @author Hernandez Velazquez Angel y Herrera Prado Diego
 */
public class Operacion {
    //En esta clase se realizan todas las operaciones logicas del sistema
    private String numero="";
    //Metodo constructor
    public Operacion(){
        
    }
    // Este metodo nos da el numero de enmedio ya que es el quew lleva una mayor logica
    public String signo(int X, int N){
       int inter=0;
       inter = 2*X;
       inter = inter* N;
       String sig="";
       sig = Integer.toString(inter);
       if(sig.charAt(0)=='-'){
           this.numero="-";
           for (int i = 1; i < sig.length(); i++) {
            this.numero +=sig.charAt(i);
       }
       }else{
           this.numero="+";
           for (int i = 0; i < sig.length(); i++) {
            this.numero +=sig.charAt(i);
       }
       }
       
       
       return this.numero; 
    }
   //Este metodo nos da la cadena del final
    public String resul(int x, int n){
        String resul="";
        int x2 =0;
        int n2 = 0;
        
        x2 = x*x;
        n2 = n*n;
        
        
        resul = Integer.toString(x2)+ " X² "+this.numero +  " X +" + Integer.toString(n2);
        
        return resul;
    }
    
}
