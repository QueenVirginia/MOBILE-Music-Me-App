package umn.ac.id.queenvirginia_00000029272_if633_fl_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    Toolbar back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = findViewById(R.id.back);
        setSupportActionBar(back);
        back.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toAwal = new Intent(profile.this, TampilanAwal.class);
                startActivity(toAwal);
                finish();
            }
        });
    }
}