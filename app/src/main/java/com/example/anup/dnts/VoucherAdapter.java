package com.example.anup.dnts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by Anup on 10/18/2017.
 */

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Voucher> contentList;
    private static OnItemClickListener itemClickListener;
    private static OnItemLongClickListener itemLongClickListener;
    public static final int GRID = 0;
    public static final int LIST = 1;
    private int view_type = 0;

    public VoucherAdapter(Context mContext, ArrayList<Voucher> contentList) {
        this.mContext = mContext;
        this.contentList = contentList;
    }

    @Override
    public int getItemViewType(int position) {
        int layout;
        switch (view_type){
            case 0:
                layout = R.layout.row_voucher_card_grid;
                break;
            case 1:
                layout = R.layout.row_voucher_card_list;
                break;
            default:
                layout = R.layout.row_voucher_card_grid;
                break;
        }
        return layout;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Voucher voucher = contentList.get(position);
        String price = "\u09F3 " + voucher.getDealPrice();
        RequestOptions options = new RequestOptions()
        .placeholder(R.drawable.ic_placeholder);

        switch (view_type){
            case 0:
                holder.grid_dealPrice.setText(price);
                holder.grid_dealTitle.setText(voucher.getDealTitle());
                Glide.with(mContext)
                        .load(voucher.getImageLink())
                        .thumbnail(0.3f)
                        .apply(options)
                        .into(holder.grid_dealImg);
                break;
            case 1:
                holder.list_dealPrice.setText(price);
                holder.list_dealTitle.setText(voucher.getDealTitle());
                Glide.with(mContext)
                        .load(voucher.getImageLink())
                        .thumbnail(0.3f)
                        .apply(options)
                        .into(holder.list_dealImg);

                break;
        }



    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView grid_dealImg;
        TextView grid_dealPrice;
        TextView grid_dealTitle;

        ImageView list_dealImg;
        TextView list_dealPrice;
        TextView list_dealTitle;

        public MyViewHolder(View itemView) {
            super(itemView);



            switch (view_type){
                case 0:
                    grid_dealImg = itemView.findViewById(R.id.deal_card_img);
                    grid_dealPrice = itemView.findViewById(R.id.deal_card_price);
                    grid_dealTitle = itemView.findViewById(R.id.deal_card_title);
                    break;
                case 1:
                    list_dealImg = itemView.findViewById(R.id.deal_card_list_img);
                    list_dealTitle = itemView.findViewById(R.id.deal_card_list_title);
                    list_dealPrice = itemView.findViewById(R.id.deal_card_list_price);
                    break;
            }

        }
    }

    public void addList(ArrayList<Voucher> list){

        contentList.clear();
        contentList.addAll(list);
        notifyDataSetChanged();

    }

    public void addData(ArrayList<Voucher> list){
        int lastPosition = contentList.size();
        contentList.addAll(list);
        notifyItemRangeChanged(lastPosition,list.size());
    }

    public void clear(){
        contentList.clear();
        notifyDataSetChanged();
    }

    public void setOnItemClickListener (OnItemClickListener onItemClickListener){

        itemClickListener = onItemClickListener;

    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener){

        itemLongClickListener = onItemLongClickListener;
    }

    public void setViewType(int type){
        this.view_type = type;
    }



}
