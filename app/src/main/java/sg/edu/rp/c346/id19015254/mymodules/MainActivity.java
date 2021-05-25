package sg.edu.rp.c346.id19015254.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c322;
    TextView c346;
    TextView c382;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c322 = findViewById(R.id.tvC322);
        c346 = findViewById(R.id.tvC346);
        c382 = findViewById(R.id.tvC382);

        c322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod", "Module Code: C322\n\n" +
                        "Module Name: Data Centre and Cloud Management\n\n" +
                        "Academic Year: 2021\n\n" +
                        "Semester: 1\n\n" +
                        "Module Credit: 4\n\n" +
                        "Venue: E61G");
                startActivity(intent);
            }
        });

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod", "Module Code: C346\n\n" +
                        "Module Name: Mobile App Development\n\n" +
                        "Academic Year: 2021\n\n" +
                        "Semester: 1\n\n" +
                        "Module Credit: 4\n\n" +
                        "Venue: E62E");
                startActivity(intent);
            }
        });

        c382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mod", "Module Code: C382\n\n" +
                        "Module Name: IT Service Delivery\n\n" +
                        "Academic Year: 2021\n\n" +
                        "Semester: 1\n\n" +
                        "Module Credit: 4\n\n" +
                        "Venue: E62G");
                startActivity(intent);
            }
        });

        Intent intentReceived = getIntent();
    }
}