fun main(args: Array<String>) {
    println(":: Bienvenido a Recipe Maker ::")

    println("Selecciona la opción deseada")
    println("1. Hacer una receta")
    println("2. Ver mis recetas")
    println("3. Salir")

    val ingredientes:List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

    var opcion:String? = readLine()
    //Usando when
    while(opcion != "3"){
        when(opcion){
            "1" -> {println("Ingresando a Hacer una receta")
                println("Esta es la Lista de Ingredientes:")
                println("Ingredientes: ${ingredientes}")
            }
            "2" -> println("Mostrando Recetas")
            else -> println("Favor Ingresar una opcion Válida")
        }
        opcion = readLine()
    }
        println("Opcion 3, Saliendo...")
        readLine()
}
