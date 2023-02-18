package tasks.annotation;
public class DemoClass {

    @MyAnnotation(count = 1)
    public static void method1(int a, int b) {
        System.out.println("Parameters: a=" + a + " ,b=" + b);
    }

    @MyAnnotation
    public static void method2(int a, int b, int c) {
        System.out.println("Parameters: a=" + a + " ,b=" + b + ",c=" + c);
    }

    @MyAnnotation(count = 3)
    protected static void method3(int a, int b, int c) {
        System.out.println("Parameters: a=" + a + " ,b=" + b + ",c=" + c);
    }

    @MyAnnotation(count = 4)
    protected static void method4(int a, int b) {
        System.out.println("Parameters: a=" + a + " ,b=" + b);
    }

    @MyAnnotation(count = 2)
    private static void method5(int a, int b, int c) {
        System.out.println("Parameters: a=" + a + " ,b=" + b + ",c=" + c);
    }
    @MyAnnotation(count = 1)
    private static void method6(int a, int b) {
        System.out.println("Parameters: a=" + a + " ,b=" + b);
    }
}
