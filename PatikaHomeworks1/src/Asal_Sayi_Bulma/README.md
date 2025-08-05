# Asal Sayı Bulma Programı

Bu Java programı, kullanıcıdan bir sayı alarak bu sayının **asal** olup olmadığını kontrol eder.

## 📌 Özellikler
- Kullanıcıdan tam sayı girişi alır.
- Sayının **2'den başlayarak** kendinden küçük sayılara bölünüp bölünmediğini kontrol eder.
- Sonuç olarak sayının **asal** ya da **asal olmayan** sayı olduğunu ekrana yazdırır.

## 💻 Kullanım
1. Program çalıştırılır.
2. Konsola kontrol edilmek istenen sayı girilir.
3. Program sayının asal olup olmadığını ekrana yazdırır.

### Örnek Çalışma
Bir sayı giriniz: 7

7 asal bir sayıdır.


Bir sayı giriniz: 9

9 asal bir sayı DEĞİLDİR.



## 📂 Kod Açıklaması
- `Scanner` sınıfı ile kullanıcıdan veri alınır.
- Döngü (`for`) ile 2'den başlayarak girilen sayıya kadar tüm sayılara bölünüp bölünmediği kontrol edilir.
- Eğer sayı, bu aralıktaki herhangi bir sayıya tam bölünürse asal değildir.

## 🚀 Çalıştırma
1. Java dosyasını kaydedin: `AsalSayiBulma.java`
2. Derleyin:
   ```bash
   javac AsalSayiBulma.java

## Çalıştırın:



java AsalSayiBulma

## 📜 Not
Bu algoritma basit ve anlaşılır olması amacıyla tasarlanmıştır. Daha hızlı bir asal sayı kontrolü için sayının kareköküne kadar olan sayılarla kontrol yapılabilir.


