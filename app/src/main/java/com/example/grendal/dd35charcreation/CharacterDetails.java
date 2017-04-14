package com.example.grendal.dd35charcreation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Grendal on 4/12/2017.
 */

public class CharacterDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);

        String characterName = getIntent().getStringExtra("charName");
        Toast.makeText(this,characterName,Toast.LENGTH_SHORT).show();

    }

    public void goBacktoCharSelection(View view){
        //no data is going back
        finish();
    }
}
