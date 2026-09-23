import java.util.Scanner;
public class Top2_Student
 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Student[] std=new Student[5];
    for (int i = 0; i < 5; i++) {
        System.out.println("enter std name:");
        String name=sc.next();
        int[]marks=new int[6];
        System.out.println("enter marks of 6 sub:");
        for(int j=0;j<6;j++)
        {
            marks[j]=sc.nextInt();
        }
        std[i]=new Student(name,marks);
    }
}
}
class Student {
        String name;
        double percent;
        //String subject[]=new String[6];
        int marks[]=new int[6];

        Student(String name, int[]marks){
            this.name=name;
            this.marks=marks;
            int total=0;

            for(int i=0;i<6;i++){
                total=total+marks[i];
            }
            percent=(total/600.0)*100;
        }
}
//class Test {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter std age and roll no:");
//        int age = sc.nextInt();
//        int roll = sc.nextInt();
//        System.out.println("enter name:");
//        sc.nextLine();
//        String str=sc.nextLine();
//        System.out.println(age);
//        System.out.println(roll);
//        System.out.println(str);
//
//
//    }
//}
