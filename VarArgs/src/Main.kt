fun main() {
    for(n in ordenar(38,3,456,51,1,88,77)){
        println(n)
    }
}

fun ordenar (vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}