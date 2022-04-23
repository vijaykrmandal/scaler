package Java8;


interface iter {
    default void m1() {
        System.out.println("iter m1");
    }
}

class inherit implements iter {
     public void m1() {
        System.out.println("inherit m1");
    }
}

public class TestSAM {
    public static void main(String[] args) {
        inherit obj = new inherit();
        
            obj.m1();
    }
}
