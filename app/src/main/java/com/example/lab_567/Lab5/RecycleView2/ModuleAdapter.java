package com.example.lab_567.Lab5.RecycleView2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_567.R;

import java.util.List;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {
    private List<Module> modules;

    public ModuleAdapter(List<Module> modules) {
        this.modules = modules;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View userView = inflater.inflate(R.layout.row_module, parent, false);
        ViewHolder viewHolder = new ViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Module module = modules.get(position);
        holder.imageModule.setImageResource(module.getImage());
        holder.tvDescription.setText(module.getDescription());
        holder.tvName.setText(module.getName());
        holder.tvTitle.setText(module.getTitle());

    }

    @Override
    public int getItemCount() {
        return modules.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageModule;
        TextView tvName;
        TextView tvDescription;
        TextView tvTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageModule = itemView.findViewById(R.id.imageModule);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvName = itemView.findViewById(R.id.tvName);
            tvTitle = itemView.findViewById(R.id.tvTitle);

        }
    }
}
