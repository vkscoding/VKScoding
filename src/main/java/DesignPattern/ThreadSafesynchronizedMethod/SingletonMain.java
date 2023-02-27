package DesignPattern.ThreadSafesynchronizedMethod;

public class SingletonMain {

    public static void main(String[] args)
    {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        System.out.println(" firstInstance hashCode : " + firstInstance.hashCode());
        System.out.println(" SecondInstance hashCode : " + secondInstance.hashCode());
    }
}



































