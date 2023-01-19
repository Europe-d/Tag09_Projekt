fun main() {

   // todo a
    var personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hunde",
    "Frank" to  "Katzen",
    "Luis" to  "Mäuse",
    "Sylvia" to  "Eulen",
    "Hans" to "Fau",)

    var  lieblingstierVonFrank : String? = personZuHaustier.get("Frank")

    println("1. Franks Lieblingstiere ist die $lieblingstierVonFrank")

    var lieblingstierVonSylvia : String? = personZuHaustier.get("Sylvia")
    println("2. Sylvia  Lieblingstiere ist die $lieblingstierVonSylvia")

    var lieblingstierVonHans : String? = personZuHaustier.get("Hans")
    println("3. Hans  Lieblingstiere ist die $lieblingstierVonHans")


    //todo b
    var nummerZuFarbe : MutableMap<Int,String> = mutableMapOf(
    12 to  "Rot",
    45 to  "Blau",
    23 to  "Gelb",
    28 to "Grün",
    36 to  "Lila",
    92 to  "Rosa")

    //todo c
    //Verwende in deiner Lösung die Funktion get() oder die Index[] Schreibweise.
    //Welche Hausfarbe hat das Haus mit der Nummer 28?
    //Welche Hausfarbe hat das Haus mit der Nummer 45?
    //Welche Hausfarbe hat das Haus mit der Nummer 92?
    //Welche Hausfarbe hat das Haus mit der Nummer 12?

    println("Die Hausfarbe mit die nummer 28 ist ${nummerZuFarbe.get(28)}")
    println("Die Hausfarbe mit die nummer 45 ist ${nummerZuFarbe.get(45)}")
    println("Die Hausfarbe mit die nummer 92 ist ${nummerZuFarbe.get(92)}")
    //println(nummerZuFarbe[28])
    println("Die Hausfarbe mit die nummer 12 ist ${nummerZuFarbe.get(12)}")



//

}
