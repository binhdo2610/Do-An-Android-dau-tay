package com.example.dean3.TrangChu;

import android.icu.text.Transliterator;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dean3.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemTrangChuAdapter extends RecyclerView.Adapter<ItemTrangChuAdapter.ItemVH> {
    ArrayList<ItemTrangChu> itemsTrangChu;

    public ItemTrangChuAdapter(ArrayList<ItemTrangChu> list) {
    }

    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.standeetrangchu,parent,false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH holder, int position) {

        holder.circleImageView.setImageResource(ItemTrangChu.getImage());
        holder.name.setText(ItemTrangChu.getName());
        holder.price.setText((int) ItemTrangChu.getPrice());

    }

    @Override
    public int getItemCount() {
        return itemsTrangChu.size();
    }

    class ItemVH extends RecyclerView.ViewHolder{
        TextView name,price ;
        CircleImageView circleImageView;

        public ItemVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvNameH);
            price = itemView.findViewById(R.id.tvPriceH);
            circleImageView = itemView.findViewById(R.id.CircleView);
        }



    }
}
