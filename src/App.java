public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n");

        int total=0;

        Asdos asdos1 = new Asdos("Fairuzikun",23,4); asdos1.showJamSibuk(); total+=asdos1.getJamSibuk();
        Dosen dosen1 = new Dosen("Raja OP Damanik", 5); dosen1.showJamSibuk(); total+=dosen1.getJamSibuk();
        Asdos asdos2 = new Asdos("Angel-chan", 20, 4); asdos2.showJamSibuk(); total+=asdos2.getJamSibuk();
        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 20); mahasiswa1.showJamSibuk(); total+=mahasiswa1.getJamSibuk();
        Mahasiswa mahasiswa2 = new Mahasiswa("Nid to Pass This Sem", 23); mahasiswa2.showJamSibuk(); total+=mahasiswa2.getJamSibuk();
        Dosen dosen2 = new Dosen("Nivotko", 3); dosen2.showJamSibuk(); total+=dosen2.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah "+total+"\n\n");

    }
}
