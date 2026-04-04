fun main() {
    selamVer()
    selamVer2("Ahmet")

    var not1 = notHesapla(85,"Halit") // ekrana yaz
    var not2 = notHesapla(72) // mail atmak
    var not3 = notHesapla(30, "Mehmet") // sms atmak

    // named args
    var not4 = notHesapla(isim="Ayse", not=95)

    println(not1)
    println(not2)
    println(not4)
    // not2'yi email at
    // not3'ü sms at
}

// Programlamada fonksiyon => 
// Bir işi birden fazla kez yapıyorsam => Tekrarlamak yerine, tek bir noktadan çağırmak doğrudur.

// Fonksiyonlar => Bir işi yapan, isimlendirilmiş bloklardır.

fun selamVer() {
    println("Merhaba")
}

// parametreler
fun selamVer2(isim:String) {
    println("Merhaba $isim")
}

// Fonksiyonlar bir şey döndürmeyen (void,Unit) olabilirler,
// bir şey döndürebilirler (return) olabilirler.

// default parameter => fonksiyon çağırılırken parametre verilmezse, default olarak atanacak değerdir.
fun notHesapla(not:Int, isim:String="Ogrenci"): String {
    return when(not){
        in 90..100 -> "$isim AA"
        in 80..89 -> "$isim BA"
        in 70..79 -> "$isim BB"
        in 60..69 -> "$isim CB"
        in 50..59 -> "$isim CC"
        in 40..49 -> "$isim DC"
        in 30..39 -> "$isim DD"
        in 0..29 -> "$isim FF"
        else -> "$isim Geçersiz not"
    }
}

// Bank.kt dosyası oluşturalım.
// Bir bankacılık uygulaması (OOP yok)
// Min 5. adet bankacılık uygulamasında olması gerektiğini düşündüğünüz fonksiyonu tanımlayalım.
// Main fonksiyonunda da bu fonksiyonları çağırıp test edelim.