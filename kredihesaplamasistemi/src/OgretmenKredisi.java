public class OgretmenKredisi extends Kredi implements Sigorta {
    int year ;

    public OgretmenKredisi(int year,double  krediTutari, double  faizOrani) {
        this.year = year;
        super (krediTutari, faizOrani);
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void hesapla (){
        double toplamBorc = krediTutari + (krediTutari * faizOrani / 100);
        System.out.println("Öğretmen Kredisi Toplam Borç: " + toplamBorc + " TL");
    }
    public void sigortaBilgisi() {
        System.out.println("Öğretmen kredisi sigortası meslek yılına göre farklılık gösterir.");
    }
    
    
}
