package Utilities;

public class MyMethods {
    public static void myWait(int second){

        try {
            Thread.sleep(  second* 1000 );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }




    }





