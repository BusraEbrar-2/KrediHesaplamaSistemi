// banka adı ve adresi 

class Banka {
    private String bankaAdi;
    private String bankaAdresi;

    public Banka(String bankaAdi, String bankaAdresi) {
        this.bankaAdi = bankaAdi;
        this.bankaAdresi = bankaAdresi;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getBankaAdresi() {
        return bankaAdresi;
    }

    public void setBankaAdresi(String bankaAdresi) {
        this.bankaAdresi = bankaAdresi;
    }

    public void bankaBilgileriniYazdir() {
        System.out.println("Banka Adı: " + bankaAdi);
        System.out.println("Banka Adresi: " + bankaAdresi);
    }
}
