import annotations.OneAnnotation;

/**
 * @author zhang
 */
public class WithAnnotationClass {
    @OneAnnotation(value = "Custom Value", count = 5)
    public void myMethod(){
        System.out.println("执行此方法");
    }
}
