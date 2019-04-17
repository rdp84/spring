package rdp.learning.spring;

import rdp.learning.spring.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "rdp.learning.spring")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    // @Autowired @Qualifier("rs")
    @Resource
    private Team redSox;

    // @Autowired @Qualifier("cubs")
    @Resource
    private Team cubs;

    @Bean
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(redSox, cubs);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }
}
