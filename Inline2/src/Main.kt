/*  Função pode receber outra função como parâmetro ou retorná-la como resultado.
    Função de ordem superior que aceita um parâmetro genérico T, uma string 'nomeFuncao' e uma lambda funcao
    Essa funcao imprime uma mensagem indicando que entrou no método, executa a funcao lambda 'funcao' e depois exibe a mensagem de finalização
    Ela retorna o resultado da lambda 'função'
 */
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no método $nomeFuncao")
    try{
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizando...")
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

/* Função 'executarComLog' é chamada com 'somar' como nome da função e uma lambda que chama a função 'somar'
    A variável 'resultado' recebe o valor retornado pela função 'executarComLog'
*/
fun main(args: Array<String>) {
    val resultado = executarComLog("somar"){
        somar(4, 5)
    }
    println(resultado)
}