/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDPlay;

/**
 *
 * @author rxr5190
 */
class Player 
{
    public String name;

    public int stage = 1;
    public int money = 30;
    public int score = 0;
    public int health = 100;

    public void incrementStage(int prevStage) {
            stage = prevStage+1;
    }

    public void increaseMoney() {
            money = money+1;
    }
    public void decreaseMoney() {
            money = money-1;
    }

    public void increaseScore() {
            score = score+1;
    }
    public void decreaseScore() {
            score = score-1;
    }

    public void decreaseHealth() {
            health = health-1;
    }
}
