package com.example.kotlin.models
// Her dosya bir paketin altında tanımlanır.

// eğer belirtilmediyse public
// bu şekilde tanımlama => class içi değişkene otomatik atanır
class Car(var brand: String, var model: String, private var year: Int) {

    init {
        // Constructor çalıştığında çalışan blok.
        println("Car sınıfından bir nesne oluşturuldu.") 
    }

    fun rent() {
        println("$brand $model araba kiralandi.") // Classın fonksiyonu => classın alanlarına erişebiliriz.
    }

    fun getYear(): Int {
        return year
    }

    fun setYear(year:Int) {
        if (year < 1990 || year > 2026) {
            println("Geçersiz yıl.")
            return
        }

        // this => classın kendisi
        this.year = year
    }
}

class Car2 {
    // Class içi değişken manual yönetilmelidir
    constructor(brand: String, model: String, year: Int) {
        println("Car2 sınıfından bir nesne oluşturuldu.") 
    }

    fun rent() {
        println("Car2 araba kiralandi.") 
    }
}
// Bir kalıp

fun main() {
    var car1: Car = Car("BMW", "M3", 2020) // sanki bi fonk. çağırıyor gibi.
    car1.rent()
    println(car1.brand) // get => car1.brandi okudum
    car1.brand = "a" // set => car1.brand = "a" yazdım
    car1.setYear(2025)
    println(car1.getYear())



    var car2: Car2 = Car2("Audi", "A4", 2019)
    car2.rent()
    // Constructor => Yapıcı fonksiyon
}