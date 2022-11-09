import javax.swing.JOptionPane;



public class doors extends player{
    String defaultMessage = "You Found A ";
    String[] monsterDoorOptions = {"Attack","Run to next door"};
    String[] monsters = {"Medusa","Which","Werewolf","Vampire","Fish Man","Pack Of Skeletons","Giant","Centaur","Zombie","Golem","Gargoyle","Giant Snake","Troll","Ogre","Hydra","Siren","Abominable Snowman"};
    int[] damage = {1,1,2,1,1,2,2,2,2,1,2,2,1,1,2,2};

    String[] helperDoorOption = {"Thank helper and keep moving"};
    String[] helpers = {"Angel Francisco","Friendly Ghost","Elf","Pegasus","Unicorn","King","Phoenix","Death","Friendly Yeti"};
    int[] heal = {1,2,1,2,2,3,1,2,3};





    void newDoors() {
        int friendOrFoe = (int) (Math.random()*5);
        if (friendOrFoe > 1){
        int monsterChooser = (int) (Math.random()*15);
        int choice =JOptionPane.showOptionDialog(null, defaultMessage + monsters[monsterChooser], "Your Consequence", 0, JOptionPane.QUESTION_MESSAGE, null, monsterDoorOptions, "Attack");
        if (choice==0){
        int damageOrKill= (int) Math.random()*2;
        if (damageOrKill==0) {
            JOptionPane.showMessageDialog(null, "You fought the "+monsters[monsterChooser] + " and won, but took some damage");
            lifePoints -= damage[monsterChooser];
            System.out.println(lifePoints);
        } else if (damageOrKill==1){
            JOptionPane.showMessageDialog(null, "You got hit while running away from the "+monsters[monsterChooser]);
            lifePoints -= damage[monsterChooser] * 2;
            System.out.println(lifePoints);
        } else {
            JOptionPane.showMessageDialog(null, "You fought the"+monsters[monsterChooser] + "and won without taking damage");
            System.out.println(lifePoints);

        }
        }
        } else {
            int friendChooser = (int) (Math.random()*8);
        JOptionPane.showOptionDialog(null, defaultMessage + helpers[friendChooser], "Your Consequence", 0, JOptionPane.QUESTION_MESSAGE, null, helperDoorOption, "Thank helper and keep moving");
        lifePoints+= heal[friendChooser];
        }
    }




String[] doors = {"Puerta Derecha","Puerta Izquierda"};
    
    void chooseDoor(){
        JOptionPane.showOptionDialog(null, "Elige una puerta", "Elige tu camino...", 0, JOptionPane.QUESTION_MESSAGE, null, doors, "Left Door");
        newDoors();
    }
public static void main(String[] args) {
    doors test = new doors();
    test.chooseDoor();
}

}
