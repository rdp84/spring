package rdp.learning.spring;

import rdp.learning.spring.entities.Game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class RunDemo {

    public static void main(String[] args) {

        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());

        for (var bean : context.getBeanDefinitionNames()) {
            System.out.println("Bean name: " + bean);
        }
    }
}
