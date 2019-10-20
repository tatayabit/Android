package com.tatayab.tatayab.ui.signup;



import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;

import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.tatayab.tatayab.R;
import com.tatayab.tatayab.SharedPreference;

import com.tatayab.tatayab.connecction.ApiClient;
import com.tatayab.tatayab.connecction.ApiInterface;
import com.tatayab.tatayab.model.ErrorResponseParser;
import com.tatayab.tatayab.model.SignUpResponseParser;
import com.tatayab.tatayab.ui.login.LoginActivity;

import java.util.HashMap;
import java.util.Map;


import cn.pedant.SweetAlert.SweetAlertDialog;

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
    SweetAlertDialog sweetAlertDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        InitializeViews();

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // ignore
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // ignore
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        editphoneNumber.addTextChangedListener(afterTextChangedListener);
        editphoneNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    if(ValidationUtils()){

                        new AsyncApiCall().execute();
                    }else{
                        AlertDialog();
                    }

                }
                return false;
            }
        });


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
        Spannable wordtoSpan = new SpannableString("Already have an Account? Sign in");
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.parseColor("#8399A4")), 0, 23, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.parseColor("#74562B")), 24, 32, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Signin_textView.setText(wordtoSpan);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.Signupreg_button) {

            if(ValidationUtils()){
                new AsyncApiCall().execute();
            }else{
                AlertDialog();
            }
        }
        if(v.getId() == R.id.Signin_textView){
            Intent homeintent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(homeintent);
            finish();

        }
        if(v.getId() == R.id.confirm_button){
            Intent homeintent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(homeintent);
            finish();
        }
    }

    public boolean ValidationUtils() {

        if(editFullName.getText().toString().isEmpty()||editFullName.getText().toString().equals("")){

            alertindentifier=0;

            return false;
        }else if(editEmail.getText().toString().isEmpty()||editEmail.getText().toString().equals("")||!editEmail.getText().toString().contains("@")){


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


        SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE);
        sweetAlertDialog.setTitleText("Oops...");

        if(alertindentifier==0){
            sweetAlertDialog.setContentText("Please enter the Full Name!!");
        }else if(alertindentifier==1){
            sweetAlertDialog.setContentText("Please enter the valid Email!!");
        }else if(alertindentifier==2){
            sweetAlertDialog.setContentText("Please enter the Password!!");
        }else if(alertindentifier==3){
            sweetAlertDialog.setContentText("Please enter the Phone!!");
        }


        sweetAlertDialog.show();

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
                System.out.println("response are "+response);
                if (statusCode == 201) {
                    System.out.println("response"+response.body());
                    alertindentifier=4;

                    SharedPreference.setUserId(getApplicationContext(),"UserId",response.body().getUserId());
                    SharedPreference.setProfileId(getApplicationContext(),"ProfileId",response.body().getProfileId().toString());

                    sweetAlertDialog1 = new SweetAlertDialog(SignUpActivity.this, SweetAlertDialog.SUCCESS_TYPE);
                    sweetAlertDialog1.setContentText("You have signed up successfully. Login to continue!");
                    sweetAlertDialog1.show();

                    sweetAlertDialog1.findViewById(R.id.confirm_button).setOnClickListener(SignUpActivity.this);



                } else {
                    Gson gson = new Gson();
                    ErrorResponseParser errorResponse = gson.fromJson(response.errorBody().charStream(), ErrorResponseParser.class);
                    if (errorResponse.getStatus() == 400) {

                        sweetAlertDialog1 = new SweetAlertDialog(SignUpActivity.this, SweetAlertDialog.WARNING_TYPE);
                        Spanned alertString = Html.fromHtml(errorResponse.getMessage().replace("Bad Request:",""));
                        sweetAlertDialog1.setContentText(alertString.toString());
                        sweetAlertDialog1.show();



                    } else {

                        sweetAlertDialog1 = new SweetAlertDialog(SignUpActivity.this, SweetAlertDialog.WARNING_TYPE);
                        Spanned alertString = Html.fromHtml(errorResponse.getMessage().replace("Bad Request:",""));
                        sweetAlertDialog1.setContentText(errorResponse.getMessage());
                        sweetAlertDialog1.show();

                    }
                }



            }

            @Override
            public void onFailure(Call<SignUpResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getLocalizedMessage());

            }
        });
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if (sweetAlertDialog1 != null && sweetAlertDialog1.isShowing()) {
            sweetAlertDialog1.dismiss();
        }
    }

    private class AsyncApiCall extends AsyncTask<Void, Void, Void>


    {
        ProgressDialog pdLoading = new ProgressDialog(SignUpActivity.this);




        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.show();
        }
        @Override
        protected Void doInBackground(Void... params) {

            callLoginSignUpApi();


            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            //this method will be running on UI thread

            pdLoading.dismiss();
        }



    }
}
