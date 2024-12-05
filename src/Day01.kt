import kotlin.math.abs

fun main() {
    fun part1(list1: List<Int>, list2: List<Int>): Int {
        return list1.zip(list2).sumOf { (num1, num2) -> abs(num1 - num2) }
    }


    fun part2(list1: List<Int>, list2: List<Int>): Int {
        return list1.sumOf { left ->
            list2.count { it == left } * left
        }
    }


    // Test if implementation meets criteria from the description, like:
    // check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
    // val testInput = readInput("Day01_test")
    // check(part1(testInput) == 6)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    input.forEach { linea ->
        val (elem1, elem2) = linea.split(" ").filter { it.isNotBlank() }.map { numero -> numero.toInt() }
        list1.add(elem1)
        list2.add(elem2)
    }
    part1(list1.sorted(),list2.sorted()).println()
    part2(list1,list2).println()
}





