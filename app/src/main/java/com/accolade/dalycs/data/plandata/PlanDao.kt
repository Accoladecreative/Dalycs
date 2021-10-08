package com.accolade.dalycs.data.plandata

import androidx.room.*

@Dao
interface PlanDao {
    @Insert
    suspend fun addNewPlan(plan: Plan)

    @Update
    suspend fun updatePlan(plan: Plan)

    @Delete
    suspend fun deleteThisPlan(plan: Plan)

    @Query("SELECT * FROM plan_table ORDER BY id ASC")
    suspend fun getAllPlans(plans: ArrayList<Plan>)

    @Query("SELECT * FROM plan_table ORDER BY date ASC ") //'LocalDate.now()'
    suspend fun getTodaysPlans(plans: ArrayList<Plan>)

    @Query("DELETE * FROM plan_table")
    suspend fun deleteAllPlans(plans: ArrayList<Plan>)


}

