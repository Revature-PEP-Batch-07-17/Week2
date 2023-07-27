# Errors and Exceptions

## Errors vs Exceptions
Errors:
- refer to SERIOUS/fatal problems in the code that should not be handled.
- OutOfMemoryError
- Syntax Error

Exceptions:
- events that occur that disrupt the flow of a program
- Two types:
    * Checked (Compile-Time):
        - MUST be handled/declared
        - IOException, FileNotFoundException, ResourceNotFound
    * UnChecked (Run-Time):
        - Doesn't have to be handled (but can)
        - ArrayOutOfBoundsException, ArithmeticException, NullPointerException

<img src= "..\Day3\Resources\Throwable.PNG"  width="60%" height="50%">


## How to handle/declare Exceptions
- Try-Catch-Finally (handle the exception)
    - put risky code in the try block
    - "catch" the exception in the catch block (If there is more than one catch, they must go from most specific to least specific)
    - the finally block will ALWAYS happen

    ```
    try {
        insert code that has a potential to throw an exception
    } catch (NullPointerException e) {
        put desired code here
    } catch (Exception e) {
        put desired code here
    } finally {
        put desired code here
    }
    
    ```

- Throws and Throw (declare the exception)
    * Throws: Goes in the Method Signature; allows Java to be aware that the method could throw an exception
    * Throw: Goes in the Method Body; physically throw the exception object

    ```
    void method() throws Exception {
        throw new Exception("Message can go here");
    }
    ```


