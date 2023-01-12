fun main() {
    createCoupon("Elise", 50.00)
    createCoupon("Melisa", 12.79)
    createCoupon("Fetullah", 120.00)
}

fun createCoupon(name: String, summe: Double){
    when{
        summe < 50.00 -> println("Herr/Frau $name bekommt leider keinen Gutschein!")
        summe >= 50.00 && summe < 100.00 -> println("Herr/Frau $name bekommt einen Gutschein im Wert von 10.00 €")
        summe >= 100.00 -> println("Herr/Frau $name bekommt einen Gutschein im Wert von 20.00 €")
    }
}