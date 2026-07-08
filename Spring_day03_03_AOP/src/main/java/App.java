import com.itheima.config.SpringConfig;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //AnnotationConfigApplicationContext这是基于注解开发的方式
        //ClassPathXmlApplicationContext这是基于.xml的开发方式
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) ctx.getBean("userService");
        int ret = userService.save(666);
        System.out.println("app..."+ret);
    }
}
