package c.c.a.a.a.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.c.a.a.c.l.q;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

public class a {
  public static final Lock c = new ReentrantLock();
  
  @GuardedBy("sLk")
  public static a d;
  
  public final Lock a = new ReentrantLock();
  
  @GuardedBy("mLk")
  public final SharedPreferences b;
  
  public a(Context paramContext) {
    this.b = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static a a(Context paramContext) {
    q.f(paramContext);
    c.lock();
    try {
      if (d == null) {
        a a1 = new a();
        this(paramContext.getApplicationContext());
        d = a1;
      } 
      return d;
    } finally {
      c.unlock();
    } 
  }
  
  @Nullable
  public GoogleSignInAccount b() {
    StringBuilder stringBuilder1;
    String str = c("defaultGoogleSignInAccount");
    boolean bool = TextUtils.isEmpty(str);
    StringBuilder stringBuilder2 = null;
    if (bool) {
      stringBuilder1 = stringBuilder2;
    } else {
      stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 20);
      stringBuilder1.append("googleSignInAccount");
      stringBuilder1.append(":");
      stringBuilder1.append(str);
      str = c(stringBuilder1.toString());
      stringBuilder1 = stringBuilder2;
      if (str != null)
        try {
          GoogleSignInAccount googleSignInAccount = GoogleSignInAccount.i(str);
        } catch (JSONException jSONException) {
          stringBuilder1 = stringBuilder2;
        }  
    } 
    return (GoogleSignInAccount)stringBuilder1;
  }
  
  @Nullable
  public final String c(String paramString) {
    this.a.lock();
    try {
      paramString = this.b.getString(paramString, null);
      return paramString;
    } finally {
      this.a.unlock();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */