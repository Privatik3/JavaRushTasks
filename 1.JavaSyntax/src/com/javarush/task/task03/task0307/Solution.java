package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Zerg> zergs = new ArrayList<>();
        ArrayList<Protoss> protosses = new ArrayList<>();
        ArrayList<Terran> terrans = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Zerg zerg = new Zerg();
            zerg.name = "zerg" + i;
            zergs.add(zerg);
        }
        for (int i = 0; i < 5; i++) {
            Protoss protoss = new Protoss();
            protoss.name = "protoss" + i;
            protosses.add(protoss);

        }
        for (int i = 0; i < 12; i++) {
            Terran terran = new Terran();
            terran.name = "terran" + i;
            terrans.add(terran);

        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
