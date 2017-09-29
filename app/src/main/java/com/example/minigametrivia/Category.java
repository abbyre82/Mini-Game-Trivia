package com.example.minigametrivia;

/**
 * Created by Abby on 6/17/17.
 */

public class Category {
    private Category Classes;
    private Category World;
    private Category Boss;
    private Category Creature;
    private Category Random;
    private Category userChoice; //category the user chose
    public Category(){
        Classes = new Category();
        World = new Category();
        Boss = new Category();
        Creature = new Category();
        Random = new Category();
    }
    public void Classes(Questions questions){

    }
}
