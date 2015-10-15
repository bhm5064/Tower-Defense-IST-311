/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDPlay;


public class HighScores {
    private int[] scores;
    private String[] names;
    private int SCORES = 10;
    private int temp = 0;
    private int place;
    private String tempName;

    public void add(String name, int score)
    {
            for (int i = 0; i < SCORES; i++)
            {
                    if (scores[i] < score)
                    {
                            place = i;
                            while (i < SCORES-1)
                            {
                                  temp = scores[i+1];
                                  tempName = names[i+1];
                                  scores[i+1] = scores[i];
                                  names[i+1] = names[i];
                                  i++;
                            }
                            scores[place] = score;
                            names[place] = name;
                    }
            }
    }
}
