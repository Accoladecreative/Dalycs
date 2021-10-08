package com.accolade.dalycs.data.plandata

import android.os.Build
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "plan_table")
class Plan(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name="title")
    var title: String,

    @ColumnInfo(name = "description")
    var description: String,

    @ColumnInfo(name = "date")
    var date:LocalDate,

    @ColumnInfo(name = "media")
    var media:MediaStore.Audio.Media,

    @ColumnInfo(name = "remind_me")
    var remindMe :Boolean) {

    @RequiresApi(Build.VERSION_CODES.O)
    var todaysDate:LocalDate = LocalDate.now()


    

}