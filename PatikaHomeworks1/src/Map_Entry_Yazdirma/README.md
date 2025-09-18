# Ödev - Map içindeki Entry'leri Satır Satır Yazdırma

Bu program, Java'da `HashMap<String, Integer>` kullanarak bir map içindeki **key-value (anahtar-değer) çiftlerini** satır satır ekrana yazdırır.

## Kullanılan Yapılar
- **HashMap**: Key olarak `String`, value olarak `Integer` saklar.
- **entrySet()**: Map içindeki tüm girişleri (`Map.Entry`) elde etmek için kullanılır.
- **for-each döngüsü**: Entry'ler üzerinde dolaşarak ekrana yazdırır.

## Örnek Kod

        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

## Beklenen Çıktı


Ali = 85

Ayşe = 92

Mehmet = 78

Zeynep = 90

Burak = 88

## Notlar
HashMap sıralı değildir, yani çıktıdaki sıranın değişmesi mümkündür.

Eğer alfabetik sıralama istenirse TreeMap kullanılabilir.

