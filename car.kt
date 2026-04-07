class Car {
    //içi boş bir yeni tür oluşturduk
    // özellik ekleyebilirsiniz
    var brand: String = " " ;
    var model: String = " " ;
    var year: Int = 0;

}

fun main() {
    // o kalıptan türeyen örnekler
    var car1: Car = Car() // claslardan üretilen her bir örneğe instance denri.car1 instancedir
    car1.brand = "BMW"
    car1.model = "M3"
    car1.year = 2020
    println(car1)

     // o kalıptan türeyen örnekler
    var car2: Car = Car() // claslardan üretilen her bir örneğe instance denri.car1 instancedir
    car2.brand = "mercedes"
    car2.model = "c200"
    car2.year = 2021
    println(car2)

    // veritabanı işlemleri calss
    // iş kodları , validasyon yapan class 
    // bir nesneyi temsil eden class
    var name: String = "Melike"
    println("Merhaba  $name")
}