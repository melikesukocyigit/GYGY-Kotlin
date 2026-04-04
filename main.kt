// Kotlin -> Javanın moderni
// Daha az kodla aynı işi yapabilen versiyon.

// Entrypoint => Giriş noktası
fun main() 
{
    // Scope => Kapsama alanı 
    println("Hello")

    // Değişkenler
    // Programın akışında tanımlanan ramde tutulan ve tanımlanan isimle erişilebilen, değeri değişebilen değer(ler).
    var a: Int = 5 // a ismine 5 değerini atadık.
    println(a)
    // int => integer => tam sayı

    var name: String = "Halit" // String (metinsel)
    println(name)

    val b: Int = 10 // Immutable => Değiştirilemez
    println(b)

    a = 6
    println(a)
    //b=11
    println(b)

    // Null Safety = Varsayılan davranış non-nullable'dır. Yani null değer atanamaz.
    // ? => Bu alan null olabilir.
    var surname: String? = "Kalaycı"
    surname = null
    println(surname)
    println(surname?.length) // Güvenli kullanım (Nullsa yine null döner.)
    //println(surname!!.length) // Kullanıma zorlamak (NullPointerException riski)


    var nameSurname: String = "$name $surname ${20+5}" // String interpolation (Değişkenleri string içinde kullanmak)
    println(nameSurname)


    // Array => Diziler
    val numbers: Array<Int> = arrayOf(1,2,3,4,5)

    val students: Array<String> = arrayOf("Halit","Ahmet","Mehmet")
    //students.add("Ayşe") // Arrayler sabit boyutlu olduğu için add gibi bir fonksiyon yoktur.

    println(numbers[0]) // Index bazlı erişim
    println(students[2])
    students[2] = "Ayşe"
    println(students[2])

    // Listeler => Arraylere göre daha esnek ve gelişmiş yapılardır.

    // liste@456 = 1,2,3,4,5
    val numberList = listOf(1,2,3,4,5) // Immutable (değiştirilemez)
    //numberList.add(6)

    // liste@123 => 1,2,3,4,5
    val numberListMutable = mutableListOf(1,2,3,4,5) // Mutable (değiştirilebilir)
    numberListMutable.add(6)

    // Referans değişir , neden => yeni liste oluşur liste@789
    //numberListMutable = mutableListOf(7,8,9) // Yeni bir liste ataması yapabiliriz.


    // Control Flow
    println(10+20)

    println(10 == 20)

    val yas: Int = 18
    // Bir if bloğundan bir karar çıkar
    // ilk sağlanan koşul (yukarıdan aşağıya) çalışır.
    if (yas >= 18) 
    {
        println("Yetki verildi.")
    }
    else if(yas == 18)
    {
        println("Ay kontrolü yapılıyor.")
    }
    else
    {
        println("Yetki verilmedi.")
    }
    //

    // when (switch-case) 
    val gun: Int = 3

    when(gun)
    {
        1 -> println("Pazartesi")
        2 -> println("Salı")
        3 -> println("Carsamba")
        else -> println("Geçersiz gün")
    }

    when(gun)
    {
        1,2,3,4,5 -> println("Hafta içi")
        6,7 -> println("Hafta sonu")
        else -> println("Geçersiz gün")
    }
    //

    // Koşullar aynı zamanda birer expressiondır.
    val sonuc: String = if (yas >= 18) "Yetki verildi" else "Yetki verilmedi"

    val gunIsmi: String = when(gun)
    {
        1 -> "Pazartesi"
        2 -> "Salı"
        3 -> "Carsamba"
        else -> "Geçersiz gün"
    }
    //


    // Iterasyon -> iteration => yineleme
    // aynı scopedaki kodu X adet tekrar etmek

    // for döngüsü
    // döngü koşulu sağlandığı sürece döngü bloğundaki kodu tekrar eder.
    for (i in 0..5) { // i sayısı 1 ile 5 arasında iterasyon yapsın. 1den başlasın 5 dahil 5e kadar çıskın
        println(i)
    }

    for(i in 0..20 step 2) {
        println(i)
    }
    println("**** DownTo ****")
    for(i in 10 downTo 0) {
        println(i)
    }
    // until 0dan5e kadar 5 dahil değil
    // 0..5 => 5 dahil olur
    println("**** Until ****")
    for(i in 0 until 5) {
        println(i)
    }
    // döngüden çıkılacak i=6

    val studentList = listOf("Halit","Ahmet","Mehmet","Nazlı","İsmail","Eren") 

    for(student in studentList) { // studentList içindeki her elemanı gez, her iterasyonda sıradaki elemana student ismiyle ulaş.
        // her bir çalışma => buradaki student isimli değişkenin farklı değerler alması

        // BU döngüde yapılacak işlem ne ise "Ahmet" ismi için yapılmasın..
        // continue => döngünün o iterasyonunu continue gördüğün yerde atla.
        if(student == "Ahmet")
            continue
        println(student)
    }
    println("*** Break ***")
    for(student in studentList) { 
        
        if(student == "Ahmet")
        {
            println("Ahmet bulundu, döngü sonlandırılıyor.")
            break // döngüyü tamamen sonlandır.
        }
        println(student)
    }
}