package com.accolade.dalycs.data.routinedata

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.accolade.dalycs.data.plandata.Plan

@Entity(tableName = "routine_table")
class Routines(
    @PrimaryKey
    var id: Int,

    @ColumnInfo(name = "plan")
    var plan: Plan,

    @ColumnInfo(name = "regularity")
    var regularity:String

) {

}