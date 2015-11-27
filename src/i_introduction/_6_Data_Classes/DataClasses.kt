package i_introduction._6_Data_Classes

import util.*

fun todoTask7(): Nothing = TODO(
    """
        Convert 'JavaCode7.Person' class to Kotlin.
        Then add an annotation `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class: `equals`/`hashCode`, `toString` and some others.
        The `task7` function should return a list of persons.
    """,
    documentation = doc7(),
    references = { JavaCode7.Person("Alice", 29) }
)

fun task7(): List<JavaCode7.Person> {
    return listOf(JavaCode7.Person("Alice", 29), JavaCode7.Person("Bob", 31))
}

