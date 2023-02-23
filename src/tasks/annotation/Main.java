package tasks.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<DemoClass> demoClass = DemoClass.class;
        Method[] methods = demoClass.getDeclaredMethods();
        invokeMethods(methods);
    }

    public static void invokeMethods(Method [] methods) throws InvocationTargetException, IllegalAccessException {
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println("Calling method with name: " + method.getName());
                System.out.println("This method has got @MyAnnotation");
                boolean isPrivateMethod = false;
                if (!method.canAccess(null)) {
                    method.setAccessible(true);
                    isPrivateMethod = true;
                }
                int count = method.getAnnotation(MyAnnotation.class).count();
                System.out.println("Call method: " + method.getName() + " for " + count + " times");
                while (count-- > 0) {
                    if (method.getParameterCount() == 2) {
                        method.invoke(null, 1, 2);
                    } else {
                        method.invoke(null, 1, 2, 3);
                    }
                }
                if (!isPrivateMethod) {
                    method.setAccessible(false);
                }
                System.out.println("-----------------------------------");
            }
        }
    }
}
