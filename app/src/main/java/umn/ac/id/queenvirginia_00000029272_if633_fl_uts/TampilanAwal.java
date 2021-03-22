package umn.ac.id.queenvirginia_00000029272_if633_fl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TampilanAwal extends AppCompatActivity {

    Button btnlogin, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_awal);

        btnlogin = findViewById(R.id.login);
        btnProfile = findViewById(R.id.profile);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(TampilanAwal.this, login.class);
                startActivity(toLogin);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toProfile = new Intent(TampilanAwal.this, profile.class);
                startActivity(toProfile);
            }
        });
    }
}