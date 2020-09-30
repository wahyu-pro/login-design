package com.wahyu.designlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper myViewflipper;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_number);

        btnSignIn = findViewById(R.id.btnSignIn);
        myViewflipper = findViewById(R.id.myViewFlipper);

        // Declare in and out animations and load them using AnimationUtils class
//        Animation in = AnimationUtils.loadAnimation(this, R.anim.slide_in);
//        Animation out = AnimationUtils.loadAnimation(this, R.anim.slide_out);

    }

    public void signIn(View view) {
        // set the animation type to ViewFlipper
        next();
        myViewflipper.setDisplayedChild(1);
    }

    public void ivBack(View view) {
        prev();
        myViewflipper.setDisplayedChild(0);
    }

    public void btnLanjut(View view) {
        next();
        myViewflipper.setDisplayedChild(2);
    }

    public void backToPhone(View view){
        prev();
        myViewflipper.setDisplayedChild(1);
    }

    public void next(){
        myViewflipper.setInAnimation(this, R.anim.slide_in_from_right);
        myViewflipper.setOutAnimation(this, R.anim.slide_out_to_left);
    }

    public void prev(){
        myViewflipper.setInAnimation(this, R.anim.slide_in_from_left);
        myViewflipper.setOutAnimation(this, R.anim.slide_out_to_right);
    }
}