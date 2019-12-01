package day1130;

public class test03test {
    public static void main(String[] args) {
        test03 test03 = new test03();
        test03.name = "小明";
        //点不出来,因为是私有的
        test03.setAge(0);
        test03.Show();
    }
}
