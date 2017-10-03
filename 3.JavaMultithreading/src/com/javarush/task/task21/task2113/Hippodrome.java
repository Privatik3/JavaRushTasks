package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/*
Теперь уже точно все.
Добавь вызов метода printWinner в конец метода main.
Запускай и любуйся своей первой компьютерной игрой :)

Требования:
1. Метод printWinner должен быть вызван в методе main после метода run.
*/

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Sleven", 3, 1));
        horses.add(new Horse("Lucky", 3, 1));
        horses.add(new Horse("Gomer", 3, 1));
        
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(50);
        }
    }

    public void move() {
        for (Horse horse : horses ) {
            horse.move();
        }
    }
    
    public void print() {
        for (Horse horse : horses ) {
            horse.print();
        }

        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses ) {
            if (horse.getDistance() > winner.getDistance()) {
                winner = horse;
            }
        }

        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
