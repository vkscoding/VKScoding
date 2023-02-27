package DesignPattern.EagerInitialization;

public class SingletonEagerMain {

    public static void main(String[] args)
    {
        SingletonEagerInitialization firstInstance = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization secondInstance = SingletonEagerInitialization.getInstance();
        System.out.println(" firstInstance hashCode  : " + firstInstance.hashCode());
        System.out.println(" SecondInstance hashCode : " + secondInstance.hashCode());
    }
}
