package tiketapp;

// Subclass - TiketKereta
class TiketKereta extends Tiket {
    private String nomorKereta;

    public TiketKereta(String namaPenumpang, int hargaTiket, String nomorKereta) {
        super(namaPenumpang, hargaTiket);
        this.nomorKereta = nomorKereta;
    }

    public String getNomorKereta() {
        return nomorKereta;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Nomor Kereta: " + nomorKereta);
    }
}
