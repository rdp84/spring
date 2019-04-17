package rdp.learning.spring;

import java.text.NumberFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rdp.learning.spring.entities.*;

public class RunDemo {

    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        NumberFormat numberFormat = context.getBean("nf", NumberFormat.class);
        double amount = 12345678.9012345;
        System.out.println(numberFormat.format(amount));

        /*
        Team royals = context.getBean("royals", Team.class);

        Game game1 = context.getBean("game", Game.class);
        System.out.println(game1);

        Game game2 = context.getBean("game", Game.class);
        game2.setAwayTeam(royals);
        System.out.println(game2);

        System.out.println(game1);

        */

        for (var bean : context.getBeanDefinitionNames()) {
            System.out.println("Bean name: " + bean);
        }
    }
}
