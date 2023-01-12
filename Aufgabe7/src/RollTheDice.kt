import kotlin.random.Random.Default.nextInt

fun main(){
    while(true){
        var playerList: MutableMap<String, Int> = mutableMapOf(
            "Fetullah" to randomInt(),
            "Max" to randomInt()
        )
        showWinner(playerList)
        readln()
    }
}

fun randomInt(): Int{
    return nextInt(1, 7)
}

fun showWinner(playerMap: MutableMap<String, Int>){
    var listNames = playerMap.keys.toList()
    var listValues = playerMap.values.toList()

    if(listValues[0] > listValues[1]){
        println("${listNames[0]} hat gewonnen!>\n(Würfel: ${listValues[0]})\n" +
                "(Würfel-Gegner: ${listValues[1]})")
    }else if(listValues[0] < listValues[1]){
        println("${listNames[1]} hat gewonnen!>\n(Würfel: ${listValues[1]})\n(Würfel-Gegner: ${listValues[0]})")
    }else if (listValues[0] == listValues[0]){
        println("Gleichstand!")
    }
}