interface DataStructure {
    // assume K provides good hashCode()
    fun evict()  // Remove the eldest entry(the least recently accessed(add or get) entry).
    fun add(key: Int, value: Int)  // Add items that match the key and value to the data structure.
    fun get(key: Int): Int  // Returns the value of the item that matches the key. An exception occurs if no item is found.
    fun remove(key: Int): Int  // Returns
}

class DataStructureImpl: DataStructure {
    private val map = LinkedHashMap<Int, Int>()

    override fun evict() {}

    override fun add(key: Int, value: Int) {
        map[key] = value
    }

    override fun get(key: Int): Int = map[key] ?: 0

    override fun remove(key: Int): Int = map.remove(key) ?: -1
}