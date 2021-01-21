public class SaatlikIsci extends Isci{
    int saatlikUcret;
    int calısanSaat;

    public SaatlikIsci(String isim, String soyIsim, int sosyalGuvenlikNumarası, int saatlikUcret, int calısanSaat) {
        super(isim, soyIsim, sosyalGuvenlikNumarası);
        this.saatlikUcret = saatlikUcret;
        this.calısanSaat = calısanSaat;
    }

    public int getSaatlikUcret() {
        return saatlikUcret;
    }

    public int getCalısanSaat() {
        return calısanSaat;
    }

    @Override
    void maasHesaplamaYontemi() {
        if (calısanSaat <= 40){
            System.out.println(saatlikUcret * calısanSaat);
        }
        else if (calısanSaat>40){
            System.out.println(40*saatlikUcret+(calısanSaat-40)*saatlikUcret*1.7);
        }
    }

    @Override
    public String toString() {
        return  " Saatlik İşçi : " + getIsim() + " " + getSoyIsim() +
                " Sosyal Güvenlik Numarası : " + getSosyalGuvenlikNumarası() +
                " Saatlik Ücret : " + saatlikUcret +
                " Çalışan Saat : " + calısanSaat ;
    }
}