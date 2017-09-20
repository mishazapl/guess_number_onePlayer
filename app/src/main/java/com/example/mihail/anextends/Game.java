package com.example.mihail.anextends;

class GameEasy {

    private int numberPlayer = 0;
    private double random = 0;
    private String win = "Поздравляю с победой!";
    private String over = "К сожалению вы проиграли!";

    void setNumber(int a) {
        numberPlayer = a;
    }

    void createRandomNumbers() {
        random = Math.random()*10;
        random = (int) random;
    }

    String retResult() {
        if (numberPlayer == random) {
            return win + "\n Настоящее число " + random;
        } else {
            return over + "\n Настоящее число " + random;
        }
    }

}
