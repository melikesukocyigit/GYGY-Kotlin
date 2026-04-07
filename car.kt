package com.example.kotlin.models
// Her dosya bir paketin altında tanımlanır.

// eğer belirtilmediyse public
// bu şekilde tanımlama => class içi değişkene otomatik atanır
class Car(var brand: String, var model: String, var year: Int) {

    init {
        // Constructor çalıştığında çalışan blok.
        println("Car sınıfından bir nesne oluşturuldu.") 
    }

    fun rent() {
        println("$brand $model araba kiralandi.") // Classın fonksiyonu => classın alanlarına erişebiliriz.
    }
}

class Car2 {
    // Class içi değişken manual yönetilmelidir
    constructor(brand: String, model: String, year: Int) {
        println("Car2 sınıfından bir nesne oluşturuldu.") 
    }

    fun rent() {
        println("$brand Car2 araba kiralandi.") 
    }
}
// Bir kalıp

fun main() {
    var car1: Car = Car("BMW", "M3", 2020) // sanki bi fonk. çağırıyor gibi.
    car1.rent()

    var car2: Car2 = Car2("Audi", "A4", 2019)
    car2.rent()
    // Constructor => Yapıcı fonksiyon
}