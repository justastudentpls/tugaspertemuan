import java.util.Scanner

class Animal {
    private var namabinatang_230060003: String = ""
    private var jumlahkaki_230060003 : Int = 0
    private var tinggibinatang_230060003: Int = 0
    private var jenisbinatang_230060003: String = ""

    constructor(namabinatang_230060003: String, jumlahkaki_230060003: Int, tinggibinatang_230060003: Int, jenisbinatang_230060003: String) {
        this.namabinatang_230060003 = namabinatang_230060003
        this.jumlahkaki_230060003 = jumlahkaki_230060003
        this.tinggibinatang_230060003 = tinggibinatang_230060003
        this.jenisbinatang_230060003 = jenisbinatang_230060003
    }

    fun getNamaBinatang_230060003() : String {
        return namabinatang_230060003
    }
    fun getJumlahKaki_230060003() : Int {
        return jumlahkaki_230060003
    }
    fun getTinggiBinatang_230060003() : Int {
        return tinggibinatang_230060003
    }
    fun getJenisBinatang_230060003() : String {
        return jenisbinatang_230060003
    }

    fun setNamaBinatang_230060003(namabinatang_230060003: String) {
        this.namabinatang_230060003 = namabinatang_230060003
    }
    fun setJumlahKaki_230060003(jumlahkaki_230060012: Int) {
        this.jumlahkaki_230060003 = jumlahkaki_230060003
    }
    fun setTinggiBinatang_230060003(tinggibinatang_230060003: Int) {
        this.tinggibinatang_230060003 = tinggibinatang_230060003
    }
    fun setJenisBinatang_230060003(jenisbinatang_230060003: String) {
        this.jenisbinatang_230060003 = jenisbinatang_230060003
    }

    fun displayDetails() {
        println("Nama Binatang: $namabinatang_230060003")
        println("Jumlah Kaki: $jumlahkaki_230060003")
        println("Tinggi Binatang: $tinggibinatang_230060003")
        println("Jenis Binatang: $jenisbinatang_230060003")
    }
}

fun main () {
    val scanner = Scanner(System.`in`)
    val animals = mutableListOf<Animal>()

    loop@ while (true) {
        println("\nMenu:")
        println("1. Input Data Binatang")
        println("2. Tampilkan Data Binatang")
        println("3. Hapus Data Binatang")
        println("0. Exit")
        println("Enter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()

                print("Input Nama Binatang: ")
                val namabinatang_230060003 = scanner.nextLine()

                print("Input Jumlah Kaki Binatang: ")
                val jumlahkaki_230060003 = scanner.nextInt()
                scanner.nextLine()

                print("Input Tinggi Binatang (in cm): ")
                val tinggibinatang_230060003 = scanner.nextInt()
                scanner.nextLine()

                print("Input Jenis Binatang: ")
                val jenisbinatang_230060003 = scanner.nextLine()


                val animal = Animal(namabinatang_230060003, jumlahkaki_230060003, tinggibinatang_230060003, jenisbinatang_230060003)
                animals.add(animal)
                println("Data Binatang Telah Ditambah")
            }

            2 -> {
                if (animals.isEmpty()) {
                    println("Tidak Ada Data Binatang Tersedia")
                } else {
                    println("\nAnimals Details")
                    for (animal in animals) {
                        animal.displayDetails()
                        println()
                    }
                }
            }
            3 -> {
                if (animals.isEmpty()) {
                    println("Tidak ada data binatang untuk dihapus.")
                } else {
                    print("Ketik Nomor Data Binatang yang mau dihapus: ")
                    val index = scanner.nextInt()
                    scanner.nextLine()
                    if (index in 1..animals.size) {
                        animals.removeAt(index - 1)
                        println("Data Binatang telah dihapus.")
                    } else {
                        println("Nomor tidak ada di Data.")
                    }
                }
            }

            0 -> {
                println("Exiting the program.")
                break
            }
            else -> {
                println("Invalid choice. Please try again.")
            }
        }
    }
}