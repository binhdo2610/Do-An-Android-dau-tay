package com.example.dean3.TrangChu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dean3.Fragement.HistoryFragment;
import com.example.dean3.Item;
import com.example.dean3.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemHistoryAdapter extends RecyclerView.Adapter<ItemHistoryAdapter.HistoryVH> {
    public ItemHistoryAdapter(ArrayList<Item> items, HistoryFragment historyFragment) {
        this.items = items;
    }

    ArrayList<Item> items ;
    @NonNull
    @Override
    public HistoryVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lichsugiaohang,parent,false);
        return new HistoryVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryVH holder, int position) {
        Item item = items.get(position);
        holder.imgStandee.setImageResource(item.getImage());
        holder.tvName.setText(item.getName());

        holder.tvPrice.setText((int) item.getPrice());





    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class HistoryVH extends RecyclerView.ViewHolder{
        CircleImageView imgStandee ;
        TextView tvName , tvPrice ;

        public HistoryVH(@NonNull View itemView) {
            super(itemView);
            imgStandee = itemView.findViewById(R.id.imageH);
            tvName = itemView.findViewById(R.id.tvNameH);
            tvPrice = itemView.findViewById(R.id.tvPriceH);

        }
    }
}
