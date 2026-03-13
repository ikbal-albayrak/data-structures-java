package lab3soru3;

//Bağlı liste kuyruk sınıfı
class BagliListeKuyruk {
 private static class Node {
     Eleman eleman;
     Node sonraki;

     Node(Eleman eleman) {
         this.eleman = eleman;
         this.sonraki = null;
     }
 }

 private Node on; // Kuyruğun önündeki eleman
 private Node son; // Kuyruğun sonundaki eleman
 private int boyut; // Kuyruktaki eleman sayısı

 public BagliListeKuyruk() {
     on = null;
     son = null;
     boyut = 0; // Başlangıçta kuyruk boş
 }

 // Kuyruğa eleman ekleme
 public void ekle(Eleman eleman) {
     Node yeniNode = new Node(eleman);
     if (son != null) {
         son.sonraki = yeniNode; // Mevcut son düğümün sonraki düğümünü yeni düğüm yap
     }
     son = yeniNode; // Son düğümü güncelle
     if (on == null) { // Eğer kuyruk boşsa
         on = yeniNode; // Ön düğümü de yeni düğüm yap
     }
     boyut++;
 }

 // Kuyruktan eleman çekme
 public Eleman cek() {
     if (on == null) {
         System.out.println("Kuyruk boş!");
         return null;
     }
     Eleman cekilen = on.eleman;
     on = on.sonraki; // Ön düğümü bir sonraki düğüme güncelle
     if (on == null) { // Eğer kuyruk boşaldıysa
         son = null; // Sonu da null yap
     }
     boyut--;
     return cekilen;
 }

 // Kuyruktaki eleman sayısını döndürme
 public int elemanSayisi() {
     return boyut;
 }

 // Kuyruktaki elemanları yazdırma
 public void yazdir() {
     Node gecici = on;
     while (gecici != null) {
         System.out.println("İsim: " + gecici.eleman.isim + ", Soyisim: " + gecici.eleman.soyisim + 
                            ", Telefon No: " + gecici.eleman.telno + ", Doğum Tarihi: " + gecici.eleman.dt);
         gecici = gecici.sonraki;
     }
 }
}
