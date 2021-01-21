public class KomisyonluIsci extends Isci{
    private int brutSatis;
    private int komisyonOranı;

    public KomisyonluIsci(String isim, String soyIsim, int sosyalGuvenlikNumarası, int brutSatis, int komisyonOranı) {
        super(isim, soyIsim, sosyalGuvenlikNumarası);
        this.brutSatis = brutSatis;
        this.komisyonOranı = komisyonOranı;
    }

    public int getBrutSatis() {
        return brutSatis;
    }

    public int getKomisyonOranı() {
        return komisyonOranı;
    }

    @Override
    void maasHesaplamaYontemi(){
        System.out.println(komisyonOranı*brutSatis);
    }
    @Override
    public String toString() {
        return  " Komisyonlu İşçi : " + getIsim() + " " +getSoyIsim() +
                " Sosyal Güvenlik Numarası : " + getSosyalGuvenlikNumarası() +
                " Brüt Satış : " + brutSatis +
                " Komisyon Oranı : " + komisyonOranı ;

    }
}