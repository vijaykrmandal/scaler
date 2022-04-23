package PracticeCodes;


    class A{
        A(){
            System.out.println("A- constructor");
        }
        void funA(int i){
            System.out.println(" A + "+i);
        }
    }
    class B extends A{
        B(){
            System.out.println("B- constructor");
        }
        void funA(int i){
            System.out.println(" B + "+i);
        }
    }
    public class Overriding {
    public static void main(String[] args) {       
        A b = new B();
        b.funA(5);
    }
}
