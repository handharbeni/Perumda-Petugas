package com.mhandharbeni.perumdapetugas.room.interfaceDao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.mhandharbeni.perumdapetugas.room.entity.SampleEntity;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface SampleInterfaceDao {
    @Insert(onConflict = REPLACE)
    public void insertSample(SampleEntity sampleEntity);
}
