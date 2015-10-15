/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDPlay;

import java.util.ArrayList;

/**
 *
 * @author rxr5190
 */
class Enemy
{
    public int diff = 2;
    public int resilience = 100;
    public int delay = 10;
    public int quantity = 10;
    public int x = 105;
    public int y = 0;
    boolean visible = true;
    int speed = 1;
    int path = 1;

    public int getHealth()
    {
            return resilience;
    }

    public void decreaseResilience(int damage)
    {
            resilience = resilience - damage;
    }

    public void increaseQuantity(int num)
    {
            quantity = quantity + num;
    }
    public void setInvisible()
    {
            visible = false;
    }
    public void increaseX () {
            x = x + speed + diff;
    }
    public void increaseY () {
            y = y + speed + diff;
    }
    public void decreaseX () {
            x = x - speed + diff;
    }
    public void decreaseY () {
            y = y - speed + diff;
    }

    public void path (int p) {
            path = p;
    }

    public void createArray() {
            ArrayList<Enemy> enemies = new ArrayList<Enemy>();
            for (int i = 1; i <= quantity; i++) {
                    Enemy enem = new Enemy();
                    enemies.add(enem);
            }
    }

    public void delete(int i, Enemy enem) {
            enemies.remove[i];
    }
}
