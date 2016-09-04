package com.marktony.zhihudaily.custom_tab;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.marktony.zhihudaily.inner_browser.InnerBrowserActivity;

/**
 * Created by Lizhaotailang on 2016/9/4.
 */

public class CustomFallback implements CustomTabActivityHelper.CustomTabFallback {

    @Override
    public void openUri(Activity activity, Uri uri) {
        activity.startActivity(new Intent(activity, InnerBrowserActivity.class).putExtra("url", uri.toString()));
    }

}
