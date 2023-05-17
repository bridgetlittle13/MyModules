package sg.edu.rp.c346.id22013272.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvDisplay=findViewById(R.id.textView);
        Intent intentReceived=getIntent();
        String moduleCode=intentReceived.getStringExtra("ModuleCode");
        String moduleName=intentReceived.getStringExtra("ModuleName");
        String academicYear=intentReceived.getStringExtra("AcademicYear");
        int semesterNo=intentReceived.getIntExtra("SemesterNo",1);
        int moduleCredit=intentReceived.getIntExtra("ModuleCredit",0);
        String venue=intentReceived.getStringExtra("venue");
        tvDisplay.setText(moduleCode+"\n "+moduleName+"\n "+academicYear+"\n "+"\nSemester: "+semesterNo+"\n "+"\nModule Credit: "+moduleCredit+"\n "+"\nVenue:"+venue);
    }
}