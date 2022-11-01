package com.example.rukun_rukunsholat;

import android.os.Parcel;
import android.os.Parcelable;

public class Rukun implements Parcelable {
    private String nama, detail;
    private int photo;

    public Rukun(){

    }

    protected Rukun(String nama, String detail, int photo) {
        this.nama = nama;
        this.detail = detail;
        this.photo = photo;
    }

    protected Rukun(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Rukun> CREATOR = new Creator<Rukun>() {
        @Override
        public Rukun createFromParcel(Parcel in) {
            return new Rukun(in);
        }

        @Override
        public Rukun[] newArray(int size) {
            return new Rukun[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
