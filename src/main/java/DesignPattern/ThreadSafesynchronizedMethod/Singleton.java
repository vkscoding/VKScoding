package DesignPattern.ThreadSafesynchronizedMethod;

public class Singleton {
    private static Singleton instance;
    private Singleton()
    {
        // private constructor
    }
    //synchronized method to control simultaneous access
    synchronized public static Singleton getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Singleton();
        }
        return instance;
    }
}



//    Lazy initialization is possible.
//    It is thread safe.
//    getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.