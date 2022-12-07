fun main() {
    val input = readInput("sentences")
    //println("Sum: ${sumAllNums(input)}")
    //println("Min: ${findMin(input)}")
    println("Count: ${countHWords(input)}")
}

fun sumAllNums(input: List<String>) : Int {
    var total = 0
    for(num in input) {
        total += num.toInt()
    }
    return total
}
fun findMin(input: List<String>): Int {
    return input.map { it.toInt() }.min()
}

fun findTwoSmallest(input: List<String>): Int {
    val sorted=input.map {it.toInt()}.sorted()
    println(sorted.take(2))
    return sorted[0] + sorted[1]
}

fun countWords(input: List<String>): Int{
    var count = 0
    for (line in input) {
        val words = line.split(" ")
        count += words.size
    }
    return count
}

fun countHWords(input: List<String>): Int {
    var count = 0
    for (line in input) {
        val words = line.split(" ")
        for (i in words.indices) {
            if(words[i].lowercase().startsWith("h")) {
                count++
            }
        }
    }
    return count
}