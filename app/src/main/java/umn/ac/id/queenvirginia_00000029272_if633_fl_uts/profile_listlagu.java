package umn.ac.id.queenvirginia_00000029272_if633_fl_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile_listlagu extends AppCompatActivity {

    Toolbar back_lagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_listlagu);

        back_lagu = findViewById(R.id.back2);
        setSupportActionBar(back_lagu);
        back_lagu.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        back_lagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLagu = new Intent(profile_listlagu.this, listLagu.class);
                startActivity(toLagu);
                finish();
            }
        });
    }
}