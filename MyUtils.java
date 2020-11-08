/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mehmetmehdikarakocodev1;

/**
 *
 * @author Mehdi
 */
public class MyUtils {


    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    public static float ucgenAlan(float a,float b, float c){
       float u=(a+b+c)/2;        
       return (float)Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }
     public static float ucgenCevre(float a,float b, float c){
         return a+b+c;    
        }
     public static float cokgenCevre(float[]kenarlar){
         float cevre=0;
         for (int i = 0; i < kenarlar.length; i++) {
             cevre+=kenarlar[i];
         }
         return cevre;
     }
     public static float cokgenAlan(float[][] kenarkoordinatlari){
         //Düzgün olmayan bir çokgenin alanını belirlemek köşe koordinatlarını bildiğinde mümkündür.
         //koordinatları -3,2;5,8...formatinda bir matris olarak alıyoruz
          float top1=0,top2=0;
          
          for (int i = 0; i < kenarkoordinatlari.length-1; i++) {          
                   top1+=kenarkoordinatlari[i][0]+kenarkoordinatlari[i+1][1]; 
                   top2+=kenarkoordinatlari[i][1]+kenarkoordinatlari[i+1][0];                       
         }
           return (top1-top2)/2;
           //Kaynak: https://www.wikihow.com.tr/Bir-%C3%87okgenin-Alan%C4%B1-Nas%C4%B1l-Hesaplan%C4%B1r
     }
     public static double[] donustur(int[] sayilar){
         double[] sonuclar=new double[sayilar.length];
         for (int i = 0; i < sayilar.length; i++) {
             sonuclar[i]=f2(f1(sayilar[i]));
         }
       return sonuclar;  
     }
     public static double f1(int x){
         return  (3*Math.pow(x,2)-2*Math.exp(x)+Math.sqrt(x));
     }
     public static double f2(double x){
         return  (1/(1+Math.exp(x)));
     }
}
