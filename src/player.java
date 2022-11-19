public class Player {
    String playerName;
    int lifePoints = 10;
    int correctQuestions = 0;

    public Player(String name) {
        playerName = name;
        lifePoints = 10;
    }

    public String getPlayerName() {
        return this.playerName;
    }
 
    public int getLifePoints(){
        return this.lifePoints;
    }

    public int getCorrectQuestions(){
        return this.correctQuestions;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setCorrectQuestions(int correctQuestions) {
        this.correctQuestions = correctQuestions;
    }

}
