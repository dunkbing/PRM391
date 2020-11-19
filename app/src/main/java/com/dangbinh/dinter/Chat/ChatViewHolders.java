package com.dangbinh.dinter.Chat;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dangbinh.dinter.R;

/**
 * Created by dangbinh on 18/11/2020.
 */

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView mMessage;
    public LinearLayout mContainer;
    public ChatViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        mMessage = itemView.findViewById(R.id.text_view_message);
        mContainer = itemView.findViewById(R.id.item_chat_container);
    }

    @Override
    public void onClick(View view) {
    }
}