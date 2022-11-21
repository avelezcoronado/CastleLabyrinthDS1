public class Player {
    String playerName;
    int lifePoints = 7;
    int correctQuestions = 0;
    int counter = 0;

    public Player(String name) {
        playerName = name;
        lifePoints = 7;
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

    public int getCounter(){
        return this.counter;
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

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
