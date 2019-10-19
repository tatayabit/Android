package com.tatayab.tatayab.ui.login;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.tatayab.tatayab.ui.home.HomeActivity;
import com.tatayab.tatayab.R;
import com.tatayab.tatayab.ui.signup.SignUpActivity;
import com.tatayab.tatayab.Utils.Utils;
import com.tatayab.tatayab.connecction.ApiClient;
import com.tatayab.tatayab.connecction.ApiInterface;
import com.tatayab.tatayab.model.LoginResponseParser;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private LoginViewModel loginViewModel;
    ImageView signupButton;
    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;
    ProgressBar loadingProgressBar;
    TextView Forgt_textView;
    ImageView faceBook_imageView;
    ImageView instagram_imageView;
    ImageView twitter_imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        InitializeViews();

        loginViewModel.getLoginFormState().observe(this, new Observer<LoginFormState>() {
            @Override
            public void onChanged(@Nullable LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });

      /*  loginViewModel.getLoginResult().observe(this, new Observer<LoginResult>() {
            @Override
            public void onChanged(@Nullable LoginResult loginResult) {
                if (loginResult == null) {
                    return;
                }
                loadingProgressBar.setVisibility(View.GONE);
                if (loginResult.getError() != null) {
                    showLoginFailed(loginResult.getError());
                }
                if (loginResult.getSuccess() != null) {
                 //   updateUiWithUser(loginResult.getSuccess());
                    Intent homeintent = new Intent(getApplicationContext(), HomesActivity.class);
                    startActivity(homeintent);

                }
                setResult(Activity.RESULT_OK);

                //Complete and destroy login activity once successful
              //  finish();


            }
        });*/

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
                loginViewModel.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginViewModel.login(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());


                    new AsyncApiCall(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString()).execute();
                }
                return false;
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingProgressBar.setVisibility(View.VISIBLE);


                if(Utils.isNetworkConnected(getApplicationContext())){

                    new AsyncApiCall(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString()).execute();

                    loadingProgressBar.setVisibility(View.INVISIBLE);

                }else{
                    Toast.makeText(getApplicationContext(),"Sorry you don't have internet connection!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void InitializeViews(){
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
        loadingProgressBar = findViewById(R.id.loading);
        signupButton = findViewById( R.id.SignUp_button);
// added for temp login need to remove
        usernameEditText.setText("m.roshan@tatayab.com");
        passwordEditText.setText("Ratnapura123");
        signupButton.setOnClickListener(this);

        Forgt_textView = findViewById(R.id.Forgt_textView);
        Forgt_textView.setOnClickListener(this);

        twitter_imageView= findViewById(R.id.twitter_imageView);
        faceBook_imageView= findViewById(R.id.faceBook_imageView);
        instagram_imageView= findViewById(R.id.instagram_imageView);

        instagram_imageView.setOnClickListener(this);
        faceBook_imageView.setOnClickListener(this);
        twitter_imageView.setOnClickListener(this);

    }

    private void callLoginApi(String email,String password) {

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Map<String, String> params = new HashMap<>();
        params.put("email",email);
        params.put("password",password);
        Call<LoginResponseParser> call = apiService.getLoginDetails(params);
        call.enqueue(new Callback<LoginResponseParser>() {
            @Override
            public void onResponse(Call<LoginResponseParser> call, Response<LoginResponseParser> response) {

                int statusCode = response.code();

                if (statusCode == 201) {
                    System.out.println("response"+response.body());
                    Toast.makeText(getApplicationContext(),"You loggedin successfully"+response.body().getUserProfile().getBFirstname(),Toast.LENGTH_SHORT).show();

                    Intent homeintent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(homeintent);

                } else {
                    Toast.makeText(getApplicationContext(),response.message(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getMessage());

            }
        });
    }

    private void updateUiWithUser(LoggedInUserView model) {
        String welcome = getString(R.string.welcome) + model.getDisplayName();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(@StringRes Integer errorString) {
        Toast.makeText(getApplicationContext(), errorString, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.SignUp_button){
            Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(intent);

        }else if(v.getId() == R.id.Forgt_textView){

        }
        else if(v.getId() == R.id.instagram_imageView){
            Uri webpage = Uri.parse("https://www.instagram.com/tatayab/");
            Intent myIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(myIntent);
        }
        else if(v.getId() == R.id.faceBook_imageView){
            Uri webpage = Uri.parse("https://www.facebook.com/TatayabCom/");
            Intent myIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(myIntent);

        }else if(v.getId() == R.id.twitter_imageView){
            Uri webpage = Uri.parse("https://twitter.com/tatayab/");
            Intent myIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(myIntent);
        }
    }

    private class AsyncApiCall extends AsyncTask<Void, Void, Void>


    {
        ProgressDialog pdLoading = new ProgressDialog(LoginActivity.this);

        String Useremail;
        String Userpassword;

        public AsyncApiCall( String email,String password) {
            Useremail = email;
            Userpassword = password;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
           /* loginViewModel.login(Useremail,
                   Userpassword);*/
            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.show();
        }
        @Override
        protected Void doInBackground(Void... params) {

            callLoginApi(Useremail,Userpassword);


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
