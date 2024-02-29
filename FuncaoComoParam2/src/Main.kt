//Função genérica filtrar,por ser genérica pode filtrar listas de qualquer tipo de elemento
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>() //cria uma lista vazia, que contera os elementos filtrados
    for(e in lista){ //loop que percorre todos os elementos da lista fornecida como argumento
        if(filtro(e)){ //aplicada a funcao do filtro(filtro) ao elemento atual(e)
            listaFiltrada.add(e) //elemento que passou no teste do filtro é add a listaFiltrada
        }
    }
    return listaFiltrada //retorna a lista listaFiltrada contendo só elementos que passaram no teste do filtro
}

//funcao que verifica se uma string tem três caracteres
fun comTresLetras(nome: String): Boolean{
    return nome.length == 3 //retorna true se a string tiver três caracteres
}

fun main() {
  val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca") //criada uma lista de strings
  println(filtrar(nomes, ::comTresLetras)) //a função comTresLetras será aplicada a cada elemento da lista nomes para filtrar os elementos que têm três letras
}