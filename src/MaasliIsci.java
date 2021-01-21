public  class MaasliIsci extends Isci {
    int haftalıkMaas;

    public MaasliIsci(String isim, String soyIsim, int sosyalGuvenlikNumarası, int haftalıkMaas) {
        super(isim, soyIsim, sosyalGuvenlikNumarası);
        this.haftalıkMaas = haftalıkMaas;
    }

    @Override
    void maasHesaplamaYontemi() {
        System.out.println(haftalıkMaas*4);
    }

    public int getHaftalıkMaas() {
        return haftalıkMaas;
    }

    @Override
    public String toString() {
        return  " Komisyonlu İşçi : " + getIsim() + " " + getSoyIsim() +
                " Sosyal Güvenlik Numarası : " + getSosyalGuvenlikNumarası() +
                " Haftalık Maaş " + haftalıkMaas ;

    }
}
