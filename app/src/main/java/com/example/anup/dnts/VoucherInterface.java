package com.example.anup.dnts;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by Anup on 10/18/2017.
 */

public interface VoucherInterface {

    @GET("/Voucher/GetDealInformationsByVoucherId/{VoucherId}/{Index}/{Count}")
    Call<VoucherModelCall> getVoucherDealInformationModels(@Path("VoucherId") int VoucherId, @Path("Index") int Index, @Path("Count") int Count );

}
