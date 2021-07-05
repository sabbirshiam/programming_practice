import java.util.*

/**
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 * Example
 * Magazine = "attack at dawn"  Notes= "Attack at dawn"

The magazine has all the right words, but there is a case mismatch. The answer is NO.
Prints

string: either yes or NO, no return value is expected
Input Format

The first line contains two space-separated integers,  and , the numbers of words in the  and the , respectively.
The second line contains  m space-separated strings, each magazines[i].
The third line contains  n space-separated strings, each notes[i].
 */


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = first_multiple_input[0].toInt()

    val n = first_multiple_input[1].toInt()

    val magazine = readLine()!!.trimEnd().split(" ").toTypedArray()

    val note = readLine()!!.trimEnd().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}


fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val itemMagazineMap = Hashtable<String, Int>()
    magazine.forEach { s: String ->
        if (itemMagazineMap.containsKey(s)) {
            itemMagazineMap[s] = itemMagazineMap[s]!!.plus(1)
        } else itemMagazineMap[s] = 1

    }

    var matched = true
    note.forEach {
        if (!itemMagazineMap.containsKey(it) || itemMagazineMap.getOrDefault(it, 0) <= 0) {
            matched = false
            return@forEach
        } else itemMagazineMap[it] = itemMagazineMap[it]!!.minus(1)
    }

    if (matched) print("Yes") else print("No")

}
