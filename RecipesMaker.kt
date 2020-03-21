fun main(args: Array<String>) {
    println(":: Bienvenido a Recipe Maker ::")

    println("Selecciona la opción deseada")
    println("1. Hacer una receta")
    println("2. Ver mis recetas")
    println("3. Salir")


    var opcion:String? = readLine()
    //Usando when
    while(opcion != "3"){
        when(opcion){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            else -> println("Favor Ingresar una opcion Válida")
        }
        opcion = readLine()
    }
        println("Opcion 3, Saliendo...")
}

fun makeRecipe(){
    val ingredientes:List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

    println("Ingresando a Hacer una receta")
    println("Esta es la Lista de Ingredientes:")

    for ((indice, item) in ingredientes.withIndex()){
        println("${indice.plus(1)} $item" )
    }
}

fun viewRecipe(){
    println("Ver mis Recetas")
}
