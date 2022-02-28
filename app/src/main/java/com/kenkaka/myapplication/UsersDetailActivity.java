package com.kenkaka.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class UsersDetailActivity extends AppCompatActivity implements View.OnClickListener{
@BindView(R.id.homeSearchButton)
    Button mUserButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_detail);

        mUserButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mUserButton) {
            Intent intent = new Intent(UsersDetailActivity.this, UserListActivity.class);
            startActivity(intent);
            finish();
        }
    }
}