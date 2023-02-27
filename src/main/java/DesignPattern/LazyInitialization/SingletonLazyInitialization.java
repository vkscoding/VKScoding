package DesignPattern.LazyInitialization;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization()
    {
        // private constructor
    }

    //method to return instance of class
    public static SingletonLazyInitialization getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}


//      Object is created only if it is needed. It may overcome wastage of resource and  CPU time.
//      In multithreaded environment, it may break singleton property.