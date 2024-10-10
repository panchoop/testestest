package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import b.l.a.e;
import b.p.a.a;
import c.c.a.a.c.l.q;
import c.c.b.h.d0.j;
import c.c.b.h.d0.n;
import c.c.b.h.d0.t;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class FederatedSignInActivity extends e {
  public static long o;
  
  public static final j p = j.b;
  
  public static Handler q;
  
  public static Runnable r;
  
  public boolean n = false;
  
  public void onCreate(Bundle paramBundle) {
    String str1;
    super.onCreate(paramBundle);
    String str2 = getIntent().getAction();
    if (!"com.google.firebase.auth.internal.SIGN_IN".equals(str2) && !"com.google.firebase.auth.internal.LINK".equals(str2) && !"com.google.firebase.auth.internal.REAUTHENTICATE".equals(str2)) {
      str1 = String.valueOf(str2);
      if (str1.length() != 0) {
        str1 = "Could not do operation - unknown action: ".concat(str1);
      } else {
        str1 = new String("Could not do operation - unknown action: ");
      } 
      Log.e("IdpSignInActivity", str1);
      q();
      return;
    } 
    long l = System.currentTimeMillis();
    if (l - o < 30000L) {
      Log.e("IdpSignInActivity", "Could not start operation - already in progress");
      return;
    } 
    o = l;
    if (str1 != null)
      this.n = str1.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN"); 
  }
  
  public void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    Handler handler = q;
    if (handler != null) {
      Runnable runnable = r;
      if (runnable != null) {
        handler.removeCallbacks(runnable);
        r = null;
      } 
    } 
    setIntent(paramIntent);
  }
  
  public void onResume() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial onResume : ()V
    //   4: aload_0
    //   5: invokevirtual getIntent : ()Landroid/content/Intent;
    //   8: astore #6
    //   10: ldc 'com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED'
    //   12: aload #6
    //   14: invokevirtual getAction : ()Ljava/lang/String;
    //   17: invokevirtual equals : (Ljava/lang/Object;)Z
    //   20: istore_3
    //   21: aconst_null
    //   22: astore #4
    //   24: aconst_null
    //   25: astore #5
    //   27: iconst_0
    //   28: istore_2
    //   29: iload_3
    //   30: ifeq -> 125
    //   33: ldc 'IdpSignInActivity'
    //   35: ldc 'Web sign-in failed, finishing'
    //   37: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   40: pop
    //   41: aload #6
    //   43: invokestatic b : (Landroid/content/Intent;)Z
    //   46: ifeq -> 118
    //   49: aload #6
    //   51: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: aload #6
    //   57: invokestatic f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: aload #6
    //   63: ldc 'com.google.firebase.auth.internal.STATUS'
    //   65: invokevirtual hasExtra : (Ljava/lang/String;)Z
    //   68: invokestatic b : (Z)V
    //   71: getstatic com/google/android/gms/common/api/Status.CREATOR : Landroid/os/Parcelable$Creator;
    //   74: astore #4
    //   76: aload #6
    //   78: ldc 'com.google.firebase.auth.internal.STATUS'
    //   80: invokevirtual getByteArrayExtra : (Ljava/lang/String;)[B
    //   83: astore #6
    //   85: aload #6
    //   87: ifnonnull -> 97
    //   90: aload #5
    //   92: astore #4
    //   94: goto -> 106
    //   97: aload #6
    //   99: aload #4
    //   101: invokestatic s : ([BLandroid/os/Parcelable$Creator;)Lc/c/a/a/c/l/u/c;
    //   104: astore #4
    //   106: aload_0
    //   107: aload #4
    //   109: checkcast com/google/android/gms/common/api/Status
    //   112: invokevirtual r : (Lcom/google/android/gms/common/api/Status;)V
    //   115: goto -> 354
    //   118: aload_0
    //   119: invokevirtual q : ()V
    //   122: goto -> 354
    //   125: iload_2
    //   126: istore_1
    //   127: aload #6
    //   129: ldc 'com.google.firebase.auth.internal.OPERATION'
    //   131: invokevirtual hasExtra : (Ljava/lang/String;)Z
    //   134: ifeq -> 356
    //   137: iload_2
    //   138: istore_1
    //   139: aload #6
    //   141: ldc 'com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST'
    //   143: invokevirtual hasExtra : (Ljava/lang/String;)Z
    //   146: ifeq -> 356
    //   149: aload #6
    //   151: ldc 'com.google.firebase.auth.internal.OPERATION'
    //   153: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   156: astore #5
    //   158: ldc 'com.google.firebase.auth.internal.SIGN_IN'
    //   160: aload #5
    //   162: invokevirtual equals : (Ljava/lang/Object;)Z
    //   165: ifne -> 190
    //   168: ldc 'com.google.firebase.auth.internal.LINK'
    //   170: aload #5
    //   172: invokevirtual equals : (Ljava/lang/Object;)Z
    //   175: ifne -> 190
    //   178: iload_2
    //   179: istore_1
    //   180: ldc 'com.google.firebase.auth.internal.REAUTHENTICATE'
    //   182: aload #5
    //   184: invokevirtual equals : (Ljava/lang/Object;)Z
    //   187: ifeq -> 356
    //   190: getstatic c/c/a/a/f/c/n1.CREATOR : Landroid/os/Parcelable$Creator;
    //   193: astore #7
    //   195: aload #6
    //   197: ldc 'com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST'
    //   199: invokevirtual getByteArrayExtra : (Ljava/lang/String;)[B
    //   202: astore #8
    //   204: aload #8
    //   206: ifnonnull -> 212
    //   209: goto -> 221
    //   212: aload #8
    //   214: aload #7
    //   216: invokestatic s : ([BLandroid/os/Parcelable$Creator;)Lc/c/a/a/c/l/u/c;
    //   219: astore #4
    //   221: aload #4
    //   223: checkcast c/c/a/a/f/c/n1
    //   226: astore #4
    //   228: aload #6
    //   230: ldc 'com.google.firebase.auth.internal.EXTRA_TENANT_ID'
    //   232: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   235: astore #9
    //   237: aload #4
    //   239: aload #9
    //   241: putfield o : Ljava/lang/String;
    //   244: lconst_0
    //   245: putstatic com/google/firebase/auth/internal/FederatedSignInActivity.o : J
    //   248: aload_0
    //   249: iconst_0
    //   250: putfield n : Z
    //   253: new android/content/Intent
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: astore #6
    //   262: invokestatic obtain : ()Landroid/os/Parcel;
    //   265: astore #8
    //   267: aload #4
    //   269: aload #8
    //   271: iconst_0
    //   272: invokevirtual writeToParcel : (Landroid/os/Parcel;I)V
    //   275: aload #8
    //   277: invokevirtual marshall : ()[B
    //   280: astore #7
    //   282: aload #8
    //   284: invokevirtual recycle : ()V
    //   287: aload #6
    //   289: ldc 'com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST'
    //   291: aload #7
    //   293: invokevirtual putExtra : (Ljava/lang/String;[B)Landroid/content/Intent;
    //   296: pop
    //   297: aload #6
    //   299: ldc 'com.google.firebase.auth.internal.OPERATION'
    //   301: aload #5
    //   303: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   306: pop
    //   307: aload #6
    //   309: ldc 'com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT'
    //   311: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   314: pop
    //   315: aload_0
    //   316: invokestatic a : (Landroid/content/Context;)Lb/p/a/a;
    //   319: aload #6
    //   321: invokevirtual b : (Landroid/content/Intent;)Z
    //   324: ifne -> 343
    //   327: aload_0
    //   328: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   331: aload #4
    //   333: aload #5
    //   335: aload #9
    //   337: invokestatic b : (Landroid/content/Context;Lc/c/a/a/f/c/n1;Ljava/lang/String;Ljava/lang/String;)V
    //   340: goto -> 350
    //   343: getstatic com/google/firebase/auth/internal/FederatedSignInActivity.p : Lc/c/b/h/d0/j;
    //   346: aload_0
    //   347: invokevirtual a : (Landroid/content/Context;)V
    //   350: aload_0
    //   351: invokevirtual finish : ()V
    //   354: iconst_1
    //   355: istore_1
    //   356: iload_1
    //   357: ifeq -> 361
    //   360: return
    //   361: aload_0
    //   362: getfield n : Z
    //   365: ifne -> 460
    //   368: new android/content/Intent
    //   371: dup
    //   372: ldc 'com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN'
    //   374: invokespecial <init> : (Ljava/lang/String;)V
    //   377: astore #4
    //   379: aload #4
    //   381: ldc 'com.google.android.gms'
    //   383: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   386: pop
    //   387: aload #4
    //   389: aload_0
    //   390: invokevirtual getIntent : ()Landroid/content/Intent;
    //   393: invokevirtual getExtras : ()Landroid/os/Bundle;
    //   396: invokevirtual putExtras : (Landroid/os/Bundle;)Landroid/content/Intent;
    //   399: pop
    //   400: aload #4
    //   402: ldc 'com.google.firebase.auth.internal.OPERATION'
    //   404: aload_0
    //   405: invokevirtual getIntent : ()Landroid/content/Intent;
    //   408: invokevirtual getAction : ()Ljava/lang/String;
    //   411: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   414: pop
    //   415: aload_0
    //   416: aload #4
    //   418: ldc 40963
    //   420: invokevirtual startActivityForResult : (Landroid/content/Intent;I)V
    //   423: goto -> 454
    //   426: astore #4
    //   428: ldc 'IdpSignInActivity'
    //   430: ldc_w 'Could not launch web sign-in Intent. Google Play service is unavailable'
    //   433: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   436: pop
    //   437: aload_0
    //   438: new com/google/android/gms/common/api/Status
    //   441: dup
    //   442: sipush #17499
    //   445: ldc_w 'Could not launch web sign-in Intent. Google Play service is unavailable'
    //   448: invokespecial <init> : (ILjava/lang/String;)V
    //   451: invokevirtual r : (Lcom/google/android/gms/common/api/Status;)V
    //   454: aload_0
    //   455: iconst_1
    //   456: putfield n : Z
    //   459: return
    //   460: new c/c/b/h/d0/h
    //   463: dup
    //   464: aload_0
    //   465: invokespecial <init> : (Lcom/google/firebase/auth/internal/FederatedSignInActivity;)V
    //   468: putstatic com/google/firebase/auth/internal/FederatedSignInActivity.r : Ljava/lang/Runnable;
    //   471: getstatic com/google/firebase/auth/internal/FederatedSignInActivity.q : Landroid/os/Handler;
    //   474: ifnonnull -> 487
    //   477: new c/c/a/a/f/c/o1
    //   480: dup
    //   481: invokespecial <init> : ()V
    //   484: putstatic com/google/firebase/auth/internal/FederatedSignInActivity.q : Landroid/os/Handler;
    //   487: getstatic com/google/firebase/auth/internal/FederatedSignInActivity.q : Landroid/os/Handler;
    //   490: getstatic com/google/firebase/auth/internal/FederatedSignInActivity.r : Ljava/lang/Runnable;
    //   493: ldc2_w 800
    //   496: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   499: pop
    //   500: return
    // Exception table:
    //   from	to	target	type
    //   415	423	426	android/content/ActivityNotFoundException
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.n);
  }
  
  public final void q() {
    o = 0L;
    this.n = false;
    Intent intent = new Intent();
    intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
    intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    if (!a.a((Context)this).b(intent)) {
      n.a((Context)this, q.p0("WEB_CONTEXT_CANCELED"));
    } else {
      p.a((Context)this);
    } 
    finish();
  }
  
  public final void r(Status paramStatus) {
    o = 0L;
    this.n = false;
    Intent intent = new Intent();
    t.a(intent, paramStatus);
    intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
    if (!a.a((Context)this).b(intent)) {
      n.a(getApplicationContext(), paramStatus);
    } else {
      p.a((Context)this);
    } 
    finish();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\firebase\auth\internal\FederatedSignInActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */