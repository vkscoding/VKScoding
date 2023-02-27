package DesignPattern.LazyInitialization;

public class SingletonLazyMain {

    public static void main(String[] args)
    {
        SingletonLazyInitialization firstInstance = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization secondInstance = SingletonLazyInitialization.getInstance();
        System.out.println(" firstInstance hashCode : " + firstInstance.hashCode());
        System.out.println(" SecondInstance hashCode : " + secondInstance.hashCode());
    }
}