public class Siswa {
    String name;
    String nim;
    String alamat;

    void print(){
        System.out.println("Nama :" + name + ",Nim :" + nim + ", Alamat:" + alamat);
    }

    void save(){

    }


    public static void main(String[] args){
        Siswa gempar = new Siswa();
        gempar.name = "Gempar";
        gempar.nim = "1321312";
        gempar.alamat = "Nusa tenggara";
        gempar.print();

        
        //System.out.println("hello java");
    }
}