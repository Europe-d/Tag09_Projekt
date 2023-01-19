fun main() {

    var personZuHaustier: MutableMap<String,String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to  "Mäuse",
        "Sylvia" to "Eulen",
        )


//   todo  Verwende für die folgenden Teilaufgaben eine passende Funktion oder Schreibweise aus der Vorlesung.
//    Ändere den Wert des Paares "Berta" -> "Hunde" zu "Berta" -> "Esel"

    personZuHaustier.put("Berta","Esel")
    println(personZuHaustier)

//    Ändere den Wert des Paares "Sylvia" -> "Eulen" zu "Sylvia" -> "Pferde"

    personZuHaustier.put("Sylvia","Pferde")
    println(personZuHaustier)
//    Ändere den Wert des Paares "Frank" -> "Katzen" zu "Frank" -> "Spechte"

    personZuHaustier.put("Frank","Spechte")
    println(personZuHaustier)
//    Ändere den Wert des Paares "Luis" -> "Mäuse" zu "Luis" -> "Spechte"
    personZuHaustier.put("Luis","Spechte")
    println(personZuHaustier)

   //todo b) Fragen:
    //
    //Kann eine Map oder MutableMap diese zwei Paare enthalten?
    //"Berta" -> "Hunde"
    //"Berta" -> "Hunde"
    //Falls nein, ändere nur einen Schlüssel oder nur einen Wert, sodass eine Map oder MutableMap beide Paare enthalten kann.
    /*wenn wir beide behalten wollte,muss wir eine name oder noch bustaben dazu geben zubeispiel */


     personZuHaustier.put("Berta","Hunde")
    println(personZuHaustier)
    /* hier können wir das name behalten aber wenn wir noch ein mal dazu komm muss ich so lassen */


    personZuHaustier.put("BertaV","Hunden")
    println(personZuHaustier)
/* HIER ICH HABE zubeispil nach den name erste bustaben von familiename gegeben und bei hund (n)
wenn wir nicht machen dann automatisch list ein mal obwohl wir 2 haben
 */


}