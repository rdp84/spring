package rdp.learning.spring.entities;

public class BaseballGame implements Game {

    private Team homeTeam, awayTeam;

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
    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }
}
