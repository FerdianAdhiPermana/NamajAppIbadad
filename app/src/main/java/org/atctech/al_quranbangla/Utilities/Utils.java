package org.atctech.al_quranbangla.Utilities;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Utils {


    public static final int[] ALARM_HOUR_TIME = {2, 3, 3, 12, 16, 18, 18, 20};
    public static final int[] ALARM_MINUTE_TIME = {0, 30, 45, 45, 45, 20, 40, 5};

    public static String getBnNumber(String paramString) {
        return paramString.replace("0", "০").replace("1", "১").replace("2", "২").replace("3", "৩").replace("4", "৪").replace("5", "৫").replace("6", "৬").replace("7", "৭").replace("8", "৮").replace("9", "৯");
    }

    public static int getPreferencesInt(String key, Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        int userName = sharedPreferences.getInt(key, 0);
        return userName;
    }

    public static boolean savePreferencesInt(String key, int value,
                                             Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    public static final String getString(Activity paramActivity, String paramString)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramActivity).getString(paramString, "");
    }

    public static final boolean putInt(Context paramContext, String paramString, int paramInt)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putInt(paramString, paramInt).commit();
    }

    public static final boolean putString(Context paramContext, String paramString1, String paramString2)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putString(paramString1, paramString2).commit();
    }

    public static final int getInt(Context paramContext, String paramString)
    {
        return PreferenceManager.getDefaultSharedPreferences(paramContext).getInt(paramString, 0);
    }
}
