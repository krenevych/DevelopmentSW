package lab07

open class Vehicle(protected val mark: String) {
    open val model: String = "Unknown"
    open fun run(){
        println("vehicle $mark is running")
    }
}

open class Car(mark: String, myModel: String): Vehicle(mark) {
    override val model: String = myModel

//    init {
//        model = myModel
//    }

    final override fun run(){
        println("car $mark is running")
    }
}

class Hatchback: Car("Hyundai", "i30") {
    // it is prohibited to override method run,
    // because it marked as final in class parent Car
}


fun main() {
    val vehicle: Vehicle = Hatchback()
//    val vehicle: Vehicle = Vehicle("BMV")
    vehicle.run()
    println(vehicle.model)
}