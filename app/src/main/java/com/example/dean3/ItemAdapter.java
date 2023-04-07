package com.example.dean3;

import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH> {
    public ItemAdapter(ArrayList<Item> items, Listener listener) {
        this.items = items;
        this.listener = listener;
    }

    ArrayList<Item> items ;
    Listener listener;
    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.standeegrid,parent,false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH holder, int position) {
      Item item = items.get(position);
      holder.tvName.setText(item.getName());
      holder.Image.setImageResource(item.getImage());




      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              listener.onItemListener(item);

          }
      });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemVH extends RecyclerView.ViewHolder {
        TextView tvName;
        EditText edValue;
        Button btnPlus;
        Button btnMinus;

        ImageButton btnDelete;

          CircleImageView Image;
        public ItemVH(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.image);
            tvName= itemView.findViewById(R.id.tvName);
            edValue = itemView.findViewById(R.id.edValue);
            btnPlus= itemView.findViewById(R.id.btnplus);
            btnMinus=itemView.findViewById(R.id.btnminus);

            btnDelete=itemView.findViewById(R.id.btndelete);


        }
    }
    public interface Listener{
      void onItemListener(Item standee);
    }

}
