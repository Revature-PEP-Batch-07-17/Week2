package Week2.Day3.CodeEx;

public class Main {
    public static void main(String[] args){
        tryCatch();
        System.out.println("~~~~~~~~~~~~~~~~~");

        multiTry();
        System.out.println("~~~~~~~~~~~~~~~~~");

        tryFinally();
        System.out.println("~~~~~~~~~~~~~~~~~");
        
        throwsThrow();
        System.out.println("~~~~~~~~~~~~~~~~~");

    }

//Try-Catch
static void tryCatch() {
    int a = 3;
    int b = 0;
    try{
        System.out.println(a/b);
    } catch (ArithmeticException e){
        e.printStackTrace();
    }
}

//Multi try-catch
static void multiTry(){
    try{
        //creates an array that holds 3 elements
        int[] arr = new int[3];
        //tries to set the 5th ele to 10
        arr[5] = 10;
    } catch (ArithmeticException e){
        System.out.println("can't divide by 0");
    } catch (ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    } catch (Exception e){
        System.out.println("This will happen if an exception other than both above occurs");
    }
}

//try-catch-finally
static void tryFinally(){
    try{
        int[] arr = new int[3];
        arr[0] = 10;
    } catch(ArithmeticException e){
        e.toString();
    } finally {
        System.out.println("Finally will always happen");
    }
}

//throws and throw
static void throwsThrow() throws NullPointerException{
    throw new NullPointerException();
}

}