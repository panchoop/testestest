package b.l.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import b.a.c;
import b.f.i;
import b.n.d;
import b.n.g;
import b.n.h;
import b.n.s;
import b.n.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e extends ComponentActivity {
  public final g g;
  
  public final h h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public int l;
  
  public i<String> m;
  
  public e() {
    a a = new a(this);
    a.a.a.a.a.h(a, "callbacks == null");
    this.g = new g(a);
    this.h = new h((g)this);
    this.k = true;
  }
  
  public static void l(int paramInt) {
    if ((paramInt & 0xFFFF0000) == 0)
      return; 
    throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
  }
  
  public static boolean n(j paramj, d.b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast b/l/a/k
    //   4: astore_0
    //   5: aload_0
    //   6: getfield g : Ljava/util/ArrayList;
    //   9: invokevirtual isEmpty : ()Z
    //   12: ifeq -> 22
    //   15: invokestatic emptyList : ()Ljava/util/List;
    //   18: astore_0
    //   19: goto -> 45
    //   22: aload_0
    //   23: getfield g : Ljava/util/ArrayList;
    //   26: astore #5
    //   28: aload #5
    //   30: monitorenter
    //   31: aload_0
    //   32: getfield g : Ljava/util/ArrayList;
    //   35: invokevirtual clone : ()Ljava/lang/Object;
    //   38: checkcast java/util/List
    //   41: astore_0
    //   42: aload #5
    //   44: monitorexit
    //   45: aload_0
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #6
    //   53: iconst_0
    //   54: istore_3
    //   55: aload #6
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 174
    //   65: aload #6
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast androidx/fragment/app/Fragment
    //   75: astore #5
    //   77: aload #5
    //   79: ifnonnull -> 85
    //   82: goto -> 55
    //   85: aload #5
    //   87: getfield R : Lb/n/h;
    //   90: getfield b : Lb/n/d$b;
    //   93: getstatic b/n/d$b.e : Lb/n/d$b;
    //   96: invokevirtual compareTo : (Ljava/lang/Enum;)I
    //   99: iflt -> 107
    //   102: iconst_1
    //   103: istore_2
    //   104: goto -> 109
    //   107: iconst_0
    //   108: istore_2
    //   109: iload_3
    //   110: istore #4
    //   112: iload_2
    //   113: ifeq -> 128
    //   116: aload #5
    //   118: getfield R : Lb/n/h;
    //   121: aload_1
    //   122: invokevirtual f : (Lb/n/d$b;)V
    //   125: iconst_1
    //   126: istore #4
    //   128: aload #5
    //   130: getfield t : Lb/l/a/i;
    //   133: astore_0
    //   134: aload_0
    //   135: ifnonnull -> 143
    //   138: aconst_null
    //   139: astore_0
    //   140: goto -> 151
    //   143: aload_0
    //   144: checkcast b/l/a/e$a
    //   147: getfield g : Lb/l/a/e;
    //   150: astore_0
    //   151: iload #4
    //   153: istore_3
    //   154: aload_0
    //   155: ifnull -> 55
    //   158: iload #4
    //   160: aload #5
    //   162: invokevirtual j : ()Lb/l/a/j;
    //   165: aload_1
    //   166: invokestatic n : (Lb/l/a/j;Lb/n/d$b;)Z
    //   169: ior
    //   170: istore_3
    //   171: goto -> 55
    //   174: iload_3
    //   175: ireturn
    //   176: astore_0
    //   177: aload #5
    //   179: monitorexit
    //   180: aload_0
    //   181: athrow
    // Exception table:
    //   from	to	target	type
    //   31	45	176	finally
    //   177	180	176	finally
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("  ");
    String str = stringBuilder.toString();
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.k);
    if (getApplication() != null)
      b.o.a.a.b((g)this).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString); 
    this.g.a.f.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public j m() {
    return this.g.a.f;
  }
  
  public void o() {}
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    String str;
    this.g.a();
    int j = paramInt1 >> 16;
    if (j != 0) {
      paramInt1 = j - 1;
      str = (String)this.m.d(paramInt1);
      this.m.h(paramInt1);
      if (str == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      } 
      if (this.g.a.f.T(str) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result no fragment exists for who: ");
        stringBuilder.append(str);
        Log.w("FragmentActivity", stringBuilder.toString());
      } 
      return;
    } 
    b.i.d.a.g();
    super.onActivityResult(paramInt1, paramInt2, (Intent)str);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.g.a();
    this.g.a.f.m(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle) {
    i<?> i1 = this.g.a;
    i1.f.g(i1, i1, null);
    if (paramBundle != null) {
      Parcelable parcelable = paramBundle.getParcelable("android:support:fragments");
      i<?> i2 = this.g.a;
      if (i2 instanceof t) {
        i2.f.j0(parcelable);
        if (paramBundle.containsKey("android:support:next_request_index")) {
          this.l = paramBundle.getInt("android:support:next_request_index");
          int[] arrayOfInt = paramBundle.getIntArray("android:support:request_indicies");
          String[] arrayOfString = paramBundle.getStringArray("android:support:request_fragment_who");
          if (arrayOfInt == null || arrayOfString == null || arrayOfInt.length != arrayOfString.length) {
            Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
          } else {
            this.m = new i(arrayOfInt.length);
            for (byte b = 0; b < arrayOfInt.length; b++)
              this.m.g(arrayOfInt[b], arrayOfString[b]); 
          } 
        } 
      } else {
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
      } 
    } 
    if (this.m == null) {
      this.m = new i(10);
      this.l = 0;
    } 
    super.onCreate(paramBundle);
    this.h.d(d.a.ON_CREATE);
    this.g.a.f.o();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    if (paramInt == 0) {
      boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
      g g1 = this.g;
      MenuInflater menuInflater = getMenuInflater();
      return bool | g1.a.f.p(paramMenu, menuInflater);
    } 
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = this.g.a.f.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramView, paramString, paramContext, paramAttributeSet) : view;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = this.g.a.f.onCreateView(null, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramString, paramContext, paramAttributeSet) : view;
  }
  
  public void onDestroy() {
    super.onDestroy();
    this.g.a.f.q();
    this.h.d(d.a.ON_DESTROY);
  }
  
  public void onLowMemory() {
    super.onLowMemory();
    this.g.a.f.r();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return super.onMenuItemSelected(paramInt, paramMenuItem) ? true : ((paramInt != 0) ? ((paramInt != 6) ? false : this.g.a.f.n(paramMenuItem)) : this.g.a.f.H(paramMenuItem));
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {
    this.g.a.f.s(paramBoolean);
  }
  
  public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent paramIntent) {
    super.onNewIntent(paramIntent);
    this.g.a();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    if (paramInt == 0)
      this.g.a.f.I(paramMenu); 
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPause() {
    super.onPause();
    this.j = false;
    this.g.a.f.M(3);
    this.h.d(d.a.ON_PAUSE);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {
    this.g.a.f.K(paramBoolean);
  }
  
  public void onPostResume() {
    super.onPostResume();
    this.h.d(d.a.ON_RESUME);
    k k = this.g.a.f;
    k.v = false;
    k.w = false;
    k.M(4);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    return (paramInt == 0) ? (super.onPreparePanel(0, paramView, paramMenu) | this.g.a.f.L(paramMenu)) : super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.g.a();
    paramInt = paramInt >> 16 & 0xFFFF;
    if (paramInt != 0) {
      String str = (String)this.m.d(--paramInt);
      this.m.h(paramInt);
      if (str == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      } 
      if (this.g.a.f.T(str) == null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity result no fragment exists for who: ");
        stringBuilder.append(str);
        Log.w("FragmentActivity", stringBuilder.toString());
      } 
    } 
  }
  
  public void onResume() {
    super.onResume();
    this.j = true;
    this.g.a();
    this.g.a.f.P();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    do {
    
    } while (n(m(), d.b.d));
    this.h.d(d.a.ON_STOP);
    Parcelable parcelable = this.g.a.f.l0();
    if (parcelable != null)
      paramBundle.putParcelable("android:support:fragments", parcelable); 
    if (this.m.i() > 0) {
      paramBundle.putInt("android:support:next_request_index", this.l);
      int[] arrayOfInt = new int[this.m.i()];
      String[] arrayOfString = new String[this.m.i()];
      for (byte b = 0; b < this.m.i(); b++) {
        arrayOfInt[b] = this.m.f(b);
        arrayOfString[b] = (String)this.m.j(b);
      } 
      paramBundle.putIntArray("android:support:request_indicies", arrayOfInt);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    } 
  }
  
  public void onStart() {
    super.onStart();
    this.k = false;
    if (!this.i) {
      this.i = true;
      k k1 = this.g.a.f;
      k1.v = false;
      k1.w = false;
      k1.M(2);
    } 
    this.g.a();
    this.g.a.f.P();
    this.h.d(d.a.ON_START);
    k k = this.g.a.f;
    k.v = false;
    k.w = false;
    k.M(3);
  }
  
  public void onStateNotSaved() {
    this.g.a();
  }
  
  public void onStop() {
    super.onStop();
    this.k = true;
    do {
    
    } while (n(m(), d.b.d));
    k k = this.g.a.f;
    k.w = true;
    k.M(2);
    this.h.d(d.a.ON_STOP);
  }
  
  @Deprecated
  public void p() {
    invalidateOptionsMenu();
  }
  
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt) {
    if (paramInt != -1)
      l(paramInt); 
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (paramInt != -1)
      l(paramInt); 
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 != -1)
      l(paramInt1); 
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    if (paramInt1 != -1)
      l(paramInt1); 
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public class a extends i<e> implements t, c {
    public final e g;
    
    public a(e this$0) {
      super(this$0);
    }
    
    public d a() {
      return (d)this.g.h;
    }
    
    public View b(int param1Int) {
      return this.g.findViewById(param1Int);
    }
    
    public boolean c() {
      boolean bool;
      Window window = this.g.getWindow();
      if (window != null && window.peekDecorView() != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public OnBackPressedDispatcher d() {
      return this.g.f;
    }
    
    public s f() {
      return this.g.f();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */