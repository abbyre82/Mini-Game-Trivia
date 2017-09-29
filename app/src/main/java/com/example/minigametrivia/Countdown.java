package com.example.minigametrivia;


import android.widget.TextView;

/**
 * Created by Abby on 6/17/17.
 */

public class Countdown{
    static Thread thread = new Thread();
    private long timeRemaining;
    private boolean gameOver;
    public String timer;
    public Countdown(){
        gameOver = false;
        timer = "2:00";
        this.run();
    }
    public void run(){
            try{
        for(long c=120;c>=0;c--){
        while(!this.gameOver){
        thread.sleep(1000);
        if((c-60)<0){
            timer = "0:" + c;
        }
        else {
            long seconds = c - 60;
            timer = "1:" + seconds;
        }
        }
        this.timeRemaining = c;
        }
        if(this.timeRemaining>0){
            this.addPoints();
        }
        }
        catch(InterruptedException e){
            return;
        }
    }
    public void addPoints(){
    if(timeRemaining<= (30 * 1000)){
        //points += 500; //need to figure out points
    }
    else if(timeRemaining <= (60 * 1000)){
        //points += 250;
    }
    else if(timeRemaining <= (90 * 1000)){
        //points += 200;
    }
    else if(timeRemaining <= (105 * 1000)){
       // points += 150;
    }
    else(timeRemaining <= (120 * 1000)){
        //points += 100;
    }
    }
    public void gameOver(){
    gameOver = true;
    }
}
