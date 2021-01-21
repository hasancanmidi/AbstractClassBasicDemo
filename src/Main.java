public class Main {
    public static void main(String[] args) {

        MaasliIsci maaslıIsci = new MaasliIsci("Hasan Can","Midi",111,800);
        System.out.println(maaslıIsci);

        SaatlikIsci saatlikIsci = new SaatlikIsci("Mustafa","Samancı",222,120,7);
        System.out.println(saatlikIsci);

        KomisyonluIsci komisyonlu_isci = new KomisyonluIsci("Can","Roket",333,20,1);
        System.out.println(komisyonlu_isci);

        TabanMaasVeKomisyonluIsci tabanMaasVeKomisyonlu_isci = new TabanMaasVeKomisyonluIsci("Deniz","Reis",444,60,1,6000);
        System.out.println(tabanMaasVeKomisyonlu_isci);


    }
}
