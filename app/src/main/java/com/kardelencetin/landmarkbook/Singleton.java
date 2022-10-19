package com.kardelencetin.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {
    private Landmark sentLandmark;
    private static Singleton singleton;
    // private Bitmap selectedBitmap;

    private Singleton(){

    }

    public Landmark getSentLandmark(){
        return sentLandmark;
    }

    public void setSentLandmark(Landmark sentLandmark){
        this.sentLandmark = sentLandmark;
    }

    public static Singleton getInstance(){
        //daha onceden olusturulmadiysa
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
