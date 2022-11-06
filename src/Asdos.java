public class Asdos extends Mahasiswa{
    
    private int jamNgasDos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        this.jamNgasDos=jamNgasdos;
        
    }

    public int getJamSibuk(){
        return jamNgasDos+super.getJamSibuk();
    }

    public void showJamSibuk(){
        System.out.println(super.getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }

}
