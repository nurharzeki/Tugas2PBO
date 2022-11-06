public class Dosen extends Elemen{
    private int jumlahHariKerja;

    //constructor
    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        this.jumlahHariKerja=jumlahHariKerja;
        
    }

    public int getJamSibuk(){
        return jumlahHariKerja*8;
    }

    public void showJamSibuk(){
        System.out.println(super.getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

}
