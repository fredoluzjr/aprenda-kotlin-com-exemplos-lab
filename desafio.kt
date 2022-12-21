// explorar a sintaxe em orientação a objetos

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)
// habilidades e objetivos (array string) -> Implementação futura

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int)
// tecnologias (array string) -> Implementação futura

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) { // vararg para poder inscrever um ou varios usuarios
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
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
    //println(inscritos)
}