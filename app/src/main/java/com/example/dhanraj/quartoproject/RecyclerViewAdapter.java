package com.example.dhanraj.quartoproject;



import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Room> mData;


    public RecyclerViewAdapter(Context mContext, List<Room> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_room, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        //holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.tv_book_title.setText(mData.get(position).getTitle());
       // holder.address_info.setText((CharSequence) mData.get(position).getDescription());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, Room_Activity.class);

                // passing data to the room activity
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Address",mData.get(position).getAddress());
                intent.putExtra("PhoneTitle",mData.get(position).getPhoneTitle());
                intent.putExtra("PhoneNumber",mData.get(position).getPhoneNumber());
                intent.putExtra("Features",mData.get(position).getFeatures());
                intent.putExtra("Feafea",mData.get(position).getFeafea());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                // start the activity
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;
       // TextView address_info;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = (TextView) itemView.findViewById(R.id.room_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.room_img_id);
         //   address_info=(TextView)itemView.findViewById()
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }


}
