package com.su.cp.speedrecords.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.su.cp.speedrecords.model.Record;

@Dao
public interface UserDao {

    @Query("SELECT * FROM record")
    Record[] selectAllData();
    @Insert
    void insertData(Record... records);

}
