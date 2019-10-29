package com.example.a1718040_recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class DaftarAdapter extends RecyclerView.Adapter<DaftarAdapter.DaftarViewHolder>{
    private ArrayList<Daftar> dataList;

    public DaftarAdapter(ArrayList<Daftar> dataList) {

        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DaftarAdapter.DaftarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_daftar, parent, false);
        return new DaftarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarAdapter.DaftarViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtIsi.setText(dataList.get(position).getIsi());
        holder.gambarData.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class DaftarViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama;
        TextView txtIsi;
        ImageView gambarData;

        public DaftarViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtIsi = (TextView) itemView.findViewById(R.id.txt_isi);
            gambarData = (ImageView) itemView.findViewById(R.id.gambar_data);
        }
    }
}
