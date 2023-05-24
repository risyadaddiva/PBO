package tiketapp;

// Subclass - TiketPesawat
class TiketPesawat extends Tiket {
    private String nomorPenerbangan;

    public TiketPesawat(String namaPenumpang, int hargaTiket, String nomorPenerbangan) {
        super(namaPenumpang, hargaTiket);
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
    }
}