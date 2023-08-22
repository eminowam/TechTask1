package com.example.techtask1.data.networks

import com.example.techtask1.domain.models.Details
import com.example.techtask1.domain.models.MainResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MainApi {

    @GET(Endpoints.CHARACTER)
    suspend fun getCharacter(
        @Query("page") page: Int,
    ): Response<MainResponse>

    @GET(Endpoints.DETAILS)
    suspend fun goToDetailsCharacter(
        @Path("id") id: Int,
    ): Response<Details>

    @GET(Endpoints.CHARACTER)
    suspend fun storageCharacter(): Response<List<Details>>

    @GET(Endpoints.DETAILS)
    suspend fun saveCharacter(
//        @Path("id") id: Int
    ): Response<Details>

}