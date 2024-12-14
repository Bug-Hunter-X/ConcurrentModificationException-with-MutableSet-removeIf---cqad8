```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    // Solution 1: Create a copy to avoid modification during iteration
    val setCopy = set.toMutableSet()
    setCopy.removeIf { it % 2 == 0 }
    println(setCopy) // Output: [1, 3, 5]
    println(set) // Output: [1, 2, 3, 4, 5] (original set unchanged)

    // Solution 2: Iterate using an iterator and remove using its remove() method.
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 3, 5]
}
```