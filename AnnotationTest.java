import annotations.OneAnnotation;

import java.lang.reflect.Method;

/**
 * @author zhang
 */
public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {
        // 获取类的方法
        Method method = WithAnnotationClass.class.getMethod("myMethod");

        // 检查方法是否有 @MyAnnotation 注解
        if (method.isAnnotationPresent(OneAnnotation.class)) {
            OneAnnotation annotation = method.getAnnotation(OneAnnotation.class);
            System.out.println("Value: " + annotation.value());
            System.out.println("Count: " + annotation.count());
        }
    }
}
