package rdp.learning.spring.entities;

import javax.sql.DataSource;

public interface Game {

    void setHomeTeam(Team team);
    Team getHomeTeam();
    void setAwayTeam(Team team);
    Team getAwayTeam();
    void setDataSource(DataSource dataSource);
    DataSource getDataSource();
    String playGame();
}
