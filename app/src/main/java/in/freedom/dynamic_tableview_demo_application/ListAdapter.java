package in.freedom.dynamic_tableview_demo_application;

import android.content.Context;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<ListData> implements View.OnClickListener {

    // private ArrayList<POListItem> dataSet;
    Context mContext;
    private List<GridSettingData> _gridConfigList;
    private List<ListData> datas;
    private List<ListData> items;
    SimpleDateFormat df;
    TextView tvTotalRecords;

    // View lookup cache
    private static class ViewHolder {
        TextView tvOrderNO, tvPODate, tvSupplierName, tvOrderNetvalue, tvStatus;
    }


    public ListAdapter(List<ListData> data, List<GridSettingData> objects1, Context context) {
        super(context, R.layout.list_item, data);
        this.datas = data;
        this.items = new ArrayList<ListData>();
        this.items.addAll(datas);
        this.mContext = context;
        //this.tvTotalRecords = tv_Total_Records;
        _gridConfigList = objects1;
    }



    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        Object object = getItem(position);
//        DashboardItems dataModel = (DashboardItems) object;

        switch (v.getId()) {

//            case R.id.sales_customer_Name:
//
//                Snackbar.make(v, "Release date " + dataModel.getCustomerName(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//
//                break;
        }


    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListData data = getItem(position);
        List<GridSettingData> fagrid = _gridConfigList;
        View v = new CustomGridCreator(mContext, data, fagrid, position);


        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        v.startAnimation(animation);
        lastPosition = position;

        if (position % 2 == 1) {
            //v.setBackgroundColor(Color.WHITE);


            v.setBackground(ContextCompat.getDrawable(mContext, R.drawable.row_white_border));


        } else {
            //v.setBackgroundResource(R.color.colorGray);
            v.setBackground(ContextCompat.getDrawable(mContext, R.drawable.row_gray_border));

        }
        return v;

    }

}
