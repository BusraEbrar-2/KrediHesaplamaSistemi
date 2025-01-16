public class IsciKredisi extends Kredi implements Sigorta  {
    String üyeInfo ;

    public IsciKredisi (double krediTutari, double faizOrani,String üyeInfo) {
        this.üyeInfo = üyeInfo;
        super(krediTutari, faizOrani);
    }

    public String getÜyeInfo() {
        return üyeInfo;
    }

    public void setÜyeInfo(String üyeInfo) {
        this.üyeInfo = üyeInfo;
    }
    public void hesapla (){
        double toplamBorc = krediTutari + (krediTutari * faizOrani / 100);
        System.out.println("İşçi Kredisi Toplam Borç: " + toplamBorc + " TL");
    }
    public void sigortaBilgisi() {
        System.out.println("İşçi kredisi sigortası standarttır.");
    }



}
