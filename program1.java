import java.util.Scanner;

class Student {
    int usn;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        
        name = sc.nextLine();
        System.out.print("Enter USN: ");
        usn = sc.nextInt();
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.accept();
        s2.accept();
        
        s1.display();
        s2.display();
    }
}
