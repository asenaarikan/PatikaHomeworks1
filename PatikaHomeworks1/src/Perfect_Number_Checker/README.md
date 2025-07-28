# 📊 Mükemmel Sayı Kontrol Programı (Java)

## 📌 Proje Açıklaması
Bu Java programı, kullanıcıdan pozitif bir tamsayı alarak bu sayının **mükemmel bir sayı** olup olmadığını kontrol eder.  
Mükemmel sayı, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayılardır.  
Örneğin: 6, 28 ve 496 mükemmel sayılardır.

---

## 🛠️ Kullanılan Teknolojiler
- Java 17+ (veya Java 8+)
- Scanner sınıfı (Kullanıcıdan giriş almak için)
- Temel döngüler ve koşullu ifadeler

---

## 🚀 Nasıl Çalışır?
Program kullanıcıdan pozitif bir sayı alır ve şu adımları takip eder:
1. Girilen sayı negatifse kullanıcı uyarılır.
2. Girilen sayı `0` ise program sonlandırılır.
3. Girilen sayının 1’den küçük tüm bölenleri toplanır.
4. Toplam, sayının kendisine eşitse bu bir mükemmel sayıdır.

---

## ▶️ Örnek Kullanım
Bir sayı giriniz (çıkmak için 0 yazın): 28
28 bir mükemmel sayıdır.

Bir sayı giriniz (çıkmak için 0 yazın): 12
12 bir mükemmel sayı değildir.

Bir sayı giriniz (çıkmak için 0 yazın): 0
Programdan çıkılıyor...

---

## 📦 Derleme ve Çalıştırma

```bash
# Java dosyasını derleyin
javac PerfectNumberChecker.java

# Programı çalıştırın
java PerfectNumberChecker

📚 Ek Bilgi
Mükemmel Sayı Nedir?
Bir sayının pozitif bölenleri (kendisi hariç) toplamı sayının kendisine eşitse bu sayı mükemmeldir.

📎 Örnek:

6 → 1 + 2 + 3 = 6

28 → 1 + 2 + 4 + 7 + 14 = 28

🧑‍💻 Geliştiren
Asena Yağmur Arıkan
Eğitim amaçlı hazırlanmıştır. İsterseniz projeye katkıda bulunabilir veya geliştirebilirsiniz.
