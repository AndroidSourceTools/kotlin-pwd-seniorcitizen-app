package com.seniorcitizen.app.data.remote

import com.seniorcitizen.app.data.model.AppAuthenticateRequest
import com.seniorcitizen.app.data.model.AppAuthenticateResponse
import com.seniorcitizen.app.data.model.SeniorCitizen
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Created by Nic Evans on 2019-12-10.
 */

interface ApiInterface {
    @Headers(
        "Accept: application/json",
        "Content-type: application/json"
    )
    @POST("api/transaction/authenticate")
    fun authenticateApp(@Body request: AppAuthenticateRequest) : Observable<AppAuthenticateResponse>

    @GET
    fun getAllSenior(@Header("Authorization") authToken: String): Observable<List<SeniorCitizen>>
}