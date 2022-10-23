package com.david0926.foodinfo1021.data.remote

import com.david0926.foodinfo1021.data.model.FoodResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodService {
    @GET("/B553748/CertImgListService/getCertImgListService")
    suspend fun getFoods(
        @Query("ServiceKey") ServiceKey: String?,
        @Query("prdlstReportNo") prdlstReportNo: String?,
        @Query("prdlstNm") prdlstNm: String?,
        @Query("returnType") returnType: String?,
        @Query("pageNo") pageNo: String?,
        @Query("numOfRows") numOfRows: String?
    ): Response<FoodResponse>
}