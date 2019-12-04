package day1203;


class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        student.setAge(18);
        student.setMale(true);
        System.out.println(student.getName() + student.getAge() + student.isMale());
    }
}