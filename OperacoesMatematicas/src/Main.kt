import kotlin.system.exitProcess
import java.text.DecimalFormat

fun main() {
    menu()
}

fun menu(){
    var opcao: Int = 0
    while(opcao != 6){
        println("[1] Área do retângulo \n[2] Área dos Triângulos \n[3] Comprimento da Circunferência \n[4] Área do Losango \n[5] Área do Trapézio \n[6] Sair")
        print("Digite o número da opção para realizar a operação matemática: ")
        val opcaoString = readLine() ?: "0"
        opcao = opcaoString.toIntOrNull() ?: 0

        when(opcao){
            1 -> areaRetangulo()
            2 -> areaTriangulo()
            3 -> areaCircunferencia()
            4 -> areaLosango()
            5 -> areaTrapezio()
            6 -> exitProcess(0)
            else -> println("Opção Inválida")
        }
    }
}

fun areaRetangulo(){
    var base: Float = 0.0F
    var altura: Float = 0.0F

    print("Digite o valor da base do retângulo: ")
    val baseString = readLine() ?: "0"
    base = baseString.toFloatOrNull() ?: 0.0F

    print("Digite o valor da altura do retângulo: ")
    val alturaString = readLine() ?: "0"
    altura = alturaString.toFloatOrNull() ?: 0.0F

    var area = base * altura
    println("O valor da área do retângulo é: $area")

    encerrar()
}

fun areaTriangulo(){
    var opcao: Int
    print("Qual tipo de triângulo deseja calcular? \n[1]Equilátero \n[2]Isósceles \n[3]Escaleno: \n")
    val opcaoString = readLine() ?: "0"
    opcao = opcaoString.toIntOrNull() ?: 0
    if(opcao == 1){
        TrianguloEquilatero()
    }else if(opcao == 2){
        TrianguloIsoscelesEscaleno()
    }else if(opcao == 3){
        TrianguloIsoscelesEscaleno()
    }else{
        println("Opção Inválida")
    }

    encerrar()
}

fun TrianguloEquilatero(){
    print("Digite o valor do lado do triângulo equilátero: ")
    val ladoString = readLine() ?: "0"
    val lado = ladoString.toDoubleOrNull() ?: 0.0

    var area = (Math.pow(lado, 2.0) * Math.sqrt(3.0)) / 4

    val formatacao = DecimalFormat("#.##")
    val areaFormatada = formatacao.format(area)

    println("O valor da área do triângulo equilátero é: $areaFormatada")

    encerrar()
}

fun TrianguloIsoscelesEscaleno(){
    print("Digite o valor da base do triângulo: ")
    val baseString = readLine() ?: "0"
    val base = baseString.toDoubleOrNull() ?: 0.0

    print("Digite o valor da altura do triângulo: ")
    val alturaString = readLine() ?: "0"
    val altura = alturaString.toDoubleOrNull() ?: 0.0

    var area = (base * altura)/2

    val formatacao = DecimalFormat("#.##")
    val areaFormatada = formatacao.format(area)

    println("O valor da área do triângulo é: $areaFormatada")

    encerrar()
}
fun areaCircunferencia(){
    print("Digite o valor do raio da circunferência: ")
    val raioString = readLine() ?: "0"
    val raio = raioString.toDoubleOrNull() ?: 0.0

    val circunferencia = 2 * Math.PI * raio

    val formatacao = DecimalFormat("#.##")
    val circunferenciaFormatada = formatacao.format(circunferencia)

    println("O valor do comprimento da circunferência é: $circunferenciaFormatada")

    encerrar()
}

fun areaLosango(){
    print("Digite o valor da diagonal maior do losango: ")
    val diagMaiorString = readLine() ?: "0"
    val diagMaior = diagMaiorString.toDoubleOrNull() ?: 0.0

    print("Digite o valor da diagonal menor do losango: ")
    val diagMenorString = readLine() ?: "0"
    val diagMenor = diagMenorString.toDoubleOrNull() ?: 0.0

    var area = (diagMaior * diagMenor)/2

    val formatacao = DecimalFormat("#.##")
    val areaFormatada = formatacao.format(area)

    println("O valor da área do losango é: $areaFormatada")

    encerrar()
}

fun areaTrapezio(){
    print("Digite o valor da altura do trapézio: ")
    val alturaString = readLine() ?: "0"
    val altura = alturaString.toDoubleOrNull() ?: 0.0

    print("Digite o valor da base maior do trapézio: ")
    val baseMaiorString = readLine() ?: "0"
    val baseMaior = baseMaiorString.toDoubleOrNull() ?: 0.0

    print("Digite o valor da base menor do trapézio: ")
    val baseMenorString = readLine() ?: "0"
    val baseMenor = baseMenorString.toDoubleOrNull() ?: 0.0

    var area = (baseMaior + baseMenor)*altura/2

    val formatacao = DecimalFormat("#.##")
    val areaFormatada = formatacao.format(area)

    println("O valor da área do losango é: $areaFormatada")

    encerrar()
}

fun encerrar(){
    print("Deseja continuar? [0]Sim [1]Não: ")
    val opcaoString = readLine() ?: "0"
    val opcao = opcaoString.toIntOrNull() ?: 0
    if(opcao == 0){
        menu()
    }else if(opcao == 1){
        println("Encerrando...")
        exitProcess(0)
    }else{
        println("Opção Inválida")
    }
}