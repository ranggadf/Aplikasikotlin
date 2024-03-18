package com.example.aplikasikotlin

  fun main(args: Array<String>) {
      Biodata(nama = "Rangga Dhiya Febrian")
      Hobi()
  }
fun Biodata(
    nama:String,
    Alamat: String = "Jl.Sultan  Trenggono no 23 Kota Madiun",
    TTL: String = " Kota Madiun, 8 Februari 2005",
    Kelas:String = "2A",
    NIM: String ="233307024",
    Prodi:String ="Teknologi Informasi",) {
    println("===========================")
    println("=====BIODATA DAN HOBI MAHASISWA=====")
    println("===========================")
    println("Nama\t:$nama")
    println("Alamat\t:$Alamat")
    println("Ttl\t:$TTL")
    println("NIM\t:$NIM")
    println("Prodi\t:$Prodi")
    println("Kelas\t:$Kelas")

}

fun Hobi(Hobi:String = "Membaca",desc:String = "Saya senang membaca untuk mengisi waktu luang dan menambah wawasan") {
    println("Hobi\t:$Hobi")
    println("Desc\t:$desc")
}