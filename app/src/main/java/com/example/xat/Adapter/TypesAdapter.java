package com.example.xat.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xat.Constructor.Types;
import com.example.xat.PagesActivity;
import com.example.xat.R;

import java.util.List;

public class TypesAdapter extends RecyclerView.Adapter<TypesAdapter.TypesViewHolder> {

    Context context;
    List<Types> types;

    public TypesAdapter(Context context, List<Types> types) {
        this.context = context;
        this.types = types;
    }

    @NonNull
    @Override
    public TypesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View typesItems = LayoutInflater.from(context).inflate(R.layout.types_item, parent, false);
        return new TypesAdapter.TypesViewHolder(typesItems);
    }

    @Override
    public void onBindViewHolder(@NonNull TypesAdapter.TypesViewHolder holder, int position) {

        int imageId = context.getResources().getIdentifier("ic_" + types.get(position).getImg(), "drawable", context.getPackageName());
        holder.typesImage.setImageResource(imageId);
        holder.typesTitle.setText(types.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PagesActivity.class);
                //intent.putExtra("typesBg", Color.parseColor(types.get(holder.getAdapterPosition()).getColor()));
                intent.putExtra("typesImage", imageId);
                intent.putExtra("typesTitle", types.get(holder.getAdapterPosition()).getTitle());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return types.size();
    }

    public static final class TypesViewHolder extends RecyclerView.ViewHolder{

        ImageView typesImage;
        TextView typesTitle;

        public TypesViewHolder(@NonNull View itemView) {
            super(itemView);

            typesImage = itemView.findViewById(R.id.typesImage);
            typesTitle = itemView.findViewById(R.id.typesTitle);
        }
    }
}
