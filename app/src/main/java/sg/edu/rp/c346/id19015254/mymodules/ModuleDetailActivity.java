package sg.edu.rp.c346.id19015254.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modDetails = findViewById(R.id.modDetails);
        btnBack = findViewById(R.id.btnBack);
        Intent intentReceived = getIntent();
        String mod = intentReceived.getStringExtra("mod");
        modDetails.setText(mod);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}