open class Geometry_230060003 {

    fun displayInfo_230060003() {
        println("Area: ${calculateArea_230060003()}")
        println("Volume: ${calculateVolume_230060003()}")
    }

    open fun calculateArea_230060003(): Double {
        return 0.0
    }

    open fun calculateVolume_230060003(): Double {
        return 0.0
    }
}

class Cube_230060003(private var side: Double) : Geometry_230060003() {

    fun getSide(): Double {
        return side
    }

    fun setSide(newSide: Double) {
        side = newSide
    }

    override fun calculateArea_230060003(): Double {
        return 6 * side * side
    }

    override fun calculateVolume_230060003(): Double {
        return side * side * side
    }
}

class SquarePyramid_230060003(private var side: Double, private var height: Double) : Geometry_230060003() {

    fun getSide(): Double {
        return side
    }

    fun setSide(newSide: Double) {
        side = newSide
    }

    fun getHeight(): Double {
        return height
    }

    fun setHeight(newHeight: Double) {
        height = newHeight
    }
    override fun  calculateArea_230060003(): Double {
        return 1/2 * side * height
    }

    override fun calculateVolume_230060003(): Double {
        return 1/3 * side * side * height
    }
}

class Cuboid_230060003(private var length: Double, private var width: Double, private var height: Double) : Geometry_230060003() {

    fun getLength(): Double {
        return length
    }

    fun setLength(newLength: Double) {
        length = newLength
    }

    fun getWidth(): Double {
        return width
    }

    fun setWidth(newWidth: Double) {
        width = newWidth
    }

    fun getHeight() : Double {
        return height
    }

    fun setHeight(newHeight: Double) {
        height = newHeight
    }

    override fun calculateArea_230060003(): Double {
        return 2 * ((length * width) + (length * height) + (width * height))
    }

    override fun calculateVolume_230060003(): Double {
        return length * width * height
    }
}

class Cone_230060003(private var radius: Double, private var height: Double, private var slantheight: Double) : Geometry_230060003() {

    fun getRadius(): Double {
        return radius
    }

    fun setRadius(newRadius: Double) {
        radius = newRadius
    }

    fun getHeight(): Double {
        return height
    }

    fun setHeight(newHeight: Double) {
        height = newHeight
    }

    fun getSlantHeight(): Double {
        return slantheight
    }

    fun setSlantHeight(newSlantHeight: Double) {
        slantheight = newSlantHeight
    }

    override fun calculateArea_230060003(): Double {
        return 3.14 * radius * (radius + slantheight)
    }

    override fun calculateVolume_230060003(): Double {
        return 1/3 * 3.14 * radius * radius * height
    }
}

class Bola_230060003(private var radius: Double) : Geometry_230060003() {

    fun getRadius(): Double {
        return radius
    }

    fun setRadius(newRadius: Double) {
        radius = newRadius
    }

    override fun calculateArea_230060003(): Double {
        return 4 * 3.14 * radius * radius
    }

    override fun calculateVolume_230060003(): Double {
        return 4/3 * 3.14 * radius * radius
    }
}

class Tabung_230060003(private var radius: Double, private var height: Double) : Geometry_230060003() {

    fun getRadius(): Double {
        return radius
    }

    fun setRadius(newRadius: Double) {
        radius = newRadius
    }

    fun getHeight(): Double {
        return height
    }

    fun setHeight(newHeight:Double) {
        height = newHeight
    }

    override fun calculateArea_230060003(): Double {
        return 2 * 3.14 * radius * (radius + height)
    }

    override fun calculateVolume_230060003(): Double {
        return 3.14 * radius * radius * height
    }
}

fun main () {

    val cube_230060003 = Cube_230060003(5.0)
    println("Initial Cube Info:")
    cube_230060003.displayInfo_230060003()

    cube_230060003.setSide(5.0)
    println("Modified Cube Info:")
    println("Side: ${cube_230060003.getSide()}")
    cube_230060003.displayInfo_230060003()


    val squarepyramid_230060003 = SquarePyramid_230060003(7.0, 15.0)
    println("Initial Square Pyramid Info:")
    squarepyramid_230060003.displayInfo_230060003()

    squarepyramid_230060003.setSide(7.0)
    squarepyramid_230060003.setHeight(15.0)
    println("Modified Square Pyramid Info:")
    println("Side: ${squarepyramid_230060003.getSide()}")
    println("Height: ${squarepyramid_230060003.getHeight()}")
    squarepyramid_230060003.displayInfo_230060003()

    val cuboid_230060003 = Cuboid_230060003(8.0, 10.0, 4.0)
    println("Initial Cuboid Info:")
    cuboid_230060003.displayInfo_230060003()

    cuboid_230060003.setLength(8.0)
    cuboid_230060003.setWidth(10.0)
    cuboid_230060003.setHeight(4.0)
    println("Modified Cuboid Info:")
    println("Length: ${cuboid_230060003.getLength()}")
    println("Width: ${cuboid_230060003.getWidth()}")
    println("Height: ${cuboid_230060003.getHeight()}")
    cuboid_230060003.displayInfo_230060003()

    val cone_230060003 = Cone_230060003(23.0, 10.0, 18.0)
    println("Initial Cone Info:")
    cone_230060003.displayInfo_230060003()

    cone_230060003.setRadius(23.0)
    cone_230060003.setHeight(10.0)
    cone_230060003.setSlantHeight(18.0)
    println("Modified Cone Info:")
    println("Radius: ${cone_230060003.getRadius()}")
    println("Height: ${cone_230060003.getHeight()}")
    println("Slant Height: ${cone_230060003.getSlantHeight()}")
    cone_230060003.displayInfo_230060003()

    val bola_230060003 = Bola_230060003(15.0)
    println("Initial Bola Info:")
    bola_230060003.displayInfo_230060003()

    bola_230060003.setRadius(15.0)
    println("Modified Bola Info:")
    println("Radius: ${bola_230060003.getRadius()}")
    bola_230060003.displayInfo_230060003()

    val tabung_230060003 = Tabung_230060003(14.0, 35.0)
    println("Initial Tabung Info:")
    tabung_230060003.displayInfo_230060003()

    tabung_230060003.setRadius(14.0)
    tabung_230060003.setHeight(35.0)
    println("Modified Tabung Info:")
    println("Radius: ${tabung_230060003.getRadius()}")
    println("Height: ${tabung_230060003.getHeight()}")
    tabung_230060003.displayInfo_230060003()
}