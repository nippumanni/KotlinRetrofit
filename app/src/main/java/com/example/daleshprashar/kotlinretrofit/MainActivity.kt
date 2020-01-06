package com.example.daleshprashar.kotlinretrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var gson : Gson = GsonBuilder().setLenient()
               .create()




        val retrofit = Retrofit.Builder()
                .baseUrl("http://192.168.1.5:8080")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
//http://192.168.1.5:8080/findFirst/
        //http://jsonplaceholder.typicode.com
        val api = retrofit.create(ApiService::class.java)
        api.createTaskb().enqueue(object :Callback<User>{
            override fun onResponse(call: Call<User>?, response: Response<User>?) {
                Log.d("ss","dd")

                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(call: Call<User>?, t: Throwable?) {
                Log.d("ss","dd")

                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
/*
        api.createTaskb(data()).enqueue(object  : Callback<List<User>> {
            override fun onFailure(call: Call<List<User>>?, t: Throwable?) {
                Log.d("ss","dd")
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<User>>?, response: Response<List<User>>?) {
              Log.d("ss","dd")
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        */
    }

    fun  data() : JSONObject
    {
            var  jsonObje = JSONObject()
        try {

            jsonObje.put("first", "ice");
            jsonObje.put("last", "ice");
            var  jsonArray = JSONArray()
            jsonArray.put("headerArrayKey1");
// to String()
        } catch (e: Exception) {
        }
        return jsonObje

    }

    fun addedToTest():String
    {
        return "hopefullysuccess"
    }
}
