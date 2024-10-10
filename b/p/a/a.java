package b.p.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class a {
  public static final Object f = new Object();
  
  public static a g;
  
  public final Context a;
  
  public final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<BroadcastReceiver, ArrayList<c>>();
  
  public final HashMap<String, ArrayList<c>> c = new HashMap<String, ArrayList<c>>();
  
  public final ArrayList<b> d = new ArrayList<b>();
  
  public final Handler e;
  
  public a(Context paramContext) {
    this.a = paramContext;
    this.e = new a(this, paramContext.getMainLooper());
  }
  
  public static a a(Context paramContext) {
    synchronized (f) {
      if (g == null) {
        a a1 = new a();
        this(paramContext.getApplicationContext());
        g = a1;
      } 
      return g;
    } 
  }
  
  public boolean b(Intent paramIntent) {
    synchronized (this.b) {
      byte b;
      String str2 = paramIntent.getAction();
      String str1 = paramIntent.resolveTypeIfNeeded(this.a.getContentResolver());
      Uri uri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set set = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) != 0) {
        b = 1;
      } else {
        b = 0;
      } 
      if (b) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Resolving type ");
        stringBuilder.append(str1);
        stringBuilder.append(" scheme ");
        stringBuilder.append(str3);
        stringBuilder.append(" of intent ");
        stringBuilder.append(paramIntent);
        Log.v("LocalBroadcastManager", stringBuilder.toString());
      } 
      ArrayList<c> arrayList = this.c.get(paramIntent.getAction());
      if (arrayList != null) {
        if (b) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Action list: ");
          stringBuilder.append(arrayList);
          Log.v("LocalBroadcastManager", stringBuilder.toString());
        } 
        ArrayList<c> arrayList1 = null;
        for (byte b1 = 0; b1 < arrayList.size(); b1++) {
          c c = arrayList.get(b1);
          if (b) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("Matching against filter ");
            stringBuilder.append(c.a);
            Log.v("LocalBroadcastManager", stringBuilder.toString());
          } 
          if (c.c) {
            if (b)
              Log.v("LocalBroadcastManager", "  Filter's target already added"); 
          } else {
            IntentFilter intentFilter = c.a;
            int i = intentFilter.match(str2, str1, str3, uri, set, "LocalBroadcastManager");
            if (i >= 0) {
              if (b) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("  Filter matched!  match=0x");
                stringBuilder.append(Integer.toHexString(i));
                Log.v("LocalBroadcastManager", stringBuilder.toString());
              } 
              if (arrayList1 == null) {
                arrayList1 = new ArrayList();
                this();
              } 
              arrayList1.add(c);
              c.c = true;
            } else if (b) {
              String str;
              if (i != -4) {
                if (i != -3) {
                  if (i != -2) {
                    if (i != -1) {
                      str = "unknown reason";
                    } else {
                      str = "type";
                    } 
                  } else {
                    str = "data";
                  } 
                } else {
                  str = "action";
                } 
              } else {
                str = "category";
              } 
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("  Filter did not match: ");
              stringBuilder.append(str);
              Log.v("LocalBroadcastManager", stringBuilder.toString());
            } 
          } 
        } 
        if (arrayList1 != null) {
          for (b = 0; b < arrayList1.size(); b++)
            ((c)arrayList1.get(b)).c = false; 
          ArrayList<b> arrayList2 = this.d;
          b b2 = new b();
          this(paramIntent, arrayList1);
          arrayList2.add(b2);
          if (!this.e.hasMessages(1))
            this.e.sendEmptyMessage(1); 
          return true;
        } 
      } 
      return false;
    } 
  }
  
  public class a extends Handler {
    public final a a;
    
    public a(a this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      if (param1Message.what != 1) {
        super.handleMessage(param1Message);
      } else {
        a a1 = this.a;
        while (true) {
          HashMap<BroadcastReceiver, ArrayList<a.c>> hashMap;
          a.c c;
          synchronized (a1.b) {
            int i = a1.d.size();
            if (i <= 0)
              return; 
            a.b[] arrayOfB = new a.b[i];
            a1.d.toArray(arrayOfB);
            a1.d.clear();
            for (byte b = 0; b < i; b++) {
              a.b b2 = arrayOfB[b];
              int j = b2.b.size();
              for (byte b1 = 0; b1 < j; b1++) {
                c = b2.b.get(b1);
                if (!c.d)
                  c.b.onReceive(a1.a, b2.a); 
              } 
            } 
          } 
        } 
      } 
    }
  }
  
  public static final class b {
    public final Intent a;
    
    public final ArrayList<a.c> b;
    
    public b(Intent param1Intent, ArrayList<a.c> param1ArrayList) {
      this.a = param1Intent;
      this.b = param1ArrayList;
    }
  }
  
  public static final class c {
    public final IntentFilter a;
    
    public final BroadcastReceiver b;
    
    public boolean c;
    
    public boolean d;
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(128);
      stringBuilder.append("Receiver{");
      stringBuilder.append((Object)null);
      stringBuilder.append(" filter=");
      stringBuilder.append((Object)null);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\p\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */