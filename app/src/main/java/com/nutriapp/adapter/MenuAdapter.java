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
import com.nutriapp.model.Menu;

import java.util.ArrayList;
import java.util.Locale;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private ArrayList<Menu> menuArrayList;
    private Context mContext;

    public MenuAdapter(Context mContext, ArrayList<Menu> menuArrayList) {
        this.mContext = mContext;
        this.menuArrayList = menuArrayList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_menu_makanan, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menu = menuArrayList.get(position);
        holder.imgMenu.setImageResource(menu.getImgMenu());
        holder.tvNamaMenu.setText(menu.getNamaMenu());
        holder.tvKaloriMenu.setText(String.format(Locale.getDefault(), "%d Kkal", menu.getKaloriMenu()));
    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }


    class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMenu;
        TextView tvNamaMenu, tvKaloriMenu;

        MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMenu = itemView.findViewById(R.id.img_menu);
            tvNamaMenu = itemView.findViewById(R.id.tv_nama_menu);
            tvKaloriMenu = itemView.findViewById(R.id.tv_kalori_menu);
        }
    }
}
