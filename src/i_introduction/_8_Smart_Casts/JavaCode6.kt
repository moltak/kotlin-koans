package i_introduction._8_Smart_Casts

/**
 * Created by engeng on 11/27/15.
 */
class JavaCode6 {
    fun eval(expr: Expr) : Int {
        when(expr) {
            is Num -> return expr.value
            is Sum -> return eval(expr.left) + eval(expr.right)
        }

        throw IllegalArgumentException("Unknown expression")
    }
}