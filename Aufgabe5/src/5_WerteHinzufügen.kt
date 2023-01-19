fun main() {

    // TODO:  a

    var personZuHaustier: MutableMap<String,String> = mutableMapOf(
        "Berta" to "Hunde",
    "Frank" to "Katzen",
    "Luis" to  "Mäuse",
    "Sylvia" to "Eulen",
    "Hans" to  "Fau")

var neueHaustiere: MutableMap<String,String> = mutableMapOf(
    "Tim" to "Schildkröte",
    "Fabian" to "Papagei",
    "Jannik" to  "Schlange"
)

    personZuHaustier += neueHaustiere
    println(personZuHaustier)

    println(personZuHaustier["Luis"])
    //hier zeigt nur von Luis tiere was er mag
    //todo b)
    personZuHaustier.put("Luis","Mäuse")
    /*bei luis macht keine äderung weil giebt schon diese name auf liste
    aber bei Bernd komm in der liste auf letzte position
     */
    personZuHaustier.put("Bernd","Igel")
    print(personZuHaustier)


    //todo c

    var mymap: MutableMap<Int,Double> = mutableMapOf(
    1 to 2.5,
    2 to 5.0,
    3 to 7.5,
    4 to 10.0)

var  mymap1: MutableMap<Int,Double> = mutableMapOf(
    10 to 10.1,
    25 to 45.23,
    99 to 259.46
)

    mymap +=mymap1
    println(mymap)
}