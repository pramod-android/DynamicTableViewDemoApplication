package in.freedom.dynamic_tableview_demo_application;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

public class CustomGridCreator extends LinearLayout {
    //ArrayList<FAGrid> gridConfigList;
    public CustomGridCreator(Context context, ListData data, List<GridSettingData> gridConfigList, int pos) {
        super(context);

        setOrientation(LinearLayout.HORIZONTAL);
        setPadding(0, 0, 0, 0);

        //image:params
        LayoutParams Params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        Params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        LinearLayout PanelV = new LinearLayout(context);
        PanelV.setOrientation(LinearLayout.HORIZONTAL);
        int srnowidth = 0, itemswidth = 0;
//
//            srnowidth = 100;
//
//        TextView txtSrNo = new TextView(context);
//        txtSrNo.setTextSize(18);
//        txtSrNo.setWidth(srnowidth);
//        txtSrNo.setTextColor(0xFF000000);
//        txtSrNo.setPadding(2, 2, 1, 2);
//        txtSrNo.setGravity(Gravity.CENTER);
//        txtSrNo.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
//        // txtSrNo.setBackground(getResources().getDrawable(R.drawable.grid_border));
//        txtSrNo.setText(String.valueOf(pos + 1));
//        PanelV.addView(txtSrNo);

        if(gridConfigList!=null) {
            for (GridSettingData gc : gridConfigList) {

                    itemswidth = gc.getColWidth();


                TextView textView = new TextView(context);
                textView.setWidth(itemswidth);
                textView.setTextColor(0xFF000000);
                //txtSrNo.setTextSize(18);
                textView.setPadding(4, 2, 2, 2);
                textView.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
                //   textView.setBackground(getResources().getDrawable(R.drawable.grid_border));

                if (gc.getColIsVisible().equals("Y")) {
                    textView.setText(gc.getColHeader());
                }

                switch (gc.getColFieldName()) {
                    case "seqNo": {
                        textView.setText(String.valueOf(data.getSeqNo()));
                        break;
                    }
                    case "name": {
                        textView.setText(data.getName());
                        break;
                    }
                    case "address": {
                        textView.setText(data.getAddress());
                        break;
                    }
                    case "number": {
                        textView.setText(data.getNumber());
                        break;
                    }
                    case "qualification": {
                        textView.setText(data.getQualification());
                        break;
                    }
                    default: {
                        textView.setText("");
                    }
                }
                PanelV.addView(textView);
            }
            addView(PanelV, Params);
        }
    }
}

