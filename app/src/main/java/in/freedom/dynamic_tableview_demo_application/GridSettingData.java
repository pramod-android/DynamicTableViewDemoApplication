package in.freedom.dynamic_tableview_demo_application;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GridSettingData {

    @SerializedName("SeqNo")
    @Expose
    private int seqNo;
    @SerializedName("ColHeader")
    @Expose
    private String colHeader;
    @SerializedName("ColFieldName")
    @Expose
    private String colFieldName;

    @SerializedName("ColIsVisible")
    @Expose
    private String colIsVisible;
    @SerializedName("ColWidth")
    @Expose
    private int colWidth;


    public GridSettingData(int seqNo, String colHeader, String colFieldName, String colIsVisible, int colWidth) {
        this.seqNo = seqNo;
        this.colHeader = colHeader;
        this.colFieldName = colFieldName;
        this.colIsVisible = colIsVisible;
        this.colWidth = colWidth;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public String getColHeader() {
        return colHeader;
    }

    public void setColHeader(String colHeader) {
        this.colHeader = colHeader;
    }

    public String getColFieldName() {
        return colFieldName;
    }

    public void setColFieldName(String colFieldName) {
        this.colFieldName = colFieldName;
    }

    public String getColIsVisible() {
        return colIsVisible;
    }

    public void setColIsVisible(String colIsVisible) {
        this.colIsVisible = colIsVisible;
    }

    public int getColWidth() {
        return colWidth;
    }

    public void setColWidth(int colWidth) {
        this.colWidth = colWidth;
    }

}
