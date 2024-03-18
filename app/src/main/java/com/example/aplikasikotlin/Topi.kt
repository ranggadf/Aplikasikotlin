package com.example.aplikasikotlin

class Topi( val nama: String, var warna: String, var ukuran: String) {
    fun update(warna: String, ukuran: String){
        this.warna = warna
        this.ukuran = ukuran
    }
}
fun main() {
    val Topi = Topi("Topi punk","hijau", "M")
    println("Nama: ${Topi.nama},\nWarna: ${Topi.warna},\nUkuran: ${Topi.ukuran}")

    Topi.update("merah","L")
    print("Topi setelah diupdate,\nNama: ${Topi.nama},\n" +
            "Warna: ${Topi.warna},\n" +
            "Ukuran: ${Topi.ukuran}")
}
