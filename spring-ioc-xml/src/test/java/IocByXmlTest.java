import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocByXmlTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentOne =(Student) applicationContext.getBean("studentOne");
        System.out.println(studentOne);
    }
}
