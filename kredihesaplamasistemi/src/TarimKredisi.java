public class TarimKredisi  extends Kredi  {
    // double  tarla ;
    private double tarla;

    public TarimKredisi (double krediTutari, double faizOrani,double tarla) {
        super (krediTutari, faizOrani);
        this.tarla = tarla;
    }

    public double getTarla() {
        return tarla;
    }

    public void setTarla(double tarla) {
        this.tarla = tarla;
       
    }
// interface 
    public void sigortaBilgisi () {
        System.out.println("Tarım kredisi sigortası çiftçi kapsamındadır.");
    }
    // abstract 
    public void hesapla() {
        double toplamBorc = krediTutari + (krediTutari * faizOrani / 100);
        System.out.println("Tarım Kredisi Toplam Borç: " + toplamBorc + " TL");
    }

    
} 
