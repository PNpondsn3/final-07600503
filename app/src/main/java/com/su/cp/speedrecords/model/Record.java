package com.su.cp.speedrecords.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "record")
public class Record {
    @PrimaryKey(autoGenerate = true)
    public final int id;
    public double distance;
    public double duration;



    public Record(int id,double distance,double duration) {
        this.id = id;
        this.distance=distance;
        this.duration=duration;


    }
}
