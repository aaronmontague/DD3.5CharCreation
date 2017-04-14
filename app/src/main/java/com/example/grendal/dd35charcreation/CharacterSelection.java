package com.example.grendal.dd35charcreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CharacterSelection extends AppCompatActivity {

    private ArrayList<String> characterList;
    private ArrayAdapter<String> characterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        // Fill the list -by Aaron Montague on 12 Apr 2017
        final ListView charView = (ListView) findViewById(R.id.characterListview);
        characterList = new ArrayList<String>();

        characterAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characterList);
        charView.setAdapter(characterAdapter);

        // Fill the list -by Aaron Montague on 12 Apr 2017
        characterList.add("Gral Hrak");
        characterList.add("Arini Kettlepot");
        characterList.add("Yorick the Stained");

        charView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //position and id both give the same value in the ArrayList - By Aaron Montague 13 Apr 2017
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clickForCharDetails(view, position);
            }
        });

        // Sub in a DB call -by Aaron Montague on 12 Apr 2017
        /*String[] addToInfoList = {"Barn", "House", "Coop"};

        for (int i = 0; i < addToInfoList.length; i++){
            characterList.add(addToInfoList[i]);
        }
        */
    }

    public void clickForCharDetails(View view, int charID){
        Intent intent = new Intent(CharacterSelection.this, CharacterDetails.class).putExtra("charName", characterList.get(charID));
        startActivity(intent);
    }
}
