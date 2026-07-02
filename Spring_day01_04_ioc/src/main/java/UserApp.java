import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserApp {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)ctx.getBean("userService");

        userService.save();


        DruidDataSource dataSouce = (DruidDataSource)ctx.getBean("dataSouce");
        System.out.println(dataSouce);


    }
}
