package com.example.myapplication.Kotlin

//

fun main(array: Array<String>) {

    // 클래스를 통해서 실체를 만드는 방법
    Car("v8 engine", "sedan")

    val bigCar = Car("v8 engine", "sedan")

    // 우리가 만든 클래스는 자료형이 된다
    val bigCar1 : Car = Car("v8 engine", "sedan")

    val SuperCar : SuperCar = SuperCar("good engine", "awesome body", "power wheel")

    val runableCar : RunableCar = RunableCar("v8", "soft")
    runableCar.ride()
    runableCar.start()
    runableCar.navigation("속초")

    // 인스턴스 멤버 변수에 접근하는 방법
    val runableCar2 : RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.engine)
    println(runableCar2.body)


    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)
}


// 클래스를 만드는 방법(1)
class Car(var engine: String, var body: String) {

}

// 클래스를 만드는 방법(2)

class SuperCar {
    var engine: String
    var body: String
    var wheel: String

    constructor(engine: String, body: String, wheel: String) {
        this.engine = engine
        this.body = body
        this.wheel = wheel

    }
}


// 클래스를 만드는 방법(3) 1번 확장
class Car1(engine: String, body: String) {
    var wheel: String = ""

    constructor(engine: String, body: String, wheel: String) : this(engine, body) {
        this.wheel = wheel
    }
}


// 클래스를 만드는 방법(4) 2번 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var wheel: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body

    }

    constructor(engine: String, body: String, wheel: String) {
        this.engine = engine
        this.body = body
        this.wheel = wheel

    }

}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun start() {
        println("시동이 걸렸습니다 !")
    }

    fun navigation(destination : String) {
        println("$destination (으)로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine : String
    var body : String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }
    init {
        // 초기셋팅을 할 때 유용하다.
        println("RunableCar2가 만들어 졌습니다.")
    }
    fun ride() {
        println("탑승 하였습니다.")
    }

    fun start() {
        println("시동이 걸렸습니다 !")
    }

    fun navigation(destination : String) {
        println("$destination (으)로 목적지가 설정되었습니다.")
    }
}

// 오버로딩
class TestClass() {

    fun test(a: Int) {
        println("up")

    }

    fun test(a: Int, b: Int) {
        println("down")

    }
}

