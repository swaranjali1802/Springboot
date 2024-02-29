package dp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] arg)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Player p1=context.getBean("player",Player.class);
		p1.getMyTeam();
	}

}
