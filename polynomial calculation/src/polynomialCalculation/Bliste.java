
package polynomialCalculation;

class Polinom{
    int katsayı,derece;
    
    Polinom ileri;

    
    
    public Polinom(int katsayı, int derece) {
        this.katsayı = katsayı;
        this.derece = derece;        
        ileri =null;
    }
    
}
public class Bliste {
    Polinom bas,son;

    public Bliste() {
        bas=null;
        son=null;
    }
   
    
    void sortedInsert(Polinom yeni)
{
     Polinom tmp;
     
     /* Liste boş veya tek eleman varsa*/
       if (bas == null || bas.derece>= yeni.derece) {
         yeni.ileri = bas;
         bas = yeni;
        }
         else {
            
            tmp = bas;
            while (tmp.ileri != null && tmp.ileri.derece < yeni.derece)
                tmp = tmp.ileri;
                yeni.ileri = tmp.ileri;
                tmp.ileri = yeni;
              }
}
    public String listele(){
            Polinom gecici=bas;
            String s="";
            while (gecici!=null) {
                s+=gecici.katsayı+"x"+"^"+gecici.derece+"+";
                System.out.print(gecici.katsayı+"x"+"^"+gecici.derece+"+");
                gecici=gecici.ileri;
            }
            return s;
        }
    Polinom reverse(Polinom Polinom) {
      Polinom prev = null;
        Polinom current = Polinom;
        Polinom next = null;
        while (current != null) 
            {
                next = current.ileri;
                current.ileri = prev;
                prev = current;
                current = next;
            }
            Polinom = prev;
            return Polinom;
}
    public int polinomHesap(Polinom tmp,int x){
        tmp=bas;
        int sonuc=0;
        
        while (tmp!=null) {            
            sonuc=(int) (sonuc+(tmp.katsayı*Math.pow(x, tmp.derece)));
            
            tmp=tmp.ileri;
        }
        return sonuc;
    }
    public int tekSayı(){
        Polinom tmp=bas;
        int tekAdet=0;
        
        while (tmp!=null) {            
            if (tmp.katsayı%2==1) {
                tekAdet++;
            }
            
            tmp=tmp.ileri;
        }
        return tekAdet;
    }
        public int ciftSayı(){
        Polinom tmp=bas;
        int ciftAdet=0;
        while (tmp!=null) {            
            if (tmp.katsayı%2==0) {
                ciftAdet++;
            }
            tmp=tmp.ileri;
        }
        return ciftAdet;
    }

}
