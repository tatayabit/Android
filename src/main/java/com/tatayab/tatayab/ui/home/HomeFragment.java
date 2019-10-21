package com.tatayab.tatayab.ui.home;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.tatayab.tatayab.R;

import com.tatayab.tatayab.SharedPreference;
import com.tatayab.tatayab.adapaters.FirstImageAdapter;
import com.tatayab.tatayab.adapaters.MainCategoryAdapter;
import com.tatayab.tatayab.adapaters.RecyclerviewMainCategoryAdapter;
import com.tatayab.tatayab.adapaters.TrendingAdapter;
import com.tatayab.tatayab.connecction.ApiClient;
import com.tatayab.tatayab.connecction.ApiInterface;
import com.tatayab.tatayab.model.BannerResponseParser;
import com.tatayab.tatayab.model.MainCategoryListResponseParser;
import com.tatayab.tatayab.model.TrendingResponseParser;
import com.tatayab.tatayab.ui.login.LoginActivity;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cn.pedant.SweetAlert.SweetAlertDialog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    Button templogout_button;
    private static ViewPager BannermPager,maincategory_pager,trending_pager;
    private static int currentPage,currentMainPage = 0,currentTrending = 0;
    private static int NUM_PAGES = 0,mainPages=0,trending_pages=0;
    CirclePageIndicator banner_indicator,maincategory_indicator,trending_indicator;

    private ArrayList<BannerResponseParser.Banner> bannerArrayList = new ArrayList<BannerResponseParser.Banner>();
    private ArrayList<MainCategoryListResponseParser.Category> mainCategoryArrayList = new ArrayList<MainCategoryListResponseParser.Category>();
    private ArrayList<TrendingResponseParser.Banner> TrendingArrayList = new ArrayList<TrendingResponseParser.Banner>();

    private RecyclerView mainCategoryRecyclerView;
    private RecyclerviewMainCategoryAdapter mainCategoryAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        templogout_button = root.findViewById(R.id.bbtemplogout_button);
        banner_indicator = (CirclePageIndicator)root.findViewById(R.id.banner_indicator);

        banner_indicator.setViewPager(BannermPager);


        trending_indicator =(CirclePageIndicator)root.findViewById(R.id.trending_indicator);
                trending_indicator.setViewPager(trending_pager);

        mainCategoryRecyclerView = (RecyclerView)root.findViewById(R.id.RecyclerViewMainlList);
        mainCategoryAdapter = new RecyclerviewMainCategoryAdapter(mainCategoryArrayList,getActivity());
        new AsyncApiBannerCall ().execute();
        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        banner_indicator.setRadius(5 * density);



        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                BannermPager.setCurrentItem(currentPage++, true);

                if (currentTrending == trending_pages) {
                    currentTrending = 0;
                }
                trending_pager.setCurrentItem(currentTrending++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 1000, 1000);



        // Pager listener over indicator
        banner_indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

        BannermPager = (ViewPager) root.findViewById(R.id.banner_pager);

        trending_pager = (ViewPager)root.findViewById(R.id.trending_pager);

        templogout_button.setOnClickListener(this);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
              //  textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onClick(View v) {
    /*    if(v.getId()==R.id.){
            //code to logout
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
            editor.commit();

            Intent i = new Intent(getActivity(),LoginActivity.class);
            startActivity(i);
            getActivity().finish();


        }*/
    }

    private class AsyncApiBannerCall extends AsyncTask<Void, Void, Void>


    {
        ProgressDialog pdLoading = new ProgressDialog(getActivity().getApplicationContext());


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
          //  pdLoading.setMessage("\tLoading...");
           // pdLoading.show();
        }
        @Override
        protected Void doInBackground(Void... params) {

            callBannerApi();
            callMainCategoryApi();
            callTrendingApi();
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            //this method will be running on UI thread

           // pdLoading.dismiss();
        }



    }

    public void  callBannerApi(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<BannerResponseParser> call = apiService.getHeaderBanners();
        call.enqueue(new Callback<BannerResponseParser>() {
            @Override
            public void onResponse(Call<BannerResponseParser> call, Response<BannerResponseParser> response) {

                int statusCode = response.code();

                if (statusCode == 200) {

                    bannerArrayList.addAll(response.body().getBanners());
                    NUM_PAGES = bannerArrayList.size();
                    BannermPager.setAdapter(new FirstImageAdapter(getActivity(),bannerArrayList));

                } else {

                    SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(getActivity(), SweetAlertDialog.ERROR_TYPE);
                    sweetAlertDialog.setTitleText("Oops...");
                    sweetAlertDialog.setContentText(response.message());
                    sweetAlertDialog.show();
                }
            }

            @Override
            public void onFailure(Call<BannerResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getMessage());

            }
        });

    }

    public void callMainCategoryApi(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<MainCategoryListResponseParser> call = apiService.getMainCategoriesList();
        call.enqueue(new Callback<MainCategoryListResponseParser>() {
            @Override
            public void onResponse(Call<MainCategoryListResponseParser> call, Response<MainCategoryListResponseParser> response) {

                int statusCode = response.code();

                if (statusCode == 200) {
                    mainCategoryArrayList.addAll(response.body().getCategories());
                    mainPages = mainCategoryArrayList.size();
                   // maincategory_pager.setAdapter(new MainCategoryAdapter(getActivity(),mainCategoryArrayList));

                    mainCategoryRecyclerView.setAdapter(new RecyclerviewMainCategoryAdapter(mainCategoryArrayList,getActivity()));

                } else {

                    SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(getActivity(), SweetAlertDialog.ERROR_TYPE);
                    sweetAlertDialog.setTitleText("Oops...");
                    sweetAlertDialog.setContentText(response.message());
                    sweetAlertDialog.show();
                }
            }

            @Override
            public void onFailure(Call<MainCategoryListResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getMessage());

            }
        });
    }

    public void callTrendingApi(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<TrendingResponseParser> call = apiService.getTrendingList();
        call.enqueue(new Callback<TrendingResponseParser>() {
            @Override
            public void onResponse(Call<TrendingResponseParser> call, Response<TrendingResponseParser> response) {

                int statusCode = response.code();

                if (statusCode == 200) {
                    TrendingArrayList.addAll(response.body().getBanners());
                    trending_pages = TrendingArrayList.size();
                    trending_pager.setAdapter(new TrendingAdapter(getActivity(),TrendingArrayList));



                } else {

                    SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(getActivity(), SweetAlertDialog.ERROR_TYPE);
                    sweetAlertDialog.setTitleText("Oops...");
                    sweetAlertDialog.setContentText(response.message());
                    sweetAlertDialog.show();
                }
            }

            @Override
            public void onFailure(Call<TrendingResponseParser> call, Throwable t) {
                System.out.println("err val"+t.getMessage());

            }
        });
    }
}