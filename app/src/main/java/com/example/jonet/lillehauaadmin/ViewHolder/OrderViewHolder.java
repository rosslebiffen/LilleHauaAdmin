package com.example.jonet.lillehauaadmin.ViewHolder;


import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jonet.lillehauaadmin.Interface.ItemClickListener;
import com.example.jonet.lillehauaadmin.R;

/**
 * Created by jonet on 24.09.2017.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder{

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;
    public Button btnEdit, btnRemove, btnDetail;


    public OrderViewHolder(View itemView) {
        super(itemView);

       // txtOrderAddress =(TextView)itemView.findViewById(R.id.order_address);
        txtOrderStatus =(TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone =(TextView)itemView.findViewById(R.id.order_phone);
        txtOrderId =(TextView)itemView.findViewById(R.id.order_id);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);





    }






}
