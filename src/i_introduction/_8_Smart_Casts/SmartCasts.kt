package i_introduction._8_Smart_Casts

import util.*

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    return JavaCode6().eval(e)
}

fun todoTask6(expr: Expr): Nothing = TODO(
    """
        Task 6.
        Rewrite 'JavaCode6.eval()' in Kotlin using smart casts and 'when' expression.
    """,
    documentation = doc6(),
    references = { JavaCode6().eval(expr) })

