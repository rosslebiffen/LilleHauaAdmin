package com.example.jonet.lillehauaadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.jonet.lillehauaadmin.Common.Common;
import com.example.jonet.lillehauaadmin.Model.MyResponse;
import com.example.jonet.lillehauaadmin.Model.Notification;
import com.example.jonet.lillehauaadmin.Model.Sender;
import com.example.jonet.lillehauaadmin.Remote.APIService;
import com.rengwuxian.materialedittext.MaterialEditText;

import info.hoang8f.widget.FButton;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendMessage extends AppCompatActivity {

    MaterialEditText edtMessage, edtTitle;
    FButton btnSend;

    APIService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        mService = Common.getFCMClient();

        edtMessage = (MaterialEditText)findViewById(R.id.edtMessage);
        edtTitle = (MaterialEditText)findViewById(R.id.edtTitle);

        btnSend = (FButton)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create Message
                Notification notification = new Notification(edtTitle.getText().toString(),edtMessage.getText().toString());

                Sender toTopic = new Sender();
                toTopic.to = new StringBuilder("/topics/").append(Common.topicName).toString();
                toTopic.notification = notification;
                edtMessage.setText(notification.toString());

                mService.sendNotification(toTopic)
                        .enqueue(new Callback<MyResponse>() {
                            @Override
                            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                                if(response.isSuccessful())
                                    Toast.makeText(SendMessage.this, "Message sent", Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onFailure(Call<MyResponse> call, Throwable t) {
                                Toast.makeText(SendMessage.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });

    }
}
