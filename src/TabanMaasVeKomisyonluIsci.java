public class TabanMaasVeKomisyonluIsci extends Isci{
    int brutSatış;
    int komisyonOranı;
    int tabanMaas;

    public TabanMaasVeKomisyonluIsci(String isim, String soyIsim, int sosyalGuvenlikNumarası, int brutSatış, int komisyonOranı, int tabanMaas){
        super(isim , soyIsim, sosyalGuvenlikNumarası);
        this.brutSatış = brutSatış;
        this.komisyonOranı = komisyonOranı;
        this.tabanMaas = tabanMaas;
    }

    public int getBrutSatış() {
        return brutSatış;
    }

    public int getKomisyonOranı() {
        return komisyonOranı;
    }

    public int getTabanMaas() {
        return tabanMaas;
    }

    @Override
    void maasHesaplamaYontemi() {
        System.out.println((komisyonOranı*brutSatış)+tabanMaas);
    }
    @Override
    public String toString() {
        return  " Taban Maaş ve Komisyonlu İşçi : " + getIsim() + " " + getSoyIsim() +
                " Sosyal Güvenlik Numarası : " + getSosyalGuvenlikNumarası() +
                " Brut Satış : " + brutSatış +
                " Komisyon Oranı : " + komisyonOranı +
                " Taban Maaş : " + tabanMaas ;
    }
}
