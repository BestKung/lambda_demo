package main.java;

public class main {

    public static void main(String[] args) {

        //ใช้แบบธรรมดา
        LambInterface str = new LambInterface() {
            @Override
            public String lanbTest(String name, String other) {
                return "hi " + name + " " + other;
            }
        };

        //lambda
        LambInterface str2 = (name, other) -> "hi " + name + " " + other;

        System.out.println(str.lanbTest("best", "เอง"));
    }

}
