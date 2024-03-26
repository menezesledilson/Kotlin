fun main() {
    val tree = Tree("Brown", 1.56)
    val treeCopy = tree.clone() as Tree  // Precisamos fazer um cast para Tree, já que clone retorna Any

    println(tree)
    println(treeCopy)
}

interface Cloneable {
    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
) : Cloneable {
    // Não precisamos da propriedade "x" para a cópia do objeto, então removi ela
    override fun clone(): Any {
        // Usamos a função copy() fornecida automaticamente para data classes em Kotlin
        return copy()
    }
}
