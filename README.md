# 🚀 Nesne Yönelimli Programlama (OOP) Rehberi

Merhaba! Bu projede Nesne Yönelimli Programlama (**OOP** - Object Oriented Programming) dünyasına giriş yapıyoruz. Eğer kodlama dünyasında bir şeyler inşa ediyorsan, OOP senin en iyi dostundur. Neden mi? Çünkü kodlarımızı gerçek dünyadaki **"nesnelere"** benzeterek yazmamızı sağlar. Bu da projelerimizi daha düzenli, yönetilebilir ve tekrar kullanılabilir hale getirir.

OOP'nin 4 temel direği vardır. Gelin bunları kendi yazdığımız projemizdeki kodlar üzerinden, günlük hayattan örneklerle inceleyelim!

---

## 1. Encapsulation (Kapsülleme) 

### **Nedir?**
Adı üzerinde, verileri bir **"kapsül"** içine alıp dış dünyadan korumaktır. Sınıfımızın (class) içindeki bazı özellikleri gizleriz ve bu özelliklere sadece bizim izin verdiğimiz kurallar (setter/getter) çerçevesinde erişilmesini sağlarız.

> **Neden Kullanırız?** Eğer arabanın üretim yılını korumaya almazsak, bir kullanıcı yanlışlıkla yılı `-500` veya `3000` girebilir. Kapsülleme ile bu verinin tutarlılığını garanti altına alırız.

### **Projemizden Referanslar:**
Bu konsepti `car.kt` dosyamızda şu şekilde uyguladık:

* 🔗 [**car.kt (Satır 21-29)**](https://github.com/melikesukocyigit/GYGY-Kotlin/blob/main/car.kt#L21-L29)

```kotlin
class Car(var brand: String, var model: String, private var year: Int) {

    // 'private' olan year değişkenine kontrollü erişim sağlıyoruz
    fun setYear(year: Int) {
        if (year < 1990 || year > 2026) {
            println("Hata: Geçersiz yıl girişi.")
            return
        }
        this.year = year
    }
}
```
## 2. Inheritance (Kalıtım / Miras Alma) 

### **Nedir?**
Sınıfların birbirinden özellik ve davranış (fonksiyon) miras alabilmesidir. Bu sayede aynı kodları tekrar tekrar yazmaktan kurtuluruz. Üst sınıfın (**Parent**) tüm yetenekleri alt sınıfa (**Child**) geçer.


### **Projemizden Referanslar:**
Projemdeki hiyerarşik yapıyı ve sınıflar arası ilişkiyi aşağıdaki satırlarda inceleyebilirsiniz:

* 🔗 [**car.kt (Satır 35-45)**](https://github.com/melikesukocyigit/GYGY-Kotlin/blob/main/car.kt#L35-L45)

```kotlin
// Üst Sınıf (Parent) - Miras verilebilir olması için 'open' yaptık
open class Vehicle(var brand: String, var model: String) {
    fun startEngine() {
        println("$brand $model motoru çalıştırıldı.")
    }
}

// Alt Sınıf (Child) - Vehicle'dan miras alıyor
class Car(brand: String, model: String, var doors: Int) : Vehicle(brand, model) {
    fun openDoors() {
        println("$doors kapı açıldı.")
    }
}
```
## 3. Polymorphism (Çok Biçimlilik) 

### **Nedir?**
Aynı isme sahip eylemlerin, farklı nesnelerde farklı şekillerde çalışabilmesidir. Genelde **Method Overriding (Ezme)** yani miras alınan bir fonksiyonun içeriğini o sınıfa özel olarak yeniden yazmak şeklinde karşımıza çıkar.

### **Projemizden Referanslar:**
Aynı `draw()` fonksiyonunun farklı UI elemanlarında nasıl özelleştirildiğini şu satırlarda görebilirsiniz:

* 🔗 [**car.kt (Satır 50-60)**](https://github.com/melikesukocyigit/GYGY-Kotlin/blob/main/car.kt#L50-L60)

```kotlin
open class UIElement {
    open fun draw() {
        println("Ekrana standart bir arayüz elemanı çiziliyor.")
    }
}

class Button : UIElement() {
    override fun draw() {
        // Üst sınıftaki draw fonksiyonunu buton için özelleştirdik
        println("Ekrana köşeleri yuvarlatılmış, tıklanabilir bir buton çiziliyor.")
    }
}
```
## 4. Abstraction (Soyutlama) 

### **Nedir?**
Soyutlama, bir sistemin karmaşık arka plan detaylarını gizleyerek, kullanıcıya sadece ihtiyacı olan temel özellikleri sunmaktır. "Nasıl çalıştığıyla" değil, **"Ne yaptığıyla"** ilgilenmemizi sağlar.

> **Örnek:** Bir televizyon kumandasında "Kanal Değiştir" tuşuna bastığınızda, kumandanın arka planda hangi frekansta sinyal gönderdiğini bilmenize gerek yoktur. Siz sadece sonuca odaklanırsınız.


### **Projemizden Referanslar:**
Banka işlemlerindeki karmaşıklığı gizleyen soyut yapıyı `bank.kt` dosyamızda kurguladık:

* 🔗 [**bank.kt (Dosya Geneli)**](https://github.com/melikesukocyigit/GYGY-Kotlin/blob/main/bank.kt)

```kotlin
abstract class BankOperation {
    // Soyut Fonksiyon: Gövdesi yok! 
    // Miras alan her banka (Ziraat, DenizBank vb.) bunu kendi iş mantığına göre doldurmak zorunda.
    abstract fun executeOperation(customerId: String)

    // Somut Fonksiyon: Her işlemde ortak olan, değişmeyen özellik
    fun logOperation() {
        println("İşlem veri tabanı log kayıtlarına başarıyla işlendi.")
    }
}
```
---

## 🎯 Özet ve Sonuç

Bu projede, modern yazılım geliştirmenin temel taşı olan **Nesne Yönelimli Programlama (OOP)** prensiplerini Kotlin dili üzerinden inceledik. Kısaca özetlemek gerekirse:

| Prensip | Temel Amacı | Projemizdeki Karşılığı |
| :--- | :--- | :--- |
| **Encapsulation** | Veri güvenliği ve tutarlılığı sağlamak. | `year` bilgisinin sınırlandırılması. |
| **Inheritance** | Kod tekrarını önlemek ve hiyerarşi kurmak. | `Vehicle` sınıfından `Car` türetilmesi. |
| **Polymorphism** | Esneklik ve farklı davranışlar sergilemek. | `draw()` fonksiyonunun her eleman için farklı çalışması. |
| **Abstraction** | Karmaşıklığı gizleyip sade arayüz sunmak. | `BankOperation` ile sadece işleme odaklanılması. |


### **Neden OOP Kullanıyoruz?**
OOP sadece bir yazım stili değil, aynı zamanda bir **problem çözme yaklaşımıdır.** Büyük projelerde kodun içinde kaybolmamızı engeller, ekip çalışmalarını kolaylaştırır ve yazdığımız kodun tıpkı bir Lego parçası gibi başka yerlerde de kullanılabilmesine (reusability) olanak tanır.

Bu prensipleri projelerinizde uyguladıkça, yazdığınız kodun çok daha profesyonel ve bakımı kolay bir hale geldiğini fark edeceksiniz.

---
