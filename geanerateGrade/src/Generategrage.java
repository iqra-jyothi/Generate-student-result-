import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Studentdetails{
    private  String name;
    private   int roll;
    private  int total;
    private   double average;
    private  char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getTotal() {
        return total;
    }

    public  void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public  void setAverage(double average) {
        this.average = average;
    }

    public  char getGrade() {
        return grade;
    }

    public  void setGrade(char grade) {this.grade = grade;
    }

    @Override
    public String toString() {
        return "Studentdetails{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", total=" + total +
                ", average=" + average +
                ", grade=" + grade +
                '}';
    }
}
public class Generategrage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        Studentdetails s = new Studentdetails();
        ArrayList<Studentdetails> sd = new ArrayList<>();
        String name;
        int rol;
        while (true) {
            System.out.println("the the details to generate result");
            System.out.println("enter the name");
            name = sc.next();
            System.out.println("enter the roll number");
            rol = sc.nextInt();
            System.out.println("enter the marks");

            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
            //catculate total
            int sum = 0;
            for (int a : marks) {
                sum += a;
            }
            double average = sum / 3;
            //catculate grade;
            if (average >= 90) {
                s.setGrade('A');
            } else if (average >= 75) {
                s.setGrade('B');
            } else if (average >= 50) {
                s.setGrade('c');
            } else {
                s.setGrade('F');
            }

            s.setName(name);
            s.setRoll(rol);
            s.setAverage(average);
            s.setTotal(sum);
            sd.add(s);
            System.out.println("do u want to add more student y/n");
            if (sc.next().charAt(0) == 'n') {
                break;
            }
        }

        while(true) {
        System.out.println("generate result based on student roll number");
        int find = sc.nextInt();

        for (Studentdetails ss : sd) {
            if (ss.getRoll() == find) {
//        ss.toString();
                System.out.println("the roll number" + ss.getRoll() + "the student name is " + ss.getName() + " the total marks is " + ss.getTotal() + " the average is " + ss.getAverage() + " the total grade is" + ss.getGrade());
            } else {
                System.out.println("student not found");
            }
        }
        System.out.println("do u want to check other result y/n");
        if (sc.next().charAt(0) == 'n') {
            break;
        }

    }
    }
}