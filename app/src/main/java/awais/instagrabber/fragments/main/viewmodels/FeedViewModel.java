package awais.instagrabber.fragments.main.viewmodels;

import androidx.lifecycle.MutableLiveData;

import java.util.Collections;
import java.util.List;

import awais.instagrabber.models.FeedModel;

public class FeedViewModel extends BasePostViewModel<FeedModel> {
    private MutableLiveData<List<FeedModel>> list;

    public MutableLiveData<List<FeedModel>> getList() {
        if (list == null) {
            list = new MutableLiveData<>(Collections.emptyList());
        }
        return list;
    }
}