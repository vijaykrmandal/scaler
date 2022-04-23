package ExceptionHandling;

class MyException extends NullPointerException{
    public MyException(String str){
        super(str);
    }
}

class Main{

    public void testMethod(){
       // String str=null;
        try{
            throw new MyException("My Exception");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.testMethod();
    }
}