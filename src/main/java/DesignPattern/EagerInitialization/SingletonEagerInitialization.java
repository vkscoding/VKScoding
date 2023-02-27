package DesignPattern.EagerInitialization;

public class SingletonEagerInitialization {
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization()
    {
        // private constructor
    }
    public static SingletonEagerInitialization getInstance(){
        return instance;
    }
}


//      Very simple to implement.
//      May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//      CPU time is also wasted in creation of instance if it is not required.
