# Tip Donusum Java Uygulaması

Bu Java projesi, kullanıcıdan alınan bir tam sayı (`int`) ve bir ondalıklı sayı (`double`) üzerinde **tip dönüşümleri** yaparak sonuçlarını ekrana yazdırır. Uygulamanın amacı, Java'da temel veri tipi dönüşümlerini öğretmek ve görselleştirmektir.

## 🧠 Ne Öğrenilir?

- `int` ➡️ `double` dönüşümü (genişletme - widening)
- `double` ➡️ `int` dönüşümü (daraltma - narrowing / casting)
- Scanner sınıfı ile kullanıcıdan veri alma

## 🔧 Kullanılan Teknolojiler

- Java (JDK 8 ve üzeri)
- `Scanner` sınıfı (girdi almak için)

## 📁 Proje Dosyası

### `TipDonusum.java`

Bu dosyada şunlar gerçekleştirilir:
1. Kullanıcıdan bir `int` ve bir `double` sayı alınır.
2. `int` sayı `double`'a dönüştürülür.
3. `double` sayı `int`'e dönüştürülür (ondalık kısmı atılır).
4. Tüm sonuçlar ekrana yazdırılır.

## ▶️ Çalıştırma

1. Java kurulu olmalıdır.
2. Terminal veya IDE üzerinden şu komutlarla çalıştırabilirsiniz:

```bash
javac TipDonusum.java
java TipDonusum

## ✅ Örnek Çıktı

Bir tam sayı girin: 42
Bir ondalıklı sayı (double) girin: 3.14

--- Dönüştürme Sonuçları ---
Tam sayı (int): 42
Tam sayının double hali: 42.0
Ondalıklı sayı (double): 3.14
Ondalıklı sayının int hali: 3