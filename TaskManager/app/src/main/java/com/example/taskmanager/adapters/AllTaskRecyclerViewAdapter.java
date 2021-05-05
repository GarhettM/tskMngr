package com.example.taskmanager.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskmanager.R;
import com.example.taskmanager.models.TaskItem;

import java.util.ArrayList;
import java.util.List;

public class AllTaskRecyclerViewAdapter extends RecyclerView.Adapter<AllTaskRecyclerViewAdapter.AllTaskViewHolder> {

    static String TAG = "gmorgan.Adapter";
    List<TaskItem> taskInputs;
    TaskListener taskListener;

    public AllTaskRecyclerViewAdapter(List<TaskItem> taskInputs, TaskListener taskListener) {
        this.taskInputs = taskInputs;
        this.taskListener = taskListener;
    }

    @NonNull
    @Override
    public AllTaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View fragment = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view, parent, false);

        return new AllTaskViewHolder(fragment);
    }

    @Override
    public int getItemCount() {
        return taskInputs.size();
    }

    @Override
    public void onBindViewHolder(@NonNull AllTaskViewHolder holder, int position) {
        holder.task = taskInputs.get(position);
        ((TextView)holder.itemView.findViewById(R.id.tasks)).setText(holder.task.name);
    }

    public static class AllTaskViewHolder extends RecyclerView.ViewHolder {
        public TaskItem task;
        public View itemView;

        public AllTaskViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }

    public static interface TaskListener {
        public void listener(TaskItem taskItem);
    }
}
