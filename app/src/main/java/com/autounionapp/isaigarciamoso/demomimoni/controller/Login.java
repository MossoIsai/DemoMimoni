package com.autounionapp.isaigarciamoso.demomimoni.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.autounionapp.isaigarciamoso.demomimoni.R;

/**
 * Created by isaigarciamoso on 03/02/17.
 */

public class Login extends AppCompatActivity {

    private Button btnAccess;
    private EditText phoneUser;
    private EditText passwordUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       //Cargando vistas
        initView();

    }
    private void initView(){
        btnAccess = (Button)findViewById(R.id.btnEnter);
        phoneUser = (EditText) findViewById(R.id.textPhone);
        passwordUser = (EditText)findViewById(R.id.textPassword);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             switch (view.getId()){
                 case R.id.btnEnter:
                     
                 break;
             }

        }
    };


}
