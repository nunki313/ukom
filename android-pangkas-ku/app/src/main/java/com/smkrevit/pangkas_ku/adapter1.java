package com.smkrevit.pangkas_ku;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter1 extends RecyclerView.Adapter<adapter1.ViewHolder> {

    List<model1> model1List;

    public adapter1(List<model1> modelList) {
        this.model1List = modelList;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_1, viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
//    model1 model1 =model1List.get(i);
    holder.tvpangkas.setText(model1List.get(i).getMenu());
    holder.tvalamat.setText(model1List.get(i).getAlamat());
    holder.crdvi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            i
        }
    });

    }


    @Override
    public int getItemCount() {
        return model1List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvpangkas, tvalamat;
        CardView crdvi;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            crdvi = itemView.findViewById(R.id.beranda3);

            tvpangkas =itemView.findViewById(R.id.tvpangkas);
            tvalamat =itemView.findViewById(R.id.tvalamat);
        }

    }

}
