package com.mhandharbeni.perumdapetugas.room.interfaceDao;

import androidx.room.Dao;
import androidx.room.Insert;


import com.mhandharbeni.perumdapetugas.room.entity.data.DataToken;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface TokenInterfaceDao {
    @Insert(onConflict = REPLACE)
    void insertAll(List<DataToken> listToken);

}
