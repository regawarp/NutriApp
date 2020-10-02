package com.nutriapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nutriapp.R;
import com.nutriapp.model.Bahan;

import java.util.ArrayList;

public class BahanAdapter extends RecyclerView.Adapter<BahanAdapter.BahanViewHolder> {
    private ArrayList<Bahan> bahanArrayList;
    private Context mContext;

    public BahanAdapter(Context mContext, ArrayList<Bahan> bahanArrayList) {
        this.mContext = mContext;
        this.bahanArrayList = bahanArrayList;
    }

    @NonNull
    @Override
    public BahanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_bahan_makanan, parent, false);
        return new BahanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BahanViewHolder holder, int position) {
        Bahan bahan = bahanArrayList.get(position);
        holder.imgBahan.setImageResource(bahan.getBahanImg());
        holder.tvNama.setText(bahan.getBahanName());
        holder.tvBerat.setText(bahan.getBahanBerat());
        holder.tvUrt.setText(bahan.getBahanUrt());
        holder.tvSatuan.setText(bahan.getBahanSatuan());
        holder.tvKeterangan.setText(bahan.getBahanKeterangan());
    }

    @Override
    public int getItemCount() {
        return bahanArrayList.size();
    }

    class BahanViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBahan;
        TextView tvNama, tvBerat, tvUrt, tvSatuan, tvKeterangan;

        BahanViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBahan = itemView.findViewById(R.id.img_bahan);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvBerat = itemView.findViewById(R.id.tv_berat);
            tvUrt = itemView.findViewById(R.id.tv_urt);
            tvSatuan = itemView.findViewById(R.id.tv_satuan);
            tvKeterangan = itemView.findViewById(R.id.tv_keterangan);
        }
    }
}
