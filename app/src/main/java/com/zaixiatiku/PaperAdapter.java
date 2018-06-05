package com.zaixiatiku;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

public class PaperAdapter extends RecyclerView.Adapter<PaperAdapter.ViewHolder> {

    private List<Paper> mPaperList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.paper_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    public PaperAdapter(List<Paper> paperList) {
        mPaperList = paperList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Paper paper = mPaperList.get(position);
        holder.title.setText(paper.getTitle());
        holder.subTitle.setText(paper.getSubTitle());
    }

    @Override
    public int getItemCount() {
        return mPaperList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView subTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subTitle = itemView.findViewById(R.id.sub_title);
        }
    }
}
