package lthdt;

/**
 * Created by Windows 7 on 10/28/2016.
 */
public class main {
    //contractor
//    public static void main1(String[] args) {
//        person personone = new person("thanh", 15, 60);
//        personone.showinfo();
//
//    }

    //getter and setter
    public static void main(String[] args) {
        person personone = new person();
        personone.setTen("thanh");
        personone.setTuoi(20);
        personone.setCannang(60);
        System.out.println("ten :" + personone.getTen());
        System.out.println("tuoi:" + personone.getTuoi());
        System.out.println("cannang" + personone.getCannang());
    }
}
    class person {
        public String ten;
        public int tuoi;
        public float cannang;
        //contractor
//
//    public person (String vten,int  vtuoi, float vcanang ){
//        this.ten = vten;
//        this.tuoi= vtuoi;
//        this.cannang = vcanang;}
//      tostring
        public String toString ()
        {
            return ten + ": "+ cannang+": "  + tuoi;
        }


        // setter ànd geter

        public String getTen() {
            return ten;}

        public void setTen(String vten ) {
            this.ten = vten ;
        }

        public float getCannang() {
            return cannang;
        }

        public void setCannang(float vcannang) {
            this.cannang = vcannang;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int vtuoi) {
            this.tuoi = vtuoi;
        }
        //showinfo
        public void showinfo() {
            System.out.println("ten \t\t" + this.getTen());
            System.out.println("tuoi\t" + this.getTuoi());
            System.out.println("cannang\t" + this.cannang);


    }

}
