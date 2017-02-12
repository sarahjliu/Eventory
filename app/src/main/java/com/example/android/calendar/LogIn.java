package com.example.android.calendar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {

        private EditText et_name, et_email, et_phone, et_password, et_cpassword;
        private String name, email, phone, password, cpassword;
        Button regbtn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            et_name = (EditText) findViewById(R.id.name);
            et_email = (EditText) findViewById(R.id.email);
            et_phone = (EditText) findViewById(R.id.phone);
            et_password = (EditText) findViewById(R.id.password);
            et_cpassword = (EditText) findViewById(R.id.cpassword);
            regbtn = (Button) findViewById(R.id.regbtn);
            regbtn.setOnClickListener(new View.onClickListener() {
                @Override
                public void onClick(View view) {
                    register();
                }
            });

        /*public void register() {
            intialize();
            if (!validate()) {
                Toast.makeText(this,"Signup has Failed",Toast.LENGTH_SHORT.show());
            }
            else {
                onSignupSuccess();
            }
        }
        public void onSignupSuccess() {
            intialize();
            if (validate()) {
                Toast.makeText(this,"Signup is Successfull",Toast.LENGTH_SHORT.show());
            }
        }*/
        public boolean validate() {
            boolean valid = true;
            if(name.isEmpty()||name.length()>32) {
                et_name.setError("Please Enter Valid Name");
                valid = false;
            }
            if(email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                et_email.setError("Please Enter Valid Email");
                valid = false;
            }
            if(password.isEmpty()) {
                et_password.setError("Please Enter Password");
                valid = false;
            }
            if(cpassword.isEmpty()) {
                et_cpassword.setError("Please Enter Password");
            }
            if(phone.isEmpty()) {
                et_phone.setError("Please Enter Phone Number");
            }
            return valid;
        }
        public void intialize() {
            name = et_name.getText().toString().trim();
            email = et_email.getText().toString().trim();
            phone = et_phone.getText().toString().trim();
            password = et_password.getText().toString().trim();
            cpassword = et_cpassword.getText().toString().trim();
        }

    }
}

}
