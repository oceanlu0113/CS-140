// Author: Ocean Lu
// Assignment: Lab #7 Bonus
// Task: #1
// Completed: 05/11/2017

import java.util.Random;
public class Prog1 {
    public static void main(String[] args) {
        System.out.println("Tonight we will be drawing SuperLotto Plus numbers.");
        SuperLotto();
    }
    
    public static void SuperLotto () {
        //rand.nextInt((max - min) + 1) + min;
        Random rand = new Random();
        int l = rand.nextInt(46) + 1;
        int u = rand.nextInt(46) + 1;
        int c = rand.nextInt(46) + 1;
        int k = rand.nextInt(46) + 1;
        int y = rand.nextInt(46) + 1;
        int mega = rand.nextInt(26) + 1;
        System.out.println(l + " " + u + " " + c + " " + k + " " + y);
    }
}

//test runs
/*
0;oslu@costello:~ javac Prog1.java
0;oslu@costello:~ java Prog1
Tonight we will be drawing SuperLotto Plus numbers.
10 40 38 43 43
0;oslu@costello:~ java Prog1
Tonight we will be drawing SuperLotto Plus numbers.
28 43 46 45 24
*/
