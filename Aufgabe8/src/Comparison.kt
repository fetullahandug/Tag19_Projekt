fun main() {
    var listName1: List<String> = listOf("Fetullah", "Margarete", "Max", "Pascal")
    var listName2: List<String> = listOf("Maximilian", "Margarete", "Max", "Lenard")

    compareNamesInList(listName1, listName2)
}

fun compareNamesInList(l1: List<String>, l2: List<String>){
    for(e in l1){
       for(z in l2){
           if(e == z){
               println("Der Name $e taucht in beiden Listen auf!")
           }
       }
    }
}