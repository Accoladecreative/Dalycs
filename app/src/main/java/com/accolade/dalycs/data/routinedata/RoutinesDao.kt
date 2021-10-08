package com.accolade.dalycs.data.routinedata

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.accolade.dalycs.data.plandata.Plan

interface RoutinesDao {
    @Insert
    suspend fun addNewRoutine(routines: Routines)

    @Update
    suspend fun updateRoutine(routines: Routines)

    @Delete
    suspend fun deleteThisRoutine(routines: Routines)

    @Query("SELECT * FROM routine_table ORDER BY id ASC")
    suspend fun getAllPlans(routines: ArrayList<Routines>)

    @Query("DELETE  FROM routine_table")
    suspend fun deleteAllPlans(routines: ArrayList<Routines>)
}
