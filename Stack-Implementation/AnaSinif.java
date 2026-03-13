package lab3soru3;

//Ana sınıf
public class AnaSinif {
 public static void main(String[] args) {
     BagliListeKuyruk kuyruk = new BagliListeKuyruk();

     // Kuyruğa eleman ekleme
     kuyruk.ekle(new Eleman("Ali", "Yılmaz", 1234567890L, 1990));
     kuyruk.ekle(new Eleman("Ayşe", "Kara", 2345678901L, 1995));
     kuyruk.ekle(new Eleman("Mehmet", "Demir", 3456789012L, 1985));

     // Kuyruktaki elemanları yazdırma
     System.out.println("Kuyruk elemanları:");
     kuyruk.yazdir();

     // Kuyruktan eleman çekme
     System.out.println("\nKuyruktan çekilen eleman:");
     Eleman cekilen = kuyruk.cek();
     if (cekilen != null) {
         System.out.println("İsim: " + cekilen.isim + ", Soyisim: " + cekilen.soyisim + 
                            ", Telefon No: " + cekilen.telno + ", Doğum Tarihi: " + cekilen.dt);
     }

     // Kuyruktaki eleman sayısını gösterme
     System.out.println("\nKuyruktaki eleman sayısı: " + kuyruk.elemanSayisi());
     System.out.println("\nKuyruk elemanları:");
     kuyruk.yazdir();
 }
}
