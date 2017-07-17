package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;

    ArrayList<EmployeeInfo> employeeInfo;
    CustomAdapter caEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee=(ListView)findViewById(R.id.listViewEmployeeInfo);
        employeeInfo = new ArrayList<EmployeeInfo>();

        caEmployee = new CustomAdapter(this, R.layout.employee_info, employeeInfo);
        lvEmployee.setAdapter(caEmployee);

        EmployeeInfo item1 = new EmployeeInfo("John","Software Technical Leader",3400.0);
        employeeInfo.add(item1);
        EmployeeInfo item2 = new EmployeeInfo("May","Programmer",2200.0);
        employeeInfo.add(item2);



    }
}
