public class Mahasiswa extends Elemen{
    
    private int sks;

    public Mahasiswa(String nama, int sks) {
        super(nama);
        this.sks=sks;
        
    }
    
    public int getJamSibuk(){
        return sks*3;
    }

    public void showJamSibuk(){
        System.out.println(super.getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }
}
