import java.util.Arrays;

class StudentInfo {
    String name;
    int age;

    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Student {
    public static void main(String[] args) {
        StudentInfo[] students = new StudentInfo[10];
        students[0] = new StudentInfo("Hari", 16);
        students[1] = new StudentInfo("Geeta", 18);
        students[2] = new StudentInfo("Priya", 19);
        students[3] = new StudentInfo("Manu", 15);
        students[4] = new StudentInfo("Bhavya", 20);
        students[5] = new StudentInfo("Teja", 21);
        students[6] = new StudentInfo("Divya", 15);
        students[7] = new StudentInfo("Kavya", 17);
        students[8] = new StudentInfo("Sony", 18);
        students[9] = new StudentInfo("Venu", 22);
        Arrays.sort(students, (s1, s2) -> s1.age - s2.age);
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        Arrays.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }
    }
}


