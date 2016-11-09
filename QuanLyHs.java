package qlsinhvien;

        import com.sun.org.apache.xpath.internal.SourceTree;

        import java.util.ArrayList;
        import java.util.Scanner;

/**
 * Created by Windows 7 on 11/7/2016.
 */
public class QuanLyHs {
    static ArrayList<Student> ds;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ds = input();
        print(ds);
        for (int i = 1; i > 2;i++) {
            System.out.println("Chọn thao tác: ");
            System.out.println("1. Xóa học sinh");
            System.out.println("2. Thêm học sinh");
            System.out.println("3. Sửa  học sinh");
            if( (i+1)==1){ Delete(ds);
                 System.out.println("-Danh sach hoc sinh con lai:");
                   print(ds);}
                   if((i+1)==2){Add(ds);
                       System.out.println("-Danh hoc sinh con lai :");
                       print(ds);}
                       if((i+1)==3){edit(ds);
                           System.out.println("-Danh sach hoc sinh con lai:");
                           print(ds);
                       }


       }


    }


    public static ArrayList<Student> input() {
        ArrayList<Student> DsStudent=new ArrayList<>();
        Scanner Scanner= new Scanner(System.in);
        System.out.print("moi nhap so hoc sih:");
        int n= Scanner.nextInt();
        for(int i=0;i<n;i++){
            Student s=new Student();
            System.out.print("moi nhap ten hoc sinh thu" +(i+1)+":");
            Scanner.nextLine();
            String nhapname= Scanner.nextLine();
            System.out.print("moi nhap tuoi hoc sinh thu"+(i+1)+":");
            int nhapage= Scanner.nextInt();
            s.setName(nhapname);
            s.setAge(nhapage);
            DsStudent.add(s);
        }
        return DsStudent;
    }

    public static void Add(ArrayList<Student> ds){
        Scanner Scanner= new Scanner(System.in);
        Student s=new Student();
        System.out.println("moi nhap ten can them:");
        String st=Scanner.nextLine();
        System.out.println("moi nhap tuoi can them:");
        int  in=Scanner.nextInt();
        s.setName(st);
        s.setAge(in);
        ds.add(s);
    }
    public static void Delete(ArrayList<Student> ds){
        Scanner Scanner= new Scanner(System.in);
        System.out.println("moi nhap vi tri hoc sinh can xoa:");
        int in=Scanner.nextInt();
        for(int i=0;i<ds.size();i++)
            if(in==(i+1)){
                System.out.println("hoc sinh thu:"+(i+1));
                System.out.println("-ten :"+ds.get(i).getName()+"-tuoi:"+ds.get(i).getAge());
                ds.remove(i);
            }

    }
    public static void edit(ArrayList<Student> ds){
        Scanner Scanner=new Scanner(System.in);
        Delete(ds);
        Student s=new Student();
        System.out.println("moi nhap thong ten hoc sinh can them:");
        String St=Scanner.nextLine();
        System.out.println("moi nhap tuoi hoc sinh can them:");
        int in=Scanner.nextInt();
        s.setName(St);
        s.setAge(in);
        ds.add(s);

    }
    public static void print(ArrayList<Student> ds){
        for(int i=0;i<ds.size();i++){
            System.out.println("hoc sinh thu"+(i+1));
            System.out.println("-ten :"+ds.get(i).getName()+"-tuoi:"+ds.get(i).getAge());

        }
    }

}
