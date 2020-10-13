package com;


public class BasketballGame {

    /*
  Count what is the minimum amount of shots you need to score to reach exact
  number of points which will be provided as goal
(you can not exceed the goal).
Assume no one playing defense so you will not have any free throws.
  */

    public static void main(String[] args) {

        System.out.println(amountOfShots(13));
        System.out.println(amountOfShots(2));

    }
    public static int amountOfShots(int goal){

        if(goal%3==0){
            return goal/3;
        }else {
            int temp =goal;

            while (temp%3!=0){
                temp-=2;
            }
            return ((goal-temp)/2)+(temp/3);
        }
    }
}