package com.ercin.maps.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.ercin.maps.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase {

    public abstract IPlaceDao placeDao();

}