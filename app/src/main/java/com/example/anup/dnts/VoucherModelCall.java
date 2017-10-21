
package com.example.anup.dnts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VoucherModelCall {

    @SerializedName("TotalProduct")
    @Expose
    private Integer totalProduct;
    @SerializedName("Products")
    @Expose
    private List<Voucher> vouchers = null;


    public Integer getTotalProduct() {
        return totalProduct;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    /*
    public void setProducts(List<Voucher> vouchers) {
        this.vouchers = vouchers;
    }
    public void setTotalProduct(Integer totalProduct) {
        this.totalProduct = totalProduct;
    }
    */
}
