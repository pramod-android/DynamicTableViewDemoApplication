package in.freedom.dynamic_tableview_demo_application;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<GridSettingData> gridConfigList =new ArrayList<>();
    List<ListData> listDataList =new ArrayList<>();;
    LinearLayout linearLayout;
    ListView listViewServiceCalls;
    ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.llListTitles);
        listViewServiceCalls = (ListView) findViewById(R.id.listViewSpareRequests);

        // add number columns
        gridConfigList.add(new GridSettingData(1,"SeqNo","seqNo","Y",200));
        gridConfigList.add(new GridSettingData(1,"Name","name","Y",200));
        gridConfigList.add(new GridSettingData(2,"Address","address","Y",200));
        gridConfigList.add(new GridSettingData(3,"Number","number","Y",200));
        gridConfigList.add(new GridSettingData(4,"Qualification","qualification","Y",200));

        updateGridHeader(gridConfigList);
        for (int i=0;i<10;i++) {
            listDataList.add(new ListData(i, "name" + i, "address" + i, "999999999" + i, "qualification"+i));
        }

        listAdapter = new ListAdapter(listDataList, gridConfigList, getApplicationContext());
        listViewServiceCalls.setAdapter(listAdapter);
    }

    private void updateGridHeader(List<GridSettingData> gridSettingData) {

        List<GridSettingData> gridSettingDataList = gridSettingData;

        linearLayout.removeAllViews();

        int srnowidth = 0, itemswidth = 0;
       srnowidth = 100;


//        TextView txtSrNo = new TextView(MainActivity.this);
//        txtSrNo.setTextSize(18);
//        txtSrNo.setWidth(srnowidth);
//        txtSrNo.setTextColor(0xFFFFFFFF);
//        txtSrNo.setPadding(2, 2, 2, 2);
//        txtSrNo.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
//        txtSrNo.setText("Sr.No.");
//        txtSrNo.setGravity(Gravity.CENTER_HORIZONTAL);
//        // txtSrNo.setBackground(getResources().getDrawable(R.drawable.grid_border));
//        linearLayout.addView(txtSrNo);
        for (GridSettingData gc : gridSettingDataList) {

                itemswidth = gc.getColWidth();

            TextView textView = new TextView(MainActivity.this);
            textView.setTextSize(18);
            textView.setWidth(itemswidth);
            textView.setTextColor(0xFFFFFFFF);
            textView.setPadding(4, 2, 2, 2);
            textView.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
            // textView.setBackground(getResources().getDrawable(R.drawable.grid_border));

            if(gc.getColIsVisible().equals("Y")){
                textView.setText(gc.getColHeader());
            }

            //textView.setText( gc.getTvTitle());
            linearLayout.addView(textView);
        }

    }
}
