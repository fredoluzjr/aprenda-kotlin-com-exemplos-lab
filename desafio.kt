// explorar a sintaxe em orientação a objetos

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)
// habilidades e objetivos (array string) -> Implementação futura

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int)
// tecnologias (array string) -> Implementação futura

open class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {

	val inscritos = mutableListOf<Usuario>()
    
	open fun matricular(usuario: Usuario) { // vararg para poder inscrever um ou varios usuarios
    	inscritos.add(usuario)
        println("$usuario")

    	//TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
	}
    
    fun users(): MutableList<Usuario> {
    	return inscritos
	}
   
}  

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val aluno1 = Usuario("Jorge", "jorge@email.com")
    val aluno2 = Usuario("Ana", "ana@gmail.com")
    val aluno3 = Usuario("Caio", "caio@gmail.com")
    
    println(aluno1)
    println(aluno2)
    println(aluno3)
    
    val contentA1 = ConteudoEducacional("Introdução ao Kotlin", Nivel.BASICO, 60)
    val contentA2 = ConteudoEducacional("Estruturas de Controle de Fluxo em Kotlin", Nivel.INTERMEDIARIO, 120)
    val contentA: MutableList<ConteudoEducacional> = mutableListOf(contentA1, contentA2)
    
    val contentB1 = ConteudoEducacional("Introdução ao Java", Nivel.BASICO, 60)
    val contentB2 = ConteudoEducacional("Estruturas avançadas em Java", Nivel.AVANCADO, 160)
    val contentB: MutableList<ConteudoEducacional> = mutableListOf(contentB1, contentB2)
    
    println(contentA1)
    println(contentA2)
    println(contentB1)
    println(contentB2)
    println(contentA)
    println(contentB)
    
    val formacao1 = Formacao("Formação Kotlin", mutableListOf(contentA1, contentA2))
    println(formacao1)
    
    //matricular("Raul", "raul@gmail.com")
    
    //println("$inscritos")
   
    //users().forEach {
        //inscritos -> println("O(A) aluno(a) $inscritos está na lista de matriculados")
    //}
}