package com.example.fxdice;
import java.util.Random; //乱数を使うためのパッケージ

public class Dice {

    private int number = 1;

    //コンストラクタ 初期化処理
    public Dice() {
        //初期化処理として、１回サイコロを転がしておく
        rollDice();
    }

    //サイコロを転がす
    public void rollDice(){
        Random rand = new Random();
        this.number = rand.nextInt(6) + 1; //1～6
    }

    //１～６までの数値を返すようにする
    public int getNumber(){
        return this.number;
    }
}