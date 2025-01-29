data class Domicilio(val calle: String, val numero: Int) {
    fun dirCompleta(): String {
        return "$calle $numero"
    }
}

data class Cliente(val nombre: String, val domicilio: Domicilio)

data class Compra(val cliente: Cliente, val dia: Int, val monto: Double)

class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): Set<String> {
        return compras.map { it.cliente.domicilio.dirCompleta() }.toSet()
    }
}

fun main() {
    val cliente1 = Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355))
    val cliente2 = Cliente("Jorge Russo", Domicilio("Mirasol", 218))
    val cliente3 = Cliente("Julián Rodriguez", Domicilio("La Mancha", 761))

    val compra1 = Compra(cliente1, 5, 12780.78)
    val compra2 = Compra(cliente2, 7, 699.0)
    val compra3 = Compra(cliente1, 7, 532.90)
    val compra4 = Compra(cliente3, 12, 5715.99)
    val compra5 = Compra(cliente2, 15, 958.0)

    val repo = RepositorioCompras()
    repo.agregarCompra(compra1)
    repo.agregarCompra(compra2)
    repo.agregarCompra(compra3)
    repo.agregarCompra(compra4)
    repo.agregarCompra(compra5)

    println(repo.domicilios())
}
