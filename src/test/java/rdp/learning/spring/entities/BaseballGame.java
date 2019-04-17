package rdp.learning.spring.entities;

import javax.sql.DataSource;

public class BaseballGame implements Game {

    private Team homeTeam, awayTeam;
    private DataSource dataSource;

    public BaseballGame() { }

    public BaseballGame(Team homeTeam, Team awayTeam) {

        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }

    @Override
    public String toString() {
        return "Game between " + awayTeam.getName() + " at " + homeTeam.getName();
    }
}
