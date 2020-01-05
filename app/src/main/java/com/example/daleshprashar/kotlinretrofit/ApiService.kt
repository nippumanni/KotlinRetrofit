package com.example.daleshprashar.kotlinretrofit

import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("/users")
fun fetchAllUsers(): Call<List<User>>

    @POST("/tasks")
fun createTask(@Body user:User )

    @POST("/saveFirst")
    fun createTaskb(): Call<User>




}