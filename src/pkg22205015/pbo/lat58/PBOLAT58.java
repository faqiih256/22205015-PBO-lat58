
package pkg22205015.pbo.lat58;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Tambah Kurang

class Bilangan {

    protected int x;
    protected int y;
    
    public Bilangan(){
       this.x = 3;
       this.y = 4;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class JumlahBilangan extends Bilangan {
    
    public void tampilHasilJumlah(){
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX()+ " - " + getY() + " = " + (getX() - getY()));
    }
}

public class PBOLAT58 {
    public static void main(String[] args) {
        System.out.println("===LATIHAN 58===\n");
        //Membuat objek JumlahBilangan
        JumlahBilangan jm = new JumlahBilangan();
        jm.tampilHasilJumlah();
        
        //Membuat objek Selisih Bilangan
        SelisihBilangan sb = new SelisihBilangan();
        sb.tampilSelisih();
    }
    
}
