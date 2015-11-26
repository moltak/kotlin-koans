package i_introduction._4_Lambdas

/**
 * Created by engeng on 11/26/15.
 */
class JavaCode3 {
    fun task3(collection: Collection<Int>): Boolean {
        var iter = collection.iterator()

        val compare = { x: Int -> x % 42 == 0}

        while (iter.hasNext()) {
            if (compare.invoke(iter.next()) == false) {
                return false
            }
        }

        return true
    }
}