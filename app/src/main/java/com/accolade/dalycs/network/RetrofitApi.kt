package com.accolade.dalycs.network

import com.accolade.dalycs.data.plandata.Plan
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path


private const val BASEURL = "https://jsonplaceholder.typicode.com/"


private val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl(BASEURL)
   /* .addConverterFactory(GsonConverterFactory.create())
  */  .build()

val api: RetrofitApi by lazy {
    retrofit.create(RetrofitApi::class.java)
}

interface RetrofitApi {

    @GET("plans")
    suspend fun getAllPlans(): Response<ArrayList<Plan>>
    @GET("today-plans")
    suspend fun getTodaysPlans(): Response<ArrayList<Plan>>
    @GET("accomplished-plans")
    suspend fun getAccomplishedPlans(): Response<ArrayList<Plan>>
    @GET("routines")
    suspend fun getAllRoutins(): Response<ArrayList<Plan>>


    @GET("posts/{numb}")
    suspend fun getPost2(@Path("numb") numb:Int):Response<Plan>

    @GET("posts")
    suspend fun getAllPosts():Response<List<Plan>>





}
