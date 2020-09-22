package com.npdstudio.tikihometesting.activity

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.npdstudio.tikihometesting.R
import com.npdstudio.tikihometesting.model.Banner
import com.npdstudio.tikihometesting.model.Data
import com.npdstudio.tikihometesting.model.DataQuickLink
import com.npdstudio.tikihometesting.model.QuickLink
import com.npdstudio.tikihometesting.network.APIServiceInterface
import com.npdstudio.tikihometesting.network.NetworkProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_search,
                R.id.navigation_notifications,
                R.id.navigation_profile
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        val networkProvider = NetworkProvider()
        val retrofit:Retrofit = networkProvider.retrofit
        val apiServiceInterface=retrofit.create(APIServiceInterface::class.java)
        apiServiceInterface.getAllBanner()!!.enqueue(object:Callback<Data<Banner?>?>{
            override fun onFailure(call: Call<Data<Banner?>?>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<Data<Banner?>?>, response: Response<Data<Banner?>?>) {
                var listBanner:List<Banner> = response.body()!!.get_List() as List<Banner>
                try {
                    for (item in listBanner) {
                        Log.e("main", item.image_url + "")
                    }
                }catch (e:Exception){
                    Log.e("main","error")
                }
            }

        })
        apiServiceInterface.getQuickLink()!!.enqueue(object:Callback<DataQuickLink?>{
            override fun onResponse(
                call: Call<DataQuickLink?>,
                response: Response<DataQuickLink?>
            ) {
                var data:List<QuickLink> = response.body()!!.getData()!!.get(0) as List<QuickLink>
                for(item in data){
                    Log.e("main 2",item.imageUrl)
                }

            }

            override fun onFailure(call: Call<DataQuickLink?>, t: Throwable) {

            }
        })

    }
}
