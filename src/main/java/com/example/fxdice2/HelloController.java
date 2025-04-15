package com.example.fxdice2;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Dice dice = new Dice();
        dice.rollDice();
        welcomeText.setText( "サイコロ : " + ( dice.getNumber() ) );
    }

    @FXML
    protected void onHelloNewButtonClick() {
        welcomeText.setText( "hello" );
        welcomeText.setScaleX( 4.0 );
        welcomeText.setRotate(15.0);
    }


    @FXML
    protected void onHelloButton3Click() {
        welcomeText.setText( "hello"  );
        RotateTransition animation = new RotateTransition( Duration.seconds(0.5),
                welcomeText);
        animation.setFromAngle(0);
        animation.setToAngle(360);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.setCycleCount(1);
        animation.setAutoReverse(false);
        animation.play();
        ScaleTransition scaleTransition = new ScaleTransition( Duration.seconds(0.5) ,
                welcomeText);
        scaleTransition.setByX(2);
        scaleTransition.play();
    }
}