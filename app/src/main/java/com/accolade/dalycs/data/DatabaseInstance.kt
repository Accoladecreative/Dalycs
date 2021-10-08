package com.accolade.dalycs.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.accolade.dalycs.data.plandata.Plan
import com.accolade.dalycs.data.plandata.PlanDao
import com.accolade.dalycs.data.routinedata.Routines
import com.accolade.dalycs.data.routinedata.RoutinesDao

@Database(entities = [Plan::class,Routines::class], version = 1)
abstract class DatabaseInstance: RoomDatabase() {

    abstract val planDao:PlanDao
    abstract val routinesDao:RoutinesDao

    private var instance: DatabaseInstance? = null


    @Synchronized
    open fun planInstance(context:Context): DatabaseInstance?{
        if (instance == null){
            instance = Room.databaseBuilder(context, DatabaseInstance::class.java,"plan_table").build()
        }
        return instance as DatabaseInstance
    }

    @Synchronized
    open fun routineInstance(context:Context): DatabaseInstance{
        if (instance == null){
            instance = Room.databaseBuilder(context, DatabaseInstance::class.java,"routine_table").build()
        }
        return instance as DatabaseInstance
    }

}