package com.example.anup.dnts;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommonFragment extends Fragment {

    //private Activity thisActivity;
    private Context mContext;
    private RecyclerView mRecyclerView;
    private VoucherAdapter adapter;
    private Retrofit mRetrofit;
    private VoucherInterface voucherInterface;
    private ArrayList<Voucher> voucherList;
    private RelativeLayout progressLayout;
    private ProgressBar progressBarRecycler;
    private TextView dealCountView;
    private TextView dealCountViewNow;
    private SwipeRefreshLayout refreshLayout;

    private int voucherId = 36;
    private int totalProduct;
    private int firstCall = 20;
    private boolean viewFlag;

    public CommonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_common, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = view.findViewById(R.id.recyclerview_common);
        progressLayout = view.findViewById(R.id.progress_layout);
        progressBarRecycler = view.findViewById(R.id.recycler_progress);
        dealCountView = view.findViewById(R.id.deal_count);
        dealCountViewNow = view.findViewById(R.id.deal_count_now);
        refreshLayout = view.findViewById(R.id.swipeLayout);

        mRetrofit = RetrofitSingleton.getInstance(mContext);
        voucherInterface = mRetrofit.create(VoucherInterface.class);


        GridLayoutManager layoutManager = new GridLayoutManager(mContext,2);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        //mRecyclerView.setHasFixedSize(true);

        voucherList = new ArrayList<>();

        // ToDo
        //getData();
        adapter = new VoucherAdapter(mContext, voucherList);
        adapter.setViewType(VoucherAdapter.GRID);
        mRecyclerView.setAdapter(adapter);
        loadRandomData();


        EndlessRecyclerViewScrollListener scrollListener = new EndlessRecyclerViewScrollListener(layoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {


                if (firstCall<totalProduct){
                    progressBarRecycler.setVisibility(View.VISIBLE);
                    loadMoreData(voucherList.size(),20);
                    firstCall = firstCall + 20;
                }

                loadRandomData();

            }
        };
        mRecyclerView.addOnScrollListener(scrollListener);

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                adapter.clear();
                loadRandomData();
                // Call when done
                refreshLayout.setRefreshing(false);

            }
        });

        refreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

    }

    private void getData(){

        voucherInterface.getVoucherDealInformationModels(voucherId,0,firstCall).enqueue(new Callback<VoucherModelCall>() {
            @Override
            public void onResponse(Call<VoucherModelCall> call, Response<VoucherModelCall> response) {

                progressLayout.setVisibility(View.GONE);
                if (response.isSuccessful()){

                    totalProduct = response.body().getTotalProduct();
                    voucherList.addAll(response.body().getVouchers());
                    adapter = new VoucherAdapter(mContext, voucherList);
                    adapter.setViewType(VoucherAdapter.GRID);
                    mRecyclerView.setAdapter(adapter);
                    //adapter.addList(voucherList);
                    dealCountView.setText("Total products: " + totalProduct);
                    dealCountViewNow.setText("Now showing: " + voucherList.size());


                }else {
                    Toast.makeText(mContext,"Error",Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<VoucherModelCall> call, Throwable t) {
                Toast.makeText(mContext,"Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadMoreData(int index,int count){

        voucherInterface.getVoucherDealInformationModels(voucherId,index,count).enqueue(new Callback<VoucherModelCall>() {
            @Override
            public void onResponse(Call<VoucherModelCall> call, Response<VoucherModelCall> response) {

                progressBarRecycler.setVisibility(View.GONE);
                if (response.isSuccessful()){
                    // ToDo

                    ArrayList<Voucher> newList = (ArrayList<Voucher>) response.body().getVouchers();

                    if (newList != null && newList.size() > 0){

                    }
//                    voucherList.addAll(response.body().getVouchers())  ;
//                    adapter.addList(voucherList);
//                    dealCountViewNow.setText("Now showing: " + voucherList.size());

                    // Custom




                }else {

                    //Toast.makeText(mContext,"Error",Toast.LENGTH_SHORT).show();
                    Snackbar.make(mRecyclerView,"Connection Error",Snackbar.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<VoucherModelCall> call, Throwable t) {
                progressBarRecycler.setVisibility(View.GONE);
                Snackbar.make(mRecyclerView,"Connection Error",Snackbar.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_list:

                if (!viewFlag){
                    LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRecyclerView.setLayoutManager(layoutManager);
                    adapter.setViewType(VoucherAdapter.LIST);
                    item.setIcon(R.drawable.ic_grid);
                    viewFlag = true;
                }else {

                    GridLayoutManager layoutManager = new GridLayoutManager(mContext,2);
                    layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRecyclerView.setLayoutManager(layoutManager);
                    adapter.setViewType(VoucherAdapter.GRID);
                    item.setIcon(R.drawable.ic_list);
                    viewFlag = false;
                }
                break;

        }


        return true;
    }

    private void loadRandomData(){
        ArrayList<Voucher> randomList = new ArrayList<Voucher>();
        for (int i=1; i<20; i++){
            Voucher voucher = new Voucher();
            voucher.setDealPrice(100);
            voucher.setDealTitle("Custom Title");
            randomList.add(voucher);
        }
        adapter.addData(randomList);
    }


}
