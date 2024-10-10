package c.c.a.a.c.l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import b.f.h;
import c.c.a.a.b.b;
import c.c.a.a.c.f;
import c.c.a.a.c.i;
import c.c.a.a.c.p.a;
import c.c.a.a.c.p.b;
import javax.annotation.concurrent.GuardedBy;

public final class d {
  @GuardedBy("sCache")
  public static final h<String, String> a = new h();
  
  public static String a(Context paramContext) {
    String str = paramContext.getPackageName();
    try {
      a a = b.a(paramContext);
      return a.a.getPackageManager().getApplicationLabel(a.a.getPackageManager().getApplicationInfo(str, 0)).toString();
    } catch (android.content.pm.PackageManager.NameNotFoundException|NullPointerException nameNotFoundException) {
      String str1 = (paramContext.getApplicationInfo()).name;
      return TextUtils.isEmpty(str1) ? str : str1;
    } 
  }
  
  public static String b(Context paramContext) {
    return paramContext.getResources().getString(b.common_google_play_services_notification_channel_name);
  }
  
  public static String c(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    String str = a(paramContext);
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 5) {
            if (paramInt != 7) {
              if (paramInt != 9) {
                if (paramInt != 20) {
                  switch (paramInt) {
                    default:
                      return resources.getString(i.common_google_play_services_unknown_issue, new Object[] { str });
                    case 18:
                      return resources.getString(b.common_google_play_services_updating_text, new Object[] { str });
                    case 17:
                      return f(paramContext, "common_google_play_services_sign_in_failed_text", str);
                    case 16:
                      break;
                  } 
                  return f(paramContext, "common_google_play_services_api_unavailable_text", str);
                } 
                return f(paramContext, "common_google_play_services_restricted_profile_text", str);
              } 
              return resources.getString(b.common_google_play_services_unsupported_text, new Object[] { str });
            } 
            return f(paramContext, "common_google_play_services_network_error_text", str);
          } 
          return f(paramContext, "common_google_play_services_invalid_account_text", str);
        } 
        return resources.getString(b.common_google_play_services_enable_text, new Object[] { str });
      } 
      return q.J(paramContext) ? resources.getString(b.common_google_play_services_wear_update_text) : resources.getString(b.common_google_play_services_update_text, new Object[] { str });
    } 
    return resources.getString(b.common_google_play_services_install_text, new Object[] { str });
  }
  
  public static String d(Context paramContext, int paramInt) {
    StringBuilder stringBuilder;
    String str;
    Resources resources = paramContext.getResources();
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unexpected error code ");
        stringBuilder.append(paramInt);
        str = stringBuilder.toString();
        Log.e("GoogleApiAvailability", str);
        return null;
      case 20:
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return e((Context)str, "common_google_play_services_restricted_profile_title");
      case 17:
        Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
        return e((Context)str, "common_google_play_services_sign_in_failed_title");
      case 16:
        str = "One of the API components you attempted to connect to is not available.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 11:
        str = "The application is not licensed to the user.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 10:
        str = "Developer error occurred. Please see logs for detailed information";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 9:
        str = "Google Play services is invalid. Cannot recover.";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 8:
        str = "Internal error occurred. Please see logs for detailed information";
        Log.e("GoogleApiAvailability", str);
        return null;
      case 7:
        Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
        return e((Context)str, "common_google_play_services_network_error_title");
      case 5:
        Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
        return e((Context)str, "common_google_play_services_invalid_account_title");
      case 4:
      case 6:
      case 18:
        return null;
      case 3:
        return resources.getString(b.common_google_play_services_enable_title);
      case 2:
        return resources.getString(b.common_google_play_services_update_title);
      case 1:
        break;
    } 
    return resources.getString(b.common_google_play_services_install_title);
  }
  
  public static String e(Context paramContext, String paramString) {
    synchronized (a) {
      String str2 = (String)a.getOrDefault(paramString, null);
      if (str2 != null)
        return str2; 
      Resources resources = f.d(paramContext);
      if (resources == null)
        return null; 
      int i = resources.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Missing resource: ".concat(str1);
        } else {
          str1 = new String("Missing resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      String str1 = str1.getString(i);
      if (TextUtils.isEmpty(str1)) {
        str1 = String.valueOf(paramString);
        if (str1.length() != 0) {
          str1 = "Got empty resource: ".concat(str1);
        } else {
          str1 = new String("Got empty resource: ");
        } 
        Log.w("GoogleApiAvailability", str1);
        return null;
      } 
      a.put(paramString, str1);
      return str1;
    } 
  }
  
  public static String f(Context paramContext, String paramString1, String paramString2) {
    Resources resources = paramContext.getResources();
    paramString1 = e(paramContext, paramString1);
    String str = paramString1;
    if (paramString1 == null)
      str = resources.getString(i.common_google_play_services_unknown_issue); 
    return String.format((resources.getConfiguration()).locale, str, new Object[] { paramString2 });
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */