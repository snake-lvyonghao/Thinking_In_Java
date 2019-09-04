package Chapter10_innerClass;
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    private Implementation1(){};

    @Override
    public void method1() {
        System.out.println("Imlp1 method1");
    }

    @Override
    public void method2() {
        System.out.print("Impl method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation1();
                }
            };
}

class Implementation2 implements Service{
    private Implementation2(){};

    @Override
    public void method1() {
        System.out.println("Imlp2 method1");
    }

    @Override
    public void method2() {
        System.out.print("Imp2 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation2();
                }
            };
}

public class Factor {
    public static void serviceConsunmer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args){
        serviceConsunmer(Implementation1.factory);
        serviceConsunmer(Implementation2.factory);
    }
}
