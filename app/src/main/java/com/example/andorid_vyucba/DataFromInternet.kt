package com.example.andorid_vyucba

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

val retrofit by lazy {
    Retrofit.Builder()
        .baseUrl("https://universities.hipolabs.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

interface UniversityService {
    @GET("search")
    suspend fun getCountryUniversities(@Query("country") countryName: String): List<University>
}

val universityService by lazy {
    retrofit.create(UniversityService::class.java)
}

data class University(
    @SerializedName("name") val name: String,
    @SerializedName("country") val country: String
    //val web_pages: List<String>,
    //val domains: List<String>
)

@Composable
fun DataFromInternet() {

    val corutineScope = rememberCoroutineScope()
    var universities by remember { mutableStateOf(emptyList<University>()) }

    Column {
        Button(onClick = {
            corutineScope.launch {
                universities = universityService.getCountryUniversities("Slovakia")
            }
        }) { }
        LazyColumn {
            items(universities) {
                Text(it.name)
            }
        }
    }
}