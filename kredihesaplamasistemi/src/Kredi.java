abstract class Kredi {
    // kredi tutarı faiz oranı 
    // kredi bilgileri ekrana yazdır metod 

    // procted nerde 

    protected double krediTutari ;
protected double faizOrani ;


public Kredi(double krediTutari, double faizOrani) {
    this.krediTutari   = krediTutari;
    this.faizOrani = faizOrani;
}

public double  getKrediTutari() {
    return krediTutari;
}

public void setKrediTutari(int krediTutari) {
    this.krediTutari = krediTutari;
}

public double  getFaizOrani  () {
    return faizOrani;
}

public void setFaizOrani(int faizOrani) {
    this.faizOrani = faizOrani;
}
/*Kredi sınıfında hesapla adında bir metod yazın. 
Bu metod:
Tek parametre alarak faiz oranını hesaplasın.
İki parametre alarak faiz oranına ek olarak vade süresine göre
 ödeme planını hesaplasın. */

 public abstract void hesapla() ; // soyut metod 


 public void krediBilgileriniYazdir() {
    System.out.println("Kredi Tutarı: " + krediTutari + " TL");
    System.out.println("Faiz Oranı: " + faizOrani + "%");
}

 /*public void hesapla (){
    System.out.println("bişiler ");
}*/

}
