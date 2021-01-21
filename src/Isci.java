public abstract class Isci {
    String isim;
    String soyIsim;
    int sosyalGuvenlikNumarası;

    public Isci(String isim, String soyIsim, int sosyalGuvenlikNumarası) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.sosyalGuvenlikNumarası = sosyalGuvenlikNumarası;
    }

    abstract void maasHesaplamaYontemi();

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public int getSosyalGuvenlikNumarası() {
        return sosyalGuvenlikNumarası;
    }

    @Override
    public String toString() {
        return  " Komisyonlu İşçi : " +
                this.isim + " " +
                this.soyIsim +
                " Sosyal Güvenlik Numarası : " + sosyalGuvenlikNumarası ;
    }
}
