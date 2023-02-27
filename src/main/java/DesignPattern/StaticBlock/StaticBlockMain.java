package DesignPattern.StaticBlock;

public class StaticBlockMain {

    public static void main(String[] args)
    {
        SingletonStaticBlockInitialization firstInstance = SingletonStaticBlockInitialization.instance;
        SingletonStaticBlockInitialization secondInstance = SingletonStaticBlockInitialization.instance;
        System.out.println(" firstInstance hashCode : " + firstInstance.hashCode());
        System.out.println(" SecondInstance hashCode : " + secondInstance.hashCode());
    }
}
