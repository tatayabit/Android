package com.tatayab.tatayab.ui.concierge;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConciergeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConciergeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}