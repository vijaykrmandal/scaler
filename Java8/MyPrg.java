package Java8;

public class MyPrg {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }
    public void lamdaExp(){
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
    //Accessing final local variable
    public void lambdaAcess(){
        final Integer num=6;
        Converter<Integer,String> stringConverter=(from)->String.valueOf(from+num);
        String s=stringConverter.convert(2); 
        System.out.println(s);
    }
    public static void main(String[] args) {

        // Converter<String,Integer> converter=(from)->Integer.valueOf(from);
        // Static method reference
        

        MyPrg obj=new MyPrg();
        obj.lamdaExp();
        obj.lambdaAcess();
        
    }
}
