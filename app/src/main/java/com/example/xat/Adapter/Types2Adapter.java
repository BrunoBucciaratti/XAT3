package com.example.xat.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xat.Constructor.Types2;
import com.example.xat.PagesActivity;
import com.example.xat.R;

import java.util.List;

public class Types2Adapter extends RecyclerView.Adapter<Types2Adapter.Types2ViewHolder> {

    Context context;
    List<Types2> types2;

    public Types2Adapter(Context context, List<Types2> types2) {
        this.context = context;
        this.types2 = types2;
    }

    @NonNull
    @Override
    public Types2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View types2Items = LayoutInflater.from(context).inflate(R.layout.types2_item, parent, false);
        return new Types2Adapter.Types2ViewHolder(types2Items);
    }

    @Override
    public void onBindViewHolder(@NonNull Types2Adapter.Types2ViewHolder holder, int position) {
        int imageId = context.getResources().getIdentifier("ic_" + types2.get(position).getImg(), "drawable", context.getPackageName());
        holder.types2Image.setImageResource(imageId);
        holder.types2Title.setText(types2.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PagesActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return types2.size();
    }

    public static final class Types2ViewHolder extends RecyclerView.ViewHolder{

        ImageView types2Image;
        TextView types2Title;

        public Types2ViewHolder(@NonNull View itemView) {
            super(itemView);

            types2Image = itemView.findViewById(R.id.types2Image);
            types2Title = itemView.findViewById(R.id.types2Title);
        }
    }
}
