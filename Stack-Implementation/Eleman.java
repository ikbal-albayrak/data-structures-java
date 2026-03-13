package lab3soru3;

//Eleman sınıfı
public class Eleman {
 String isim;
 String soyisim;
 long telno;  // Telefon numarası için long kullanıldı
 int dt;

 Eleman(String isim, String soyisim, long telno, int dt) {
     this.isim = isim;
     this.soyisim = soyisim;
     this.telno = telno;
     this.dt = dt;
 }
}
