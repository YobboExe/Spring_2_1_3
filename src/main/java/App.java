import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanWorld1.getMessage());

        HelloWorld beanWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Равны ли объекты beanWorld: " + (beanWorld1 == beanWorld2));

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat1 = applicationContext1.getBean("cat", Cat.class);
        System.out.println(beanCat1.sayMeow());

        Cat beanCat2 = applicationContext1.getBean("cat", Cat.class);
        System.out.println("Равны ли объекты bean: " + (beanCat1==beanCat2));



    }
}