package DesignPattern.StaticBlock;

public class SingletonStaticBlockInitialization {
    public static SingletonStaticBlockInitialization instance;

    private SingletonStaticBlockInitialization()
    {
        // private constructor
    }
    static
    {
        // static block to initialize instance
        instance = new SingletonStaticBlockInitialization();
    }
}





//    Very simple to implement.
//    No need to implement getInstance() method. Instance can be accessed directly.
//    May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//    CPU time is also wasted in creation of instance if it is not required.