package b.i.d;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class g {
  public Context a;
  
  public ArrayList<e> b = new ArrayList<e>();
  
  public ArrayList<e> c = new ArrayList<e>();
  
  public CharSequence d;
  
  public CharSequence e;
  
  public PendingIntent f;
  
  public int g;
  
  public boolean h = true;
  
  public h i;
  
  public boolean j = false;
  
  public Bundle k;
  
  public int l = 0;
  
  public int m = 0;
  
  public RemoteViews n;
  
  public String o;
  
  public int p = 0;
  
  public int q = 0;
  
  public boolean r;
  
  public Notification s;
  
  @Deprecated
  public ArrayList<String> t;
  
  @Deprecated
  public g(Context paramContext) {
    Notification notification = new Notification();
    this.s = notification;
    this.a = paramContext;
    this.o = null;
    notification.when = System.currentTimeMillis();
    this.s.audioStreamType = -1;
    this.g = 0;
    this.t = new ArrayList<String>();
    this.r = true;
  }
  
  public static CharSequence a(CharSequence paramCharSequence) {
    if (paramCharSequence == null)
      return paramCharSequence; 
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence.length() > 5120)
      charSequence = paramCharSequence.subSequence(0, 5120); 
    return charSequence;
  }
  
  public g b(h paramh) {
    if (this.i != paramh) {
      this.i = paramh;
      if (paramh.a != this) {
        paramh.a = this;
        b(paramh);
      } 
    } 
    return this;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */