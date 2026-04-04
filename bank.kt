
var bakiye: Double = 2500.0

fun main() {
    println("--- Banka İşlem Ekranı ---")
    
    selamla("Melike")
    paraYatir(500.0) 
    
    var islemSonucu = paraCek(200.0)
    println(islemSonucu)
    
    var krediNotu = krediSorgula(750)
    println("Kredi Durumu: $krediNotu")
    
    dekontKes(150.0)
    
    println("İşlemler bitti. Son bakiye: $bakiye TL")
}

// --- FONKSİYONLAR ---

fun selamla(isim: String) {
    println("Merhaba $isim, Bankamıza Hoş Geldin.")
}

fun paraYatir(miktar: Double) {
    bakiye += miktar
    println("$miktar TL yatırıldı. Yeni bakiye: $bakiye")
}

fun paraCek(miktar: Double): String {
    if (bakiye >= miktar) 
    {
        bakiye -= miktar
        return "$miktar TL çekildi. Kalan: $bakiye"
    } 
    else 
    {
        return "Hata: Yetersiz bakiye!"
    }
}

fun krediSorgula(puan: Int): String {
    if (puan >= 501 && puan <= 1000) 
    {
        return "Yetki verildi. Kredi Alabilir."
    } 
    else if (puan >= 0 && puan <= 500) 
    {
        return "Yetki verilmedi. Kredi Alamaz."
    } 
    else 
    {
        return "Geçersiz Puan."
    }
}

fun dekontKes(tutar: Double, isim: String = "Müşteri") {
    println("Sayın $isim, $tutar TL işleminiz kaydedildi.")
}