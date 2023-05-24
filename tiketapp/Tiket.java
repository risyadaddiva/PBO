package tiketapp;

// Superclass - Tiket
class Tiket {
    //atribut
    private String namaPenumpang; 
    private int hargaTiket;

    public Tiket(String namaPenumpang, int hargaTiket) {
        this.namaPenumpang = namaPenumpang;
        this.hargaTiket = hargaTiket;
    }

    //enkapsulasi dengan method getter
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    //pembuatan method
    public void display() { 
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Harga Tiket: " + hargaTiket);
    }
}