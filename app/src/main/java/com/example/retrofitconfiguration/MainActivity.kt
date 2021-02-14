package com.example.retrofitconfiguration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Retrofit
import com.example.retrofitconfiguration.DataLayer.ApiConnector
import com.example.retrofitconfiguration.Model.ContactModel
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we are good
         val TAG = "rdmn"
        var letsSee=ApiConnector.getInstance().create(contactApi::class.java)
        letsSee.getAllContacts().enqueue(object : retrofit2.Callback<List<ContactModel>>{
            override fun onResponse(
                call: Call<List<ContactModel>>,
                response: Response<List<ContactModel>>
            ) {
                Log.d(TAG,"everythings fine : ${response.code()}")

            }

            override fun onFailure(call: Call<List<ContactModel>>, t: Throwable) {
                Log.d(TAG,"we are on failure : ${t}")
            }

        })
    }
}

/*
GIT
1-create a git repository locally : VCS > enable version control
integration
2-commit stuff: project directory > git > Add > commit directory
2.1- now you can use terminal > git status > git commit -am "i did it"
3-create it online dude > by github's user interface
4-copy https
5-VCS>Push>master default remote
6 -insert https
7- you got it
 */