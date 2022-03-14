package com.example.and1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    final private OnListItemClickListener mOnListItemClickListener;
    private ArrayList<ListObject> objects;

    ListAdapter(ArrayList<ListObject> listObjects, OnListItemClickListener listener) {
        objects = listObjects;
        mOnListItemClickListener = listener;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 1) {
            view = inflater.inflate(R.layout.list_layout_b, parent, false);
        } else {
            view = inflater.inflate(R.layout.list_layout, parent, false);
        }
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.name.setText(objects.get(position).getName());
        viewHolder.icon.setImageResource(objects.get(position).getIconId());
    }

    @Override
    public int getItemViewType(int position) {
        final ListObject dataObj = objects.get(position);
        System.out.println("position" + position);
        System.out.println("position 2 " + position / 2);
        if ((position + 1) % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public interface OnListItemClickListener {
        void onListItemClick(ListObject clickedItemIndex);
    }


    public int getItemCount() {
        return objects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        ImageView icon;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            icon = itemView.findViewById(R.id.iv_icon);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            mOnListItemClickListener.onListItemClick(objects.get(getBindingAdapterPosition()));
        }
    }
}
