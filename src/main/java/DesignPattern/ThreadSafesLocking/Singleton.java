package DesignPattern.ThreadSafesLocking;

public class Singleton {
    private static Singleton instance;
    private Singleton()
    {
        // private constructor
    }
    //synchronized method to control simultaneous access
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }
}



//    Lazy initialization is possible.
//     It is thread safe.
//     Performance overhead gets reduced because of synchronized keyword.
