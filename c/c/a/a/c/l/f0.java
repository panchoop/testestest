package c.c.a.a.c.l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class f0 {
  static {
    Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
  }
  
  public static Intent a(String paramString1, String paramString2) {
    Intent intent = new Intent("android.intent.action.VIEW");
    Uri.Builder builder = Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString1);
    if (!TextUtils.isEmpty(paramString2))
      builder.appendQueryParameter("pcampaignid", paramString2); 
    intent.setData(builder.build());
    intent.setPackage("com.android.vending");
    intent.addFlags(524288);
    return intent;
  }
  
  public static Intent b(String paramString) {
    Uri uri = Uri.fromParts("package", paramString, null);
    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    intent.setData(uri);
    return intent;
  }
  
  public static Intent c() {
    Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    intent.setPackage("com.google.android.wearable.app");
    return intent;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */