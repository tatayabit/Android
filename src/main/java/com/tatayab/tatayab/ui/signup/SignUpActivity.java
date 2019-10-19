package com.tatayab.tatayab.ui.signup;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.tatayab.tatayab.R;
import com.tatayab.tatayab.connecction.ApiClient;
import com.tatayab.tatayab.connecction.ApiInterface;
import com.tatayab.tatayab.model.SignUpResponseParser;
import com.tatayab.tatayab.ui.login.LoginActivity;

import java.util.HashMap;
import java.util.Map;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editFullName;
    EditText editEmail;
    EditText editPassword;
    EditText editphoneNumber;
    Button  SignupButton;
    Integer alertindentifier;
    TextView Signin_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        InitializeViews();
    }

    public void InitializeViews() {

        editEmail = findViewById(R.id.Email_editText);
        editFullName = findViewById(R.id.Name_editText);
        editphoneNumber = findViewById(R.id.Phone_editText);
        editPassword = findViewById(R.id.Password_editText);
        SignupButton = findViewById(R.id.Signupreg_button);
        SignupButton.setOnClickListener(this);
        Signin_textView = findViewById(R.id.Signin_textView);
        Signin_textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.Signupreg_button) {

            if(ValidationUtils()){

                callLoginSignUpApi();
            }else{
                AlertDialog();
            }
        }
        if(v.getId() == R.id.Signin_textView){
            Intent homeintent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(homeintent);
            finish();

        }
    }

    public boolean ValidationUtils() {

        if(editFullName.getText().toString().isEmpty()||editFullName.getText().toString().equals("")){

            alertindentifier=0;

            return false;
        }else if(editEmail.getText().toString().isEmpty()||editEmail.getText().toString().equals("")){

            alertindentifier=1;

            return false;
        } else if(editPassword.getText().toString().isEmpty()||editPassword.getText().toString().equals("")){

            alertindentifier=2;

            return false;
        } else if(editphoneNumber.getText().toString().isEmpty()||editphoneNumber.getText().toString().equals("")){

            alertindentifier=3;

            return false;
        }
        return true;

    }

    public void AlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this,R.style.DialogTheme);
        builder.setTitle("Alert");
        if(alertindentifier==0){
            builder.setMessage("Please enter the Full Name!!");
        }else if(alertindentifier==1){
            builder.setMessage("Please enter the Email!!");
        }else if(alertindentifier==2){
            builder.setMessage("Please enter the Password!!");
        }else if(alertindentifier==3){
            builder.setMessage("Please enter the Phone!!");
        }else if(alertindentifier==4){
            builder.setMessage("You have signed up successfully. Login to continue!");
        }

        builder.setCancelable(true);

        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                        if(alertindentifier==4){
                            Intent homeintent = new Intent(getApplicationContext(), LoginActivity.class);
                            startActivity(homeintent);
                            finish();
                        }
                    }
                });


        builder.show();

    }

    private void callLoginSignUpApi() {

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Map<String, Object> params = new HashMap<>();
        params.put("firstname",editFullName.getText().toString());
        params.put("email",editEmail.getText().toString());
        params.put("password",editPassword.getText().toString());
        params.put("status","A");
        params.put("user_type","C");
        params.put("company_id",1);
        Call<SignUpResponseParser> call = apiService.SignUpnNewUsers(params);
        call.enqueue(new Callback<SignUpResponseParser>() {
            @Override
            public void onResponse(Call<SignUpResponseParser> call, Response<SignUpResponseParser> response) {

                int statusCode = response.code();

                if (statusCode == 201) {
                    System.out.println("response"+response.body());
                    alertindentifier=4;
                    AlertDialog();



                } else {
                    Toast.makeText(getApplicationContext(),response.message(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SignUpResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getMessage());

            }
        });
    }
}
