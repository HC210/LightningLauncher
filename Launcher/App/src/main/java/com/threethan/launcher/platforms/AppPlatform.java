package com.threethan.launcher.platforms;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

public class AppPlatform extends AbstractPlatform {
    @Override
    public boolean isSupported(Context context) {
        return true;
    }

    @Override
    public void runApp(Context context, PackageInfo appInfo) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(appInfo.packageName);
        context.startActivity(launchIntent);
    }
}
