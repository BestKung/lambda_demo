package main.java;

public class main {

    public static void main(String[] args) {



        LambInterface str = new LambInterface() {
            @Override
            public String lanbTest(String name) {
                return "hi "+name;
            }
        };


        LambInterface str2 = name ->"hi "+name;

        System.out.println(str.lanbTest("best"));


    }

}
