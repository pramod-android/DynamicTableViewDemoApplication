package in.freedom.dynamic_tableview_demo_application;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ListData implements Serializable {


    @SerializedName("seqNo")
    @Expose
    private int SeqNo;
    @SerializedName("name")
    @Expose
    private String Name;
    @SerializedName("address")
    @Expose
    private String Address;
    @SerializedName("number")
    @Expose
    private String Number;
    @SerializedName("qualification")
    @Expose
    private String Qualification;

    public ListData(int seqNo, String name, String address, String number, String qualification) {
        SeqNo = seqNo;
        Name = name;
        Address = address;
        Number = number;
        Qualification = qualification;
    }

    public int getSeqNo() {
        return SeqNo;
    }

    public void setSeqNo(int seqNo) {
        SeqNo = seqNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
