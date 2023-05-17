package sg.edu.rp.c346.id22013272.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvG953;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC203=findViewById(R.id.textViewC203);
        tvC206=findViewById(R.id.textViewC206);
        tvC218=findViewById(R.id.textViewC218);
        tvC235=findViewById(R.id.textViewC235);
        tvC346=findViewById(R.id.textViewC346);
        tvG953=findViewById(R.id.textViewG953);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:C203");
                intent.putExtra("ModuleName","\nModule Name:Web Application Development in php");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:C206");
                intent.putExtra("ModuleName","\nModule Name:Software Development Process");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:C218");
                intent.putExtra("ModuleName","\nModule Name:UI/UX Design for Apps");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:C235");
                intent.putExtra("ModuleName","\nModule Name:IT Security and Management");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("venue","W65C");
                startActivity(intent);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:C346");
                intent.putExtra("ModuleName","\nModule Name:Mobile App Development");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("venue","E63A");
                startActivity(intent);
            }
        });
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("ModuleCode", "Module Code:G953");
                intent.putExtra("ModuleName","\nModule Name:Life Skills III");
                intent.putExtra("AcademicYear","\nAcademic Year:2023");
                intent.putExtra("SemesterNo",1);
                intent.putExtra("ModuleCredit",1);
                intent.putExtra("venue","HBL");
                startActivity(intent);
            }
        });


    }
}