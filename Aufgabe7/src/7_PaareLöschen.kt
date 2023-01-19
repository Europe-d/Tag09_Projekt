fun main() {
var listieblingstier : MutableMap<String,String> = mutableMapOf(
    "Berta" to  "Hunde",
    "Frank" to  "Katzen",
    "Luis" to  "Mäuse",
    "Sylvia" to  "Eulen",
    "Hans" to  "Fau"
)
    println(listieblingstier)

    //todo a)

//    Verwende für die folgenden Teilaufgaben eine Funktion oder Schreibweise aus der Vorlesung.

//    Verwende den Schlüssel "Frank", um das Paar "Frank" -> "Katzen" aus der MutableMap zu löschen.
//    Verwende den Schlüssel "Hans", um das Paar "Hans" -> "Fau" aus der MutableMap zu löschen.


    listieblingstier.remove("Frank","Katzen")
    listieblingstier.remove("Hans","Fau")


//    Gebe die MutableMap aus. Die MutableMap sollte jetzt nur noch aus den folgenden Einträgen bestehen:

    print(listieblingstier)

    // todo b
//    Verwende jetzt den Schlüssel "Luis" und den Wert "Mäuse" um das Paar "Luis" -> "Mäuse" aus der MutableMap zu entfernen.


    listieblingstier.remove("Luis","Mäuse")
    println(listieblingstier)

//    Weise den Rückgabewert einer Variable zu und gib diese Variable in der Konsole aus.


    println(listieblingstier.contains("Luis"))

//   todo c  Es sollte true ausgegeben werden. Stimmt das?

  /*  bei mir komm false weil ich habe so wieso Luis gelöscht auf die liste */

//    Verwende jetzt die Funktion remove(schlüssel, wert) aus der Vorlesung (in der Vorlesung dargestellt als remove(key, value)) mit folgenden Schlüssel "Frank" und Wert "Mäuse". Weise den Rückgabewert einer Variable zu und gib diese Variable in der Konsole aus.


    listieblingstier.put("Frank","Katzen")
    println(listieblingstier)


//    Was wird ausgegeben? Und wieso?
    //"ist Luis auch dabei?")
    /*luis ist nicht dabei weil ich ihm gelöscht */







}