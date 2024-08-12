import java.util.Scanner

class User230603 {
    private var name: String = ""
    private var uname: String = ""
    private var pword: String = ""

    constructor(name: String, uname: String, pword: String) {
        this.name = name
        this.uname = uname
        this.pword = pword
    }

    //getters
    fun getName(): String {
        return name
    }

    fun getUName(): String {
        return uname
    }

    fun getPWord(): String {
        return pword
    }

    //setters
    fun setName(name: String) {
        this.name = name
    }

    fun setUName(uname: String) {
        this.uname = uname
    }

    fun setPWord(pword: String) {
        this.pword = pword
    }
}
class Cdata230603 {
    private var ccode: String = ""
    private var cname: String = ""
    private var cnum: String = ""
    private var cadres: String = ""

    constructor(ccode: String, cname: String, cnum: String, cadres: String) {
        this.ccode = ccode
        this.cname = cname
        this.cnum = cnum
        this.cadres = cadres
    }

    //getters
    fun getCCode(): String {
        return ccode
    }
    fun getCName(): String {
        return cname
    }
    fun getCNum(): String {
        return cnum
    }
    fun getCAdres(): String {
        return cadres
    }

    //setters
    fun setCCode(ccode: String) {
        this.ccode = ccode
    }
    fun setCName(cname: String) {
        this.cname = cname
    }
    fun setCNum(cnum: String) {
        this.cnum = cnum
    }
    fun setCAdres(cadres: String) {
        this.cadres = cadres
    }

    //displaydetailz
    fun displayCDetails() {
        println("Customer Code: $ccode")
        println("Customer Name: $cname")
        println("Customer Telephone Number: $cnum")
        println("Customer Address: $cadres")
    }

}

open class Pdata230603(val pcode: String, var pname: String, var pbrand: String, var price: Double) {
    open fun displayPDetails() {
        println("Product Code: $pcode")
        println("Product Name: $pname")
        println("Product Brand: $pbrand")
        println("Product Price: ¥$price")
    }

    class Phone(pcode: String, pname: String, pbrand: String, price: Double, var length: String, var type: String, var color: String, var year: String): Pdata230603(pcode, pname, pbrand, price) {
        override fun displayPDetails() {
            super.displayPDetails()
            println("Type: $type")
            println("Length: $length")
            println("Color: $color")
            println("Year: $year")
        }
    }

    class Tablet(pcode: String, pname: String, pbrand: String, price: Double, var width: String, var type: String, var color: String, var year: String): Pdata230603(pcode, pname, pbrand, price) {
        override fun displayPDetails() {
            super.displayPDetails()
            println("Type: $type")
            println("Width: $width")
            println("Color: $color")
            println("Year: $year")
        }
    }
}

class Sdata230603 {
    private var scode: String = ""
    private var sname: String = ""
    private var snum: String = ""
    private var sadd: String = ""

    constructor(scode: String, sname: String, snum: String, sadd: String) {
        this.scode = scode
        this.sname = sname
        this.snum = snum
        this.sadd = sadd
    }

    fun getSCode(): String {
        return scode
    }
    fun getSName(): String {
        return sname
    }
    fun getSNum(): String {
        return snum
    }
    fun getSadd(): String {
        return sadd
    }

    //setters
    fun setSCode(scode: String) {
        this.scode = scode
    }
    fun setSName(sname: String) {
        this.sname = sname
    }
    fun setSNum(snum: String) {
        this.snum = snum
    }
    fun setSadd(sadd: String) {
        this.sadd = sadd
    }

    fun displaySDetails() {
        println("Supplier Code: $scode")
        println("Supplier Name: $sname")
        println("Supplier Telephone Number: $snum")
        println("Supplier Address: $sadd")
    }
}
class Edata230603 {
    private var ecode: String = ""
    private var ename: String = ""
    private var enum: String = ""

    constructor(ecode: String, ename: String, enum: String) {
        this.ecode = ecode
        this.ename = ename
        this.enum = enum
    }

    fun getECode(): String {
        return ecode
    }
    fun getEName(): String {
        return ename
    }
    fun getENum(): String {
        return enum
    }

    fun setECode(ecode: String) {
        this.ecode = ecode
    }
    fun setEName(ename: String) {
        this.ename = ename
    }
    fun setENum(enum: String) {
        this.enum = enum
    }

    fun displayEDetails() {
        println("Employee Code: $ecode")
        println("Employee Name: $ename")
        println("Employee Telephone Number: $enum")
    }
}
class Shdata230603 {
    private var shcode: String = ""
    private var shname: String = ""
    private var shnote: String = ""

    constructor(shcode: String, shname: String, shnote: String) {
        this.shcode = shcode
        this.shname = shname
        this.shnote = shnote
    }

    fun getShcode(): String {
        return shcode
    }
    fun getShname(): String {
        return shname
    }
    fun getShnote(): String {
        return shnote
    }

    fun setShcode(shcode: String) {
        this.shcode = shcode
    }
    fun setShname(shname: String) {
        this.shname = shname
    }
    fun setShnote(shnote: String) {
        this.shnote = shnote
    }

    fun displayShDetails() {
        println("Shipment Code: $shcode")
        println("Shipper: $shname")
        println("Note: $shnote")
    }
}

class Tdata230603(var tcode: String, var ccode: String, var scode: String, var ecode: String, var shcode: String, var stuff: List<Pair<String, Int>>) {
    fun displayTDetails() {
        val cname = buncdata230603.find { it.getCCode() == ccode }?.getCName() ?: "null"
        val sname = bunsdata230603.find { it.getSCode() == scode }?.getSName() ?: "null"
        val ename = bunedata230603.find { it.getECode() == ecode }?.getEName() ?: "null"
        val shname = bunshdata230603.find { it.getShcode() == shcode }?.getShcode() ?: "null"

        println("Transaction Code: $tcode")
        println("Customer Name: $cname")
        println("Supplier Name: $sname")
        println("Employee Name: $ename")
        println("Shipper: $shname")

        println("Gadgets and Stuff: ")
        println("===================")

        var total = 0.0
        stuff.forEach { (idkanym, amt) ->
            val Pdata230603 = bunpdata230603.find { it.pcode == idkanym }
            val pname = Pdata230603 ?: "null"
            val indieprice = Pdata230603?.price ?: 0.0
            val sum = indieprice * amt
            total += sum

            println("Product Code: $idkanym")
            println("Product Name: $pname")
            println("Amount: $amt")
            println("Price: ¥$indieprice/unit")
            println("Sum: ¥$sum")
        }

        println("===================")
        println("Your Total: ¥$total")
    }
}
val bunuser230603 = mutableListOf<User230603>()
val buncdata230603 = mutableListOf<Cdata230603>()
val bunsdata230603 = mutableListOf<Sdata230603>()
val bunpdata230603 = mutableListOf<Pdata230603>()
val bunedata230603 = mutableListOf<Edata230603>()
val bunshdata230603 = mutableListOf<Shdata230603>()
val buntdata230603 = mutableListOf<Tdata230603>()

fun main() {
    val scanner = Scanner(System.`in`)
    var iminurhouse230603: User230603? = null

    while (true) {
        if (iminurhouse230603 == null) {
            //Main menu number 1
            println("")
            println("Gadgets and Stuff:")
            println("===================")
            println("1. Login")
            println("2. Register")
            println("3. Exit")
            print("Enter choice: ")
            when (scanner.nextInt()) {
                1 -> {
                    scanner.nextLine()
                        print("Enter name: ")
                        val name = scanner.nextLine()

                        print("Enter username: ")
                        val uname = scanner.nextLine()

                        print("Enter password: ")
                        val pword = scanner.nextLine()

                    val user = bunuser230603.find {it.getUName() == uname && it.getPWord() == pword}
                    if (user != null){
                        iminurhouse230603 = user
                        println("Welcome, ${user.getName()}.")
                    } else {
                        println("Who are you?")
                    }
                }

                2 -> {
                    scanner.nextLine()

                    print("Enter name: ")
                    val name = scanner.nextLine()

                    print("Enter username: ")
                    val uname = scanner.nextLine()

                    print("Enter password: ")
                    val pword = scanner.nextLine()

                    if (bunuser230603.any {it.getUName() == uname}) {
                        println{"I remember you!"}
                    } else {
                        val user = User230603(name, uname, pword)
                        bunuser230603.add(user)
                        println("Registered successfully!")
                    }
                }

                3 -> {
                    println("See you soon!")
                    break
                }

                else -> {
                    println("Enter the number listed, come on.")
                }
            }
        } else {
            println("")
            println("Gadgets and Stuff: ")
            println("===================")
            println("1. Data Master")
            println("2. Transaction Data")
            println("3. Generate Report")
            println("4. Logout")
            print("Enter choice: ")
            when (scanner.nextInt()) {

                1 -> {
                    println("Data Master")
                    println("===================")
                    println("1. Customer Data")
                    println("2. Supplier Data")
                    println("3. Product Data (admin only)")
                    println("4. Employee Data")
                    println("5. Shipment Data")
                    println("6. Return to Main Menu")
                    print("Enter choice: ")
                    when (scanner.nextInt()) {
                        1 -> {
                            //submenu 1
                            scanner.nextLine()
                            println("")
                            println("Customer Data")
                            println("===================")
                            println("1. View Data")
                            println("2. Add Data")
                            println("3. Edit Data")
                            println("4. Delete Data")
                            print("Enter choice: ")
                            when (scanner.nextInt()) {
                                1 -> {
                                    scanner.nextLine()

                                    if (buncdata230603.isEmpty()) {
                                        println("Oopsies, data unavailable.")
                                    } else {
                                        println("Customer Data: ")
                                        for (customer in buncdata230603) {
                                            customer.displayCDetails()
                                            println()
                                        }
                                    }
                                }

                                2 -> {
                                    do {
                                        scanner.nextLine()

                                        print("Enter customer code: ")
                                        val ccode = scanner.nextLine()

                                        print("Enter customer name: ")
                                        val cname = scanner.nextLine()

                                        print("Enter customer telephone number: ")
                                        val cnum = scanner.nextLine()

                                        print("Enter customer address: ")
                                        val cadres = scanner.nextLine()

                                        if (buncdata230603.any { it.getCCode() == ccode }) {
                                            println { "Code exists!" }
                                        } else {
                                            val customer = Cdata230603(ccode, cname, cnum, cadres)
                                            buncdata230603.add(customer)
                                            println("Bing-bong! Added successfully!")
                                        }

                                        print("Wanna add more? (Y/N): ")
                                    } while (scanner.nextLine().equals("Y", ignoreCase = true))
                                }


                                3 -> {
                                    scanner.nextLine()
                                    print("Enter customer code: ")
                                    val ccode = scanner.nextLine()

                                    scanner.nextLine()
                                    val customer = buncdata230603.find { it.getCCode() == ccode }
                                    if (customer != null) {
                                        print("Enter customer name (leave blank to keep current): ")
                                        val cname = scanner.nextLine()
                                        if (cname.isNotEmpty()) customer.setCName(cname)

                                        print("Enter customer number (leave blank to keep current): ")
                                        val cnum = scanner.nextLine()
                                        if (cnum.isNotEmpty()) customer.setCNum(cnum)

                                        print("Enter customer address (leave blank to keep current): ")
                                        val cadres = scanner.nextLine()
                                        if (cadres.isNotEmpty()) customer.setCAdres(cadres)
                                    } else {
                                        println("Sowwy, customer code $ccode not found?")
                                    }
                                }

                                4 -> {
                                    scanner.nextLine()
                                    print("Enter customer code to delete: ")
                                    val ccode = scanner.nextLine()
                                    scanner.nextLine()
                                    val customer = buncdata230603.find { it.getCCode() == ccode }
                                    if (customer != null) {
                                        buncdata230603.remove(customer)
                                        println("Customer code $ccode removed successfully!")
                                    } else {
                                        println("Sowwy, customer code $ccode not found?")
                                    }
                                }

                                else -> {
                                    println("Enter the number listed, come on.")
                                }
                            }

                        }

                        2 -> {
                            scanner.nextLine()
                            println("")
                            println("Supplier Data")
                            println("===================")
                            println("1. View Data")
                            println("2. Add Data")
                            println("3. Edit Data")
                            println("4. Delete Data")
                            print("Enter choice: ")
                            when (scanner.nextInt()) {
                                1 -> {
                                    scanner.nextLine()

                                    if (bunsdata230603.isEmpty()) {
                                        println("Oopsies, data unavailable.")
                                    } else {
                                        println("Supplier Data: ")
                                        for (supplier in bunsdata230603) {
                                            supplier.displaySDetails()
                                            println()
                                        }
                                    }
                                }

                                2 -> {
                                    do {
                                        scanner.nextLine()

                                        print("Enter supplier code: ")
                                        val scode = scanner.nextLine()

                                        print("Enter supplier name: ")
                                        val sname = scanner.nextLine()

                                        print("Enter supplier telephone number: ")
                                        val snum = scanner.nextLine()

                                        print("Enter supplier address: ")
                                        val sadd = scanner.nextLine()

                                        if (bunsdata230603.any { it.getSCode() == scode }) {
                                            println { "Code exists!" }
                                        } else {
                                            val supplier = Sdata230603(scode, sname, snum, sadd)
                                            bunsdata230603.add(supplier)
                                            println("Bing-bong! Added successfully!")
                                        }

                                        print("Wanna add more? (Y/N): ")
                                    } while (scanner.nextLine().equals("Y", ignoreCase = true))
                                }

                                3 -> {
                                    scanner.nextLine()
                                    print("Enter supplier code: ")
                                    val scode = scanner.nextLine()

                                    scanner.nextLine()
                                    val supplier = bunsdata230603.find { it.getSCode() == scode }
                                    if (supplier != null) {
                                        print("Enter supplier name (leave blank to keep current): ")
                                        val sname = scanner.nextLine()
                                        if (sname.isNotEmpty()) supplier.setSName(sname)

                                        print("Enter supplier number (leave blank to keep current): ")
                                        val snum = scanner.nextLine()
                                        if (snum.isNotEmpty()) supplier.setSNum(snum)

                                        print("Enter supplier address (leave blank to keep current): ")
                                        val sadd = scanner.nextLine()
                                        if (sadd.isNotEmpty()) supplier.setSadd(sadd)
                                    } else {
                                        println("Sowwy, supplier code $scode not found?")
                                    }

                                }

                                4 -> {
                                    scanner.nextLine()
                                    print("Enter supplier code to delete: ")
                                    val scode = scanner.nextLine()
                                    scanner.nextLine()
                                    val supplier = bunsdata230603.find { it.getSCode() == scode }
                                    if (supplier != null) {
                                        bunsdata230603.remove(supplier)
                                        println("Supplier code $scode removed successfully!")
                                    } else {
                                        println("Sowwy, supplier code $scode not found?")
                                    }
                                }

                                else -> {
                                    println("Enter the number listed, come on.")
                                }
                            }
                        }

                        3 -> {
                            scanner.nextLine()
                            println("")
                            println("Product Data")
                            println("===================")
                            println("1. View Data")
                            println("2. Add Data")
                            println("3. Edit Data")
                            println("4. Delete Data")
                            print("Enter choice: ")
                            when (scanner.nextInt()) {
                                1 -> {
                                    scanner.nextLine()

                                    if (bunpdata230603.isEmpty()) {
                                        println("Oopsies, data unavailable.")
                                    } else {
                                        println("Product Data: ")
                                        for (stuff in bunpdata230603) {
                                            stuff.displayPDetails()
                                            println()
                                        }
                                    }
                                }

                                2 -> {
                                    scanner.nextLine() // Consume the newline
                                    println("Enter product type (phone/tablet): ")
                                    val type = scanner.nextLine().trim().toLowerCase()

                                    println("Enter product code: ")
                                    val pcode = scanner.nextLine().trim()

                                    println("Enter product name: ")
                                    val pname = scanner.nextLine().trim()

                                    println("Enter product brand: ")
                                    val pbrand = scanner.nextLine().trim()

                                    println("Enter product price: ¥")
                                    val price = scanner.nextDouble()
                                    scanner.nextLine() // Consume the newline

                                    when (type) {
                                        "phone" -> {
                                            println("Enter phone length: ")
                                            val length = scanner.nextLine().trim()

                                            println("Enter phone type: ")
                                            val phoneType = scanner.nextLine().trim()

                                            println("Enter phone color: ")
                                            val color = scanner.nextLine().trim()

                                            println("Enter phone year: ")
                                            val year = scanner.nextLine().trim()

                                            bunpdata230603.add(Pdata230603.Phone(pcode, pname, pbrand, price, length, phoneType, color, year))
                                        }

                                        "tablet" -> {
                                            println("Enter tablet width: ")
                                            val width = scanner.nextLine().trim()

                                            println("Enter tablet type: ")
                                            val tabletType = scanner.nextLine().trim()

                                            println("Enter tablet color: ")
                                            val color = scanner.nextLine().trim()

                                            println("Enter tablet year: ")
                                            val year = scanner.nextLine().trim()

                                            bunpdata230603.add(Pdata230603.Tablet(pcode, pname, pbrand, price, width, tabletType, color, year))
                                        }

                                        else -> {
                                            println("Invalid product type.")
                                        }
                                    }
                                }

                                3 -> {
                                    scanner.nextLine()
                                    println("Enter product code to edit: ")
                                    val pcode = scanner.nextLine().trim()

                                    val product = bunpdata230603.find { it.pcode == pcode }
                                    if (product != null) {
                                        println("Editing product with code $pcode")
                                        println("Enter new name (press Enter to keep current): ")
                                        val newName = scanner.nextLine().trim()
                                        if (newName.isNotEmpty()) {
                                            product.pname = newName
                                        }

                                        println("Enter new brand (press Enter to keep current): ")
                                        val newBrand = scanner.nextLine().trim()
                                        if (newBrand.isNotEmpty()) {
                                            product.pbrand = newBrand
                                        }

                                        println("Enter new price (press Enter to keep current): ")
                                        val newPriceInput = scanner.nextLine().trim()
                                        if (newPriceInput.isNotEmpty()) {
                                            product.price = newPriceInput.toDouble()
                                        }

                                        if (product is Pdata230603.Phone) {
                                            println("Enter new length (press Enter to keep current): ")
                                            val newLength = scanner.nextLine().trim()
                                            if (newLength.isNotEmpty()) {
                                                product.length = newLength
                                            }

                                            println("Enter new type (press Enter to keep current): ")
                                            val newType = scanner.nextLine().trim()
                                            if (newType.isNotEmpty()) {
                                                product.type = newType
                                            }

                                            println("Enter new color (press Enter to keep current): ")
                                            val newColor = scanner.nextLine().trim()
                                            if (newColor.isNotEmpty()) {
                                                product.color = newColor
                                            }

                                            println("Enter new year (press Enter to keep current): ")
                                            val newYear = scanner.nextLine().trim()
                                            if (newYear.isNotEmpty()) {
                                                product.year = newYear
                                            }
                                        }

                                        if (product is Pdata230603.Tablet) {
                                            println("Enter new width (press Enter to keep current): ")
                                            val newWidth = scanner.nextLine().trim()
                                            if (newWidth.isNotEmpty()) {
                                                product.width = newWidth
                                            }

                                            println("Enter new type (press Enter to keep current): ")
                                            val newType = scanner.nextLine().trim()
                                            if (newType.isNotEmpty()) {
                                                product.type = newType
                                            }

                                            println("Enter new color (press Enter to keep current): ")
                                            val newColor = scanner.nextLine().trim()
                                            if (newColor.isNotEmpty()) {
                                                product.color = newColor
                                            }

                                            println("Enter new year (press Enter to keep current): ")
                                            val newYear = scanner.nextLine().trim()
                                            if (newYear.isNotEmpty()) {
                                                product.year = newYear
                                            }
                                        }
                                    } else {
                                        println("Product not found.")
                                    }
                                }

                                4 -> {
                                    scanner.nextLine()
                                    println("Enter product code to delete: ")
                                    val pcode = scanner.nextLine().trim()

                                    val product = bunpdata230603.find { it.pcode == pcode }
                                    if (product != null) {
                                        bunpdata230603.remove(product)
                                        println("Product with code $pcode has been deleted.")
                                    } else {
                                        println("Product not found.")
                                    }
                                }

                                else -> {
                                    println("Enter the number listed, come on.")
                                }
                            }
                        }

                        4 -> {
                            scanner.nextLine()
                            println("")
                            println("Employee Data")
                            println("===================")
                            println("1. View Data")
                            println("2. Add Data")
                            println("3. Edit Data")
                            println("4. Delete Data")
                            print("Enter choice: ")
                            when (scanner.nextInt()) {
                                1 -> {
                                    scanner.nextLine()

                                    if (bunedata230603.isEmpty()) {
                                        println("Oopsies, data unavailable.")
                                    } else {
                                        println("Employee Data: ")
                                        for (employee in bunedata230603) {
                                            employee.displayEDetails()
                                            println()
                                        }
                                    }
                                }

                                2 -> {
                                    do {
                                        scanner.nextLine()

                                        print("Enter employee code: ")
                                        val ecode = scanner.nextLine()

                                        print("Enter employee name: ")
                                        val ename = scanner.nextLine()

                                        print("Enter employee telephone number: ")
                                        val enum = scanner.nextLine()

                                        if (bunedata230603.any { it.getECode() == ecode }) {
                                            println { "Code exists!" }
                                        } else {
                                            val employee = Edata230603(ecode, ename, enum)
                                            bunedata230603.add(employee)
                                            println("Bing-bong! Added successfully!")
                                        }

                                        print("Wanna add more? (Y/N): ")
                                    } while (scanner.nextLine().equals("Y", ignoreCase = true))
                                }

                                3 -> {
                                    scanner.nextLine()
                                    print("Enter employee code: ")
                                    val ecode = scanner.nextLine()

                                    scanner.nextLine()
                                    val employee = bunedata230603.find { it.getECode() == ecode }
                                    if (employee != null) {
                                        print("Enter employee name (leave blank to keep current): ")
                                        val ename = scanner.nextLine()
                                        if (ename.isNotEmpty()) employee.setEName(ename)

                                        print("Enter employee number (leave blank to keep current): ")
                                        val enum = scanner.nextLine()
                                        if (enum.isNotEmpty()) employee.setENum(enum)
                                    } else {
                                        println("Sowwy, employee code $ecode not found?")
                                    }
                                }

                                4 -> {
                                    scanner.nextLine()
                                    print("Enter employee code to delete: ")
                                    val ecode = scanner.nextLine()
                                    scanner.nextLine()
                                    val employee = bunedata230603.find { it.getECode() == ecode }
                                    if (employee != null) {
                                        bunedata230603.remove(employee)
                                        println("Employee code $ecode removed successfully!")
                                    } else {
                                        println("Sowwy, employee code $ecode not found?")
                                    }
                                }

                                else -> {
                                    println("Enter the number listed, come on.")
                                }
                            }
                        }

                        5 -> {
                            scanner.nextLine()
                            println("")
                            println("Shipment Data")
                            println("===================")
                            println("1. View Data")
                            println("2. Add Data")
                            println("3. Edit Data")
                            println("4. Delete Data")
                            print("Enter choice: ")
                            when (scanner.nextInt()) {
                                1 -> {
                                    if (bunshdata230603.isEmpty()) {
                                        println("Oopsies, data unavailable.")
                                    } else {
                                        println("Shipment Data: ")
                                        for (shipment in bunshdata230603) {
                                            shipment.displayShDetails()
                                            println()
                                        }
                                    }
                                }

                                2 -> {
                                    do {
                                        scanner.nextLine()

                                        print("Enter shipment code: ")
                                        val shcode = scanner.nextLine()

                                        print("Enter shipper: ")
                                        val shname = scanner.nextLine()

                                        print("Enter note: ")
                                        val shnote = scanner.nextLine()

                                        if (bunshdata230603.any { it.getShcode() == shcode }) {
                                            println { "Code exists!" }
                                        } else {
                                            val shipment = Shdata230603(shcode, shname, shnote)
                                            bunshdata230603.add(shipment)
                                            println("Bing-bong! Added successfully!")
                                        }

                                        print("Wanna add more? (Y/N): ")
                                    } while (scanner.nextLine().equals("Y", ignoreCase = true))
                                }

                                3 -> {
                                    scanner.nextLine()
                                    print("Enter shipment code: ")
                                    val shcode = scanner.nextLine()

                                    scanner.nextLine()
                                    val shipment = bunshdata230603.find { it.getShcode() == shcode }
                                    if (shipment != null) {
                                        print("Enter shipper: ")
                                        val shname = scanner.nextLine()
                                        if (shname.isNotEmpty()) shipment.setShname(shname)

                                        print("Enter note: ")
                                        val shnote = scanner.nextLine()
                                        if (shnote.isNotEmpty()) shipment.setShnote(shnote)
                                    } else {
                                        println("Sowwy, shipment code $shcode not found?")
                                    }
                                }

                                4 -> {
                                    scanner.nextLine()
                                    print("Enter shipment code to delete: ")
                                    val shcode = scanner.nextLine()
                                    scanner.nextLine()
                                    val shipment = bunshdata230603.find { it.getShcode() == shcode }
                                    if (shipment != null) {
                                        bunshdata230603.remove(shipment)
                                        println("Shipment code $shcode removed successfully!")
                                    } else {
                                        println("Sowwy, shipment code $shcode not found?")
                                    }
                                }
                            }
                        }

                        6 -> {
                            scanner.nextLine()
                            println("Returning to Main Menu...")
                        }

                        else -> {
                            println("Enter the number listed, come on.")
                        }
                    }
                }


                2 -> {
                    println("")
                    println("Transaction Data")
                    println("===================")
                    println("1. View Data")
                    println("2. Add Data")
                    println("3. Edit Data")
                    println("4. Delete Data")
                    println("5. Back to Main Menu")
                    print("Enter choice: ")
                    when (scanner.nextInt()) {
                        1 -> {
                            if (buntdata230603.isEmpty()) {
                                println("No transaction data available.")
                            } else {
                                println("Transaction Data: ")
                                for (transaction in buntdata230603) {
                                    transaction.displayTDetails()
                                    println()
                                }
                            }
                        }

                        2 -> {
                            scanner.nextLine()

                            print("Enter transaction code: ")
                            val tcode = scanner.nextLine()
                            print("Enter customer code: ")
                            val ccode = scanner.nextLine()
                            print("Enter supplier code: ")
                            val scode = scanner.nextLine()
                            print("Enter employee code: ")
                            val ecode = scanner.nextLine()
                            print("Enter shipment code: ")
                            val shcode = scanner.nextLine()

                            val stuff = mutableListOf<Pair<String, Int>>()
                            do {
                                print("Enter product code: ")
                                val pcode = scanner.nextLine()
                                print("Enter quantity: ")
                                val quantity = scanner.nextInt()
                                scanner.nextLine()

                                stuff.add(pcode to quantity)

                                val transaction = Tdata230603(tcode, ccode, scode, ecode, shcode, stuff)
                                buntdata230603.add(transaction)
                                println("Transaction added successfully!")

                                print("Wanna add more products? (Y/N): ")
                            } while (scanner.nextLine().equals("Y", ignoreCase = true))
                        }

                        3 -> {
                            scanner.nextLine()
                            print("Enter transaction code to edit: ")
                            val tcode = scanner.nextLine()
                            val transaction = buntdata230603.find { it.tcode == tcode }

                            if (transaction != null) {
                                print("Enter new customer code (or press Enter to keep current): ")
                                val ccode = scanner.nextLine()
                                if (ccode.isNotBlank()) transaction.ccode = ccode

                                print("Enter new supplier code (or press Enter to keep current): ")
                                val scode = scanner.nextLine()
                                if (scode.isNotBlank()) transaction.scode = scode

                                print("Enter new employee code (or press Enter to keep current): ")
                                val ecode = scanner.nextLine()
                                if (ecode.isNotBlank()) transaction.ecode = ecode

                                print("Enter new shipment code (or press Enter to keep current): ")
                                val shcode = scanner.nextLine()
                                if (shcode.isNotBlank()) transaction.shcode = shcode

                                val stuff = mutableListOf<Pair<String, Int>>()
                                do {
                                    print("Enter product code (or press Enter to stop): ")
                                    val pcode = scanner.nextLine()
                                    if (pcode.isBlank()) break
                                    print("Enter quantity: ")
                                    val quantity = scanner.nextInt()
                                    scanner.nextLine() // Consume newline

                                    stuff.add(pcode to quantity)

                                    print("Wanna add more products? (Y/N): ")
                                } while (scanner.nextLine().equals("Y", ignoreCase = true))

                                transaction.stuff = stuff
                                println("Transaction updated successfully!")
                            } else {
                                println("Transaction not found.")
                            }
                        }

                        4 -> {
                            scanner.nextLine()
                            print("Enter transaction code to delete: ")
                            val tcode = scanner.nextLine()
                            val transaction = buntdata230603.find { it.tcode == tcode }

                            if (transaction != null) {
                                buntdata230603.remove(transaction)
                                println("Transaction removed successfully!")
                            } else {
                                println("Transaction not found.")
                            }
                        }

                        5 -> {
                            scanner.nextLine()
                            println("Returning to Main Menu...")
                        }

                        else -> {
                            println("Enter the number listed, come on.")
                        }
                    }
                }

                3 -> {
                    var printmebby = true
                    while (printmebby) {
                        println("")
                        println("Report Menu")
                        println("===================")
                        println("1. Generate report based on Customer")
                        println("2. Generate entire report")
                        println("3. Generate invoice")
                        println("4. Generate Shipment Letter")
                        println("5. Back to Main Menu")
                        print("Enter choice: ")
                        when (scanner.nextInt()) {
                            1 -> {
                                print("Customer Code: ")
                                val ccode = scanner.nextLine().trim()
                                val ctrans = buntdata230603.filter{it.ccode == ccode}

                                if(ctrans.isEmpty()) {
                                    println("Who? What? Where? Code doesn't exist.")
                                } else {
                                    println("Sale Report based on Customer (code: $ccode)")
                                    println("===================")

                                    ctrans.forEach{Tdata230603 ->
                                        val customer = buncdata230603.find{it.getCCode() == Tdata230603.ccode}
                                        val employee = bunedata230603.find{it.getECode() == Tdata230603.ecode}
                                        val shipper = bunshdata230603.find{it.getShcode() == Tdata230603.shcode}

                                        println("Invoice: ${Tdata230603.tcode}")
                                        println("Name: ${customer?.getCName() ?: "null"}")
                                        println("Employee: ${employee?.getEName() ?: "null"}")
                                        println("Shipper: ${shipper?.getShname() ?: "null"}")

                                        println("Gadgets and Stuff: ")
                                        println("===================")

                                        var total = 0.0
                                        Tdata230603.stuff.forEach { (idkanym, amt) ->
                                            val product = bunpdata230603.find { it.pcode == idkanym }
                                            if (product != null) {
                                                val sum = product.price * amt
                                                total += sum

                                                println("Product Code: ${product.pcode}")
                                                println("Product Name: ${product.pname}")
                                                println("Amount: $amt")
                                                println("Price: ¥${product.price}/unit")
                                                println("Sum: ¥$sum")
                                                println("===================")
                                            } else {
                                                println("Product Code: $idkanym not found.")
                                            }
                                        }
                                        println("Total Amount: ¥$total")
                                        println("===================")
                                    }
                                }
                            }

                            2 -> {
                                //i don't understand what this is, so I'm just gonna generate entire report
                                println("Report")
                                println("===================")

                                println("Customers:")
                                buncdata230603.forEach { it.displayCDetails() }
                                println("===================")

                                println("Suppliers:")
                                bunsdata230603.forEach { it.displaySDetails() }
                                println("===================")

                                println("Employees:")
                                bunedata230603.forEach { it.displayEDetails() }
                                println("===================")

                                println("Products:")
                                bunpdata230603.forEach { it.displayPDetails() }
                                println("===================")

                                println("Shipments:")
                                bunshdata230603.forEach { it.displayShDetails() }
                                println("===================")

                                println("Transactions:")
                                buntdata230603.forEach { it.displayTDetails() }
                                println("===================")
                            }

                            3 -> {
                                print("Enter Transaction Code: ")
                                val tcode = scanner.next().trim()
                                val transaction = buntdata230603.find { it.tcode == tcode }

                                if (transaction == null) {
                                    println("Transaction not found.")
                                } else {
                                    println("Invoice: ${transaction.tcode}")
                                    val customer = buncdata230603.find { it.getCCode() == transaction.ccode }
                                    val employee = bunedata230603.find { it.getECode() == transaction.ecode }
                                    val shipper = bunshdata230603.find { it.getShcode() == transaction.shcode }

                                    println("Customer Name: ${customer?.getCName() ?: "null"}")
                                    println("Employee Name: ${employee?.getEName() ?: "null"}")
                                    println("Shipper Name: ${shipper?.getShname() ?: "null"}")

                                    println("Gadgets and Stuff: ")
                                    println("===================")

                                    var total = 0.0
                                    transaction.stuff.forEach { (idkanym, amt) ->
                                        val product = bunpdata230603.find { it.pcode == idkanym }
                                        if (product != null) {
                                            val sum = product.price * amt
                                            total += sum

                                            println("Product Code: ${product.pcode}")
                                            println("Product Name: ${product.pname}")
                                            println("Amount: $amt")
                                            println("Price: ¥${product.price}/unit")
                                            println("Sum: ¥$sum")
                                            println("===================")
                                        } else {
                                            println("Product Code: $idkanym not found.")
                                        }
                                    }
                                    println("Total Amount: ¥$total")
                                    println("===================")
                                }
                            }

                            4 -> {
                                print("Enter Shipment Code: ")
                                val shcode = scanner.next().trim()
                                val shipment = bunshdata230603.find { it.getShcode() == shcode }

                                if (shipment == null) {
                                    println("Shipment not found.")
                                } else {
                                    println("Shipment Letter")
                                    println("===================")
                                    println("Shipment Code: ${shipment.getShcode()}")
                                    println("Shipper: ${shipment.getShname()}")
                                    println("Note: ${shipment.getShnote()}")
                                    println("===================")
                                }
                            }

                            5 -> {
                                scanner.nextLine()
                                println("Returning to Main Menu...")
                            }

                            else -> {
                                println("Enter the number listed, come on.")
                            }
                        }
                    }
                }


                4 -> {
                    iminurhouse230603 = null
                    println("Bye bye!")
                }

                else -> {
                    println("Enter the number listed, come on.")
                }
            }
        }
    }
}

