package com.rin1903.bookstoremanager.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rin1903.bookstoremanager.R;
import com.rin1903.bookstoremanager.SQLite.NHACUNGCAP;

import java.util.ArrayList;

public class NhaCungCapAdapter extends RecyclerView.Adapter<NhaCungCapAdapter.ViewHolder> {
    private ArrayList<NHACUNGCAP> nhacungcapArrayList;
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.item_list_hienthi_cohinh,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_tieude.setText(nhacungcapArrayList.get(position).getTENNHACUNGCAP());
        holder.tv_mota.setText(nhacungcapArrayList.get(position).getSDT_NCC());
        byte[] hinh = nhacungcapArrayList.get(position).getHINH_NHACUNGCAP();
        Bitmap bitmap= BitmapFactory.decodeByteArray(hinh,0,hinh.length);
        holder.img.setImageBitmap(bitmap);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_tieude,tv_mota;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tieude= itemView.findViewById(R.id.tv_tieude_item_cohinh_listview_hienthi);
            tv_mota= itemView.findViewById(R.id.tv_mota_item_cohinh_listview_hienthi);
            img= itemView.findViewById(R.id.image_item_cohinh_list_hienthi);
        }
    }
}
