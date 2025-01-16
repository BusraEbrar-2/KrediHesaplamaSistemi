public class BankaUygulamasi {
    public static void main(String[] args) {
        // İşçi Kredisi
        IsciKredisi isciKredisi = new IsciKredisi(50000, 1.5, "ahmetçakir");
        isciKredisi.hesapla();
        isciKredisi.sigortaBilgisi();

        System.out.println(); 
    
    // tür geçişi instance of 
/*Bir metot yazın ve 
bu metodun parametresi olarak bir 
Kredi nesnesi alın. 
Gelen nesnenin türüne göre (örneğin, IsciKredisi, TarimKredisi, OgretmenKredisi) farklı işlemler gerçekleştirin. */
    
TarimKredisi tarimKredisi = new TarimKredisi(75000, 2.0, 10.5);
krediTuruKontrol(tarimKredisi);
    
    }
    public static  void krediTuruKontrol(Kredi kredi) {
        if (kredi instanceof TarimKredisi) {
            System.out.println("Bu bir Tarım Kredisi nesnesidir.");
        } }
    }

