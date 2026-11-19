

/*
 * Introducao a Programacao - Algoritmos 112 a 160
 
 */





fun main() {
    println("ALGORITMOS 112 A 160 - KOTLIN")
    println("Digite 0 para sair.")
    while (true) {
        val n = inteiro("\nQual algoritmo deseja executar (112 a 160)? ")
        if (n == 0) break
        if (n !in 112..160) {
            println("Opcao invalida. Escolha um numero de 112 a 160.")
            continue
        }
        println("\n--- ALGORITMO $n ---")
        try {
            executar(n)
        } catch (e: NumberFormatException) {
            println("Entrada invalida. Tente novamente usando numeros validos.")
        }
    }
    println("Programa encerrado.")
}

private fun executar(n: Int) {
    when (n) {
        112 -> {
            val a = real("Digite o primeiro numero: ")
            val b = real("Digite o segundo numero: ")
            println("Menor: ${min(a, b)}")
        }
        113 -> {
            val valores = listOf(real("Digite o primeiro numero: "), real("Digite o segundo numero: ")).sorted()
            println("Ordem crescente: ${valores.joinToString(" ")}")
        }
        114 -> {
            val valores = listOf(real("Digite o primeiro numero: "), real("Digite o segundo numero: ")).sortedDescending()
            println("Ordem decrescente: ${valores.joinToString(" ")}")
        }
        115 -> {
            val x = real("Digite o valor de x: ")
            val y = real("Digite o valor de y: ")
            val menor = min(x, y)
            val maior = max(x, y)
            println("Quadrado do menor: ${menor.pow(2.0)}")
            if (maior >= 0) println("Raiz quadrada do maior: ${sqrt(maior)}")
            else println("Nao e possivel calcular a raiz quadrada real do maior numero.")
        }
        116 -> {
            val a = real("Digite o primeiro numero: ")
            val b = real("Digite o segundo numero: ")
            val c = real("Digite o terceiro numero: ")
            println("Maior: ${maxOf(a, b, c)}")
        }
        117 -> {
            val a = real("Digite o primeiro numero: ")
            val b = real("Digite o segundo numero: ")
            val c = real("Digite o terceiro numero: ")
            var maior = a
            if (b > maior) maior = b
            if (c > maior) maior = c
            println("Maior: $maior")
        }
        118 -> {
            val valores = listOf(real("Digite o primeiro numero: "), real("Digite o segundo numero: "), real("Digite o terceiro numero: ")).sorted()
            println("Ordem crescente: ${valores.joinToString(" ")}")
        }
        119 -> {
            val valores = listOf(real("Digite o primeiro numero: "), real("Digite o segundo numero: "), real("Digite o terceiro numero: ")).sortedDescending()
            println("Ordem decrescente: ${valores.joinToString(" ")}")
        }
        120 -> {
            val v = listOf(real("Digite o primeiro numero: "), real("Digite o segundo numero: "), real("Digite o terceiro numero: ")).sorted()
            println("Maior: ${v[2]}")
            println("Intermediario: ${v[1]}")
            println("Menor: ${v[0]}")
        }
        121 -> {
            val v = (1..5).map { inteiro("Digite o ${it}º numero inteiro: ") }
            if (v.toSet().size != 5) println("Os valores devem ser diferentes.")
            else {
                println("Maior: ${v.maxOrNull()}")
                println("Menor: ${v.minOrNull()}")
            }
        }
        122 -> {
            val (a, b, c) = lerTresReais()
            println(if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b)
                "Podem ser lados de um triangulo." else "Nao podem ser lados de um triangulo.")
        }
        123 -> {
            val (a, b, c) = lerTresReais()
            if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b)
                println("As medidas nao formam um triangulo.")
            else println(when {
                a == b && b == c -> "Triangulo equilatero"
                a == b || a == c || b == c -> "Triangulo isosceles"
                else -> "Triangulo escaleno"
            })
        }
        124 -> {
            val (a, b, c) = lerTresReais()
            if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b) {
                println("As medidas nao formam um triangulo.")
            } else {
                val lados = listOf(a, b, c).sorted()
                val menorSoma = lados[0] * lados[0] + lados[1] * lados[1]
                val maiorQuadrado = lados[2] * lados[2]
                println(when {
                    abs(maiorQuadrado - menorSoma) < 1e-9 -> "Triangulo retangulo"
                    maiorQuadrado > menorSoma -> "Triangulo obtusangulo"
                    else -> "Triangulo acutangulo"
                })
            }
        }
        125 -> {
            val idade = inteiro("Digite a idade: ")
            println(when {
                idade < 0 -> "Idade invalida."
                idade > 65 -> "Maior de 65 anos."
                idade >= 18 -> "Maior de idade."
                else -> "Menor de idade."
            })
        }
        126 -> {
            val x = real("Digite um numero: ")
            println(when {
                x == 5.0 -> "O numero e 5."
                x == 200.0 -> "O numero e 200."
                x == 400.0 -> "O numero e 400."
                x in 500.0..1000.0 -> "Intervalo entre 500 e 1000."
                else -> "Fora dos escopos anteriores."
            })
        }
        127 -> {
            val nome = texto("Digite o nome do aluno: ")
            val n1 = real("Digite a nota da PR1: ")
            val n2 = real("Digite a nota da PR2: ")
            val media = (n1 + n2) / 2
            val situacao = when {
                media >= 7 -> "Aprovado"
                media < 3 -> "Reprovado"
                else -> "Em prova final"
            }
            println("Aluno: $nome | PR1: $n1 | PR2: $n2 | Media: %.2f | $situacao".format(media))
        }
        128 -> {
            val verbo = texto("Digite um verbo no infinitivo: ")
            if (!verbo.endsWith("r", true) || verbo.length < 3) println("Verbo nao esta no infinitivo.")
            else {
                val vogal = verbo[verbo.length - 2].lowercaseChar()
                println(when (vogal) {
                    'a' -> "Verbo da 1ª conjugacao."
                    'e', 'o' -> "Verbo da 2ª conjugacao."
                    'i' -> "Verbo da 3ª conjugacao."
                    else -> "Terminacao nao reconhecida."
                })
            }
        }
        129 -> {
            val salario = real("Digite o salario: ")
            val taxa = when {
                salario <= 600 -> 0.0
                salario <= 1200 -> 0.20
                salario <= 2000 -> 0.25
                else -> 0.30
            }
            println("Desconto do INSS: ${dinheiro(salario * taxa)}")
        }
        130 -> {
            val valor = real("Digite o valor de compra do produto: ")
            val percentual = if (valor < 20) 0.45 else 0.30
            println("Valor de venda: ${dinheiro(valor * (1 + percentual))}")
        }
        131 -> {
            val nome = texto("Digite o nome do aluno: ")
            val inicial = nome.firstOrNull()?.uppercaseChar()
            val sala = when (inicial) {
                in 'A'..'K' -> "101"
                in 'L'..'N' -> "102"
                in 'O'..'Z' -> "103"
                else -> null
            }
            if (sala == null) println("Nome invalido.") else println("$nome - Sala $sala, bloco F.")
        }
        132 -> {
            val reais = real("Digite o valor em reais: ")
            val moeda = texto("Moeda (f=franco, l=libra, d=dolar, m=marco): ").lowercase()
            val nome = when (moeda) {
                "f" -> "francos suicos"
                "l" -> "libras esterlinas"
                "d" -> "dolares"
                "m" -> "marcos alemaes"
                else -> null
            }
            if (nome == null) println("Moeda desconhecida.")
            else {
                val cotacao = real("Digite o valor de 1 $nome em reais: ")
                if (cotacao <= 0) println("Cotacao invalida.")
                else println("Total de $nome: %.2f".format(reais / cotacao))
            }
        }
        133 -> {
            val h = real("Digite a altura em metros: ")
            val sexo = texto("Digite o sexo (M/F): ").uppercase()
            if (h <= 0) println("Altura invalida.")
            else {
                val peso = if (sexo == "M") 72.7 * h - 58 else if (sexo == "F") 62.1 * h - 44.7 else Double.NaN
                if (peso.isNaN()) println("Sexo invalido.") else println("Peso ideal: %.2f kg".format(peso))
            }
        }
        134 -> {
            val idade = inteiro("Digite a idade do nadador: ")
            println(when (idade) {
                in 5..7 -> "Infantil A"
                in 8..10 -> "Infantil B"
                in 11..13 -> "Juvenil A"
                in 14..17 -> "Juvenil B"
                in 18..Int.MAX_VALUE -> "Senior"
                else -> "Nao existe categoria para essa idade."
            })
        }
        135 -> {
            val idade = inteiro("Digite a idade: ")
            println(when {
                idade < 0 -> "Idade invalida."
                idade < 16 -> "Nao eleitor."
                idade < 18 || idade > 65 -> "Eleitor facultativo."
                else -> "Eleitor obrigatorio."
            })
        }
        136 -> {
            val nome = texto("Digite o nome: ")
            val idade = inteiro("Digite a idade: ")
            val valor = when {
                idade <= 10 -> 30.0
                idade <= 29 -> 60.0
                idade <= 45 -> 120.0
                idade <= 59 -> 150.0
                idade <= 65 -> 250.0
                else -> 400.0
            }
            if (idade < 0) println("Idade invalida.") else println("$nome pagara ${dinheiro(valor)}.")
        }
        137 -> {
            val a = real("Digite o valor de a: ")
            val b = real("Digite o valor de b: ")
            val c = real("Digite o valor de c: ")
            if (a == 0.0) println("Nao e equacao do segundo grau.")
            else {
                val delta = b * b - 4 * a * c
                if (delta < 0) println("Nao ha raizes reais.")
                else {
                    val x1 = (-b + sqrt(delta)) / (2 * a)
                    val x2 = (-b - sqrt(delta)) / (2 * a)
                    println("X1 = $x1 | X2 = $x2")
                }
            }
        }
        138 -> {
            val mes = inteiro("Digite um numero de 1 a 12: ")
            val meses = listOf("janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro")
            println(meses.getOrNull(mes - 1) ?: "Nao existe mes correspondente a esse numero.")
        }
        139 -> {
            val municipio = texto("Digite o nome do municipio: ")
            val eleitores = inteiro("Digite a quantidade de eleitores aptos: ")
            val votos = inteiro("Digite os votos do candidato mais votado: ")
            println(if (eleitores > 20000 && votos <= eleitores / 2) "$municipio tera segundo turno."
                else "$municipio nao tera segundo turno.")
        }
        140 -> {
            val nome = texto("Digite o primeiro nome do cliente: ")
            val conta = real("Digite o valor da conta: ")
            if (nome.firstOrNull()?.uppercaseChar() in listOf('A', 'O', 'M', 'S'))
                println("$nome - valor com desconto: ${dinheiro(conta * 0.70)}")
            else println("Que pena. Nesta semana o desconto nao e para seu nome; mas continue nos prestigiando que sua vez chegara.")
        }
        141 -> {
            val participantes = (1..3).map {
                val nome = texto("Digite o nome do finalista $it: ")
                val pontos = inteiro("Digite os pontos de $nome: ")
                nome to pontos
            }.sortedByDescending { it.second }
            println("Vencedor: ${participantes[0].first} - ${participantes[0].second} pontos")
            println("Segundo colocado: ${participantes[1].first} - ${participantes[1].second} pontos")
            println("Terceiro colocado: ${participantes[2].first} - ${participantes[2].second} pontos")
        }
        142 -> {
            val pontos = (1..3).map { inteiro("Digite os pontos do jogador $it: ") }.sorted()
            println("Pontos em ordem decrescente: ${pontos.reversed().joinToString(" ")}")
            val soma = pontos.sum()
            if (soma > 100) println("Media: %.2f".format(soma / 3.0))
            else println("Equipe desclassificada.")
        }
        143 -> {
            val palavra = texto("Digite uma palavra (letras minusculas): ")
            if (palavra.isEmpty()) println("Palavra vazia.")
            else if (palavra.length % 2 == 0) {
                val centro = palavra.substring(palavra.length / 2 - 1, palavra.length / 2 + 1)
                println(if (centro == "rr" || centro == "ss") "E rr ou ss." else "Nao e rr ou ss.")
            } else {
                val centro = palavra[palavra.length / 2]
                println(if (centro in "aeiou") "A letra central e vogal." else "A letra central nao e vogal.")
            }
        }
        144 -> {
            val saldo = real("Digite o saldo medio: ")
            val credito = when {
                saldo <= 500 -> 0.0
                saldo <= 1000 -> saldo * 0.30
                saldo <= 3000 -> saldo * 0.40
                else -> saldo * 0.50
            }
            println("Saldo medio: ${dinheiro(saldo)}")
            if (credito == 0.0) println("Nenhum credito.")
            else println("Credito concedido: ${dinheiro(credito)}")
        }
        145 -> {
            val livro = texto("Digite o nome do livro: ")
            val tipo = texto("Tipo de usuario (professor/aluno): ").lowercase()
            val dias = when (tipo) {
                "professor" -> 10
                "aluno" -> 3
                else -> 0
            }
            if (dias == 0) println("Tipo de usuario desconhecido.")
            else {
                println("Nome do livro: $livro")
                println("Tipo de usuario: $tipo")
                println("Total de dias: $dias")
            }
        }
        146 -> {
            val tipo = texto("Digite o tipo do carro (A/B/C): ").uppercase()
            val percurso = real("Digite o percurso em km: ")
            val kmLitro = when (tipo) { "C" -> 12.0; "B" -> 9.0; "A" -> 8.0; else -> 0.0 }
            if (kmLitro == 0.0) println("Modelo inexistente.")
            else println("Consumo estimado: %.2f litros".format(percurso / kmLitro))
        }
        147 -> {
            println("Prato: 1-Vegetariano 2-Peixe 3-Frango 4-Carne")
            val prato = inteiro("Escolha o prato: ")
            println("Sobremesa: 1-Abacaxi 2-Sorvete diet 3-Mousse diet 4-Mousse chocolate")
            val sobremesa = inteiro("Escolha a sobremesa: ")
            println("Bebida: 1-Cha 2-Suco de laranja 3-Suco de melao 4-Refrigerante diet")
            val bebida = inteiro("Escolha a bebida: ")
            val c1 = listOf(180, 230, 250, 350).getOrNull(prato - 1)
            val c2 = listOf(75, 110, 170, 200).getOrNull(sobremesa - 1)
            val c3 = listOf(20, 70, 100, 65).getOrNull(bebida - 1)
            if (c1 == null || c2 == null || c3 == null) println("Opcao invalida.")
            else println("Total de calorias: ${c1 + c2 + c3} cal")
        }
        148 -> {
            println("Destino: 1-Norte 2-Nordeste 3-Centro-Oeste 4-Sul")
            val destino = inteiro("Escolha o destino: ")
            val idaVolta = inteiro("Viagem: 1-Ida 2-Ida e volta: ")
            val preco = when (destino) {
                1 -> if (idaVolta == 1) 500.0 else if (idaVolta == 2) 900.0 else -1.0
                2 -> if (idaVolta == 1) 350.0 else if (idaVolta == 2) 650.0 else -1.0
                3 -> if (idaVolta == 1) 350.0 else if (idaVolta == 2) 600.0 else -1.0
                4 -> if (idaVolta == 1) 300.0 else if (idaVolta == 2) 550.0 else -1.0
                else -> -1.0
            }
            if (preco < 0) println("Opcao inexistente.") else println("Valor da passagem: ${dinheiro(preco)}")
        }
        149 -> {
            val nome = texto("Digite o nome do produto: ")
            val compra = real("Digite o valor da compra: ")
            val fator = when {
                compra < 10 -> 1.70
                compra < 30 -> 1.50
                compra < 50 -> 1.40
                else -> 1.30
            }
            println("$nome sera vendido por ${dinheiro(compra * fator)}")
        }
        150 -> {
            val angulo = real("Digite o angulo em graus: ")
            val normalizado = ((angulo % 360) + 360) % 360
            val rad = Math.toRadians(normalizado)
            val quadrante = when {
                normalizado > 0 && normalizado < 90 -> 1
                normalizado > 90 && normalizado < 180 -> 2
                normalizado > 180 && normalizado < 270 -> 3
                normalizado > 270 && normalizado < 360 -> 4
                else -> 0
            }
            when (quadrante) {
                2, 4 -> println("Seno: ${sin(rad)}")
                1, 3 -> println("Co-seno: ${cos(rad)}")
                else -> println("O angulo esta sobre um eixo e nao pertence a um quadrante.")
            }
        }
        151 -> {
            val peso = real("Digite o peso em kg: ")
            val altura = real("Digite a altura em metros: ")
            if (altura <= 0) println("Altura invalida.")
            else {
                val imc = peso / altura.pow(2)
                val risco = when {
                    imc < 20 -> "Abaixo do peso"
                    imc <= 25 -> "Normal"
                    imc <= 30 -> "Excesso de peso"
                    imc <= 35 -> "Obesidade"
                    else -> "Obesidade morbida"
                }
                println("IMC: %.2f - Faixa de risco: $risco".format(imc))
            }
        }
        152 -> {
            println("ATENCAO: exercicio academico; nao utilize este calculo para medicacao real.")
            val peso = real("Digite o peso em kg: ")
            val idade = inteiro("Digite a idade: ")
            val mg = when {
                peso < 5 -> 0.0
                idade >= 12 && peso >= 60 -> 1000.0
                idade >= 12 -> 875.0
                peso <= 9 -> 125.0
                peso <= 16 -> 250.0
                peso <= 24 -> 375.0
                peso <= 30 -> 500.0
                else -> 750.0
            }
            if (mg == 0.0) println("Peso abaixo de 5 kg: consulte um profissional de saude.")
            else {
                val gotasPorMl = 20.0
                val mgPorMl = 500.0
                val gotas = mg / (mgPorMl / gotasPorMl)
                println("Dose indicada pelo enunciado: %.0f mg = %.0f gotas.".format(mg, gotas))
            }
        }
        153 -> {
            val indice = real("Digite o indice de poluicao: ")
            println(when {
                indice >= 0.5 -> "Suspender atividades das industrias dos grupos 1, 2 e 3."
                indice >= 0.4 -> "Suspender atividades das industrias dos grupos 1 e 2."
                indice >= 0.3 -> "Suspender atividades das industrias do grupo 1."
                else -> "Indice de poluicao aceitavel para todos os grupos."
            })
        }
        154 -> {
            val placa = texto("Digite a placa do carro: ").uppercase()
            val ultimo = placa.lastOrNull()
            val mes = when (ultimo) {
                '1' -> "janeiro"; '2' -> "fevereiro"; '3' -> "marco"; '4' -> "abril"
                '5' -> "maio"; '6' -> "junho"; '7' -> "julho"; '8' -> "agosto"
                '9' -> "setembro"; '0' -> "outubro"; else -> null
            }
            println(mes ?: "Opcao invalida.")
        }
        155 -> {
            val palavra = texto("Digite uma palavra: ")
            val primeira = palavra.firstOrNull()?.lowercaseChar()
            val nova = if (primeira == 'l' || primeira == 'd') {
                if (palavra.length >= 2) palavra.take(2) + palavra.last() else palavra
            } else palavra.drop(1)
            println("Nova palavra: $nova")
        }
        156 -> {
            val dia = inteiro("Digite o dia: ")
            val mes = inteiro("Digite o mes: ")
            val ano = inteiro("Digite o ano: ")
            println(if (dataValida(dia, mes, ano)) "DATA VALIDA" else "DATA INVALIDA")
        }
        157 -> {
            val data = texto("Digite a data no formato ddmmaaaa: ")
            if (data.length != 8 || !data.all { it.isDigit() }) println("DATA INVALIDA")
            else {
                val dia = data.substring(0, 2).toInt()
                val mes = data.substring(2, 4).toInt()
                val ano = data.substring(4, 8).toInt()
                println(if (dataValida(dia, mes, ano)) "DATA VALIDA" else "DATA INVALIDA")
            }
        }
        158 -> {
            val x = real("Digite o valor de x: ")
            if (x == 2.0) println("A funcao nao pode ser calculada para x = 2.")
            else println("f(x) = ${8.0 / (2.0 - x)}")
        }
        159 -> {
            val x = real("Digite o valor de x: ")
            val radicando = x * x - 16
            if (radicando <= 0) println("A funcao nao pode ser calculada para esse valor de x.")
            else println("f(x) = ${(5 * x + 3) / sqrt(radicando)}")
        }
        160 -> {
            val x = real("Digite o valor de x: ")
            val y = when {
                x <= 1 -> 1.0
                x <= 2 -> 2.0
                x <= 3 -> x.pow(2)
                else -> x.pow(3)
            }
            println("Valor de f(x): $y")
        }
    }
}

private fun lerTresReais(): Triple<Double, Double, Double> {
    val a = real("Digite o primeiro lado/numero: ")
    val b = real("Digite o segundo lado/numero: ")
    val c = real("Digite o terceiro lado/numero: ")
    return Triple(a, b, c)
}

private fun dataValida(dia: Int, mes: Int, ano: Int): Boolean {
    if (ano < 1 || mes !in 1..12 || dia < 1) return false
    val bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0
    val diasMes = when (mes) {
        2 -> if (bissexto) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }
    return dia <= diasMes
}
