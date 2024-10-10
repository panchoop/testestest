package c.c.a.a.c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import b.l.a.e;
import b.l.a.j;
import c.c.a.a.b.b;
import c.c.a.a.c.l.d;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.v;
import c.c.a.a.f.a.c;

public class d extends e {
  public static final Object c = new Object();
  
  public static final d d = new d();
  
  public Intent a(Context paramContext, int paramInt, String paramString) {
    return super.a(paramContext, paramInt, paramString);
  }
  
  public int b(Context paramContext) {
    return super.c(paramContext, e.a);
  }
  
  public int c(Context paramContext, int paramInt) {
    return super.c(paramContext, paramInt);
  }
  
  public boolean d(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    j j;
    AlertDialog alertDialog;
    v v = new v(super.a((Context)paramActivity, paramInt1, "d"), paramActivity, paramInt2);
    if (paramInt1 == 0) {
      alertDialog = null;
    } else {
      AlertDialog.Builder builder;
      TypedValue typedValue1 = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, typedValue1, true);
      if ("Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(typedValue1.resourceId))) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder((Context)paramActivity, 5);
      } else {
        typedValue1 = null;
      } 
      TypedValue typedValue2 = typedValue1;
      if (typedValue1 == null)
        builder = new AlertDialog.Builder((Context)paramActivity); 
      builder.setMessage(d.c((Context)paramActivity, paramInt1));
      builder.setOnCancelListener(paramOnCancelListener);
      Resources resources = paramActivity.getResources();
      if (paramInt1 != 1) {
        if (paramInt1 != 2) {
          if (paramInt1 != 3) {
            paramInt2 = 17039370;
          } else {
            paramInt2 = b.common_google_play_services_enable_button;
          } 
        } else {
          paramInt2 = b.common_google_play_services_update_button;
        } 
      } else {
        paramInt2 = b.common_google_play_services_install_button;
      } 
      String str = resources.getString(paramInt2);
      if (str != null)
        builder.setPositiveButton(str, (DialogInterface.OnClickListener)v); 
      str = d.d((Context)paramActivity, paramInt1);
      if (str != null)
        builder.setTitle(str); 
      alertDialog = builder.create();
    } 
    if (alertDialog == null)
      return false; 
    if (paramActivity instanceof e) {
      j j1 = ((e)paramActivity).m();
      j = new j();
      q.g(alertDialog, "Cannot display null dialog");
      alertDialog.setOnCancelListener(null);
      alertDialog.setOnDismissListener(null);
      j.h0 = (Dialog)alertDialog;
      j.i0 = paramOnCancelListener;
      j.b0(j1, "GooglePlayServicesErrorDialog");
    } else {
      FragmentManager fragmentManager = j.getFragmentManager();
      b b = new b();
      q.g(alertDialog, "Cannot display null dialog");
      alertDialog.setOnCancelListener(null);
      alertDialog.setOnDismissListener(null);
      b.b = (Dialog)alertDialog;
      b.c = paramOnCancelListener;
      b.show(fragmentManager, "GooglePlayServicesErrorDialog");
    } 
    return true;
  }
  
  @TargetApi(20)
  public final void e(Context paramContext, int paramInt, PendingIntent paramPendingIntent) {
    // Byte code:
    //   0: iload_2
    //   1: bipush #18
    //   3: if_icmpne -> 24
    //   6: new c/c/a/a/c/d$a
    //   9: dup
    //   10: aload_0
    //   11: aload_1
    //   12: invokespecial <init> : (Lc/c/a/a/c/d;Landroid/content/Context;)V
    //   15: iconst_1
    //   16: ldc2_w 120000
    //   19: invokevirtual sendEmptyMessageDelayed : (IJ)Z
    //   22: pop
    //   23: return
    //   24: aload_3
    //   25: ifnonnull -> 43
    //   28: iload_2
    //   29: bipush #6
    //   31: if_icmpne -> 42
    //   34: ldc 'GoogleApiAvailability'
    //   36: ldc 'Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.'
    //   38: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   41: pop
    //   42: return
    //   43: iload_2
    //   44: bipush #6
    //   46: if_icmpne -> 60
    //   49: aload_1
    //   50: ldc 'common_google_play_services_resolution_required_title'
    //   52: invokestatic e : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   55: astore #7
    //   57: goto -> 67
    //   60: aload_1
    //   61: iload_2
    //   62: invokestatic d : (Landroid/content/Context;I)Ljava/lang/String;
    //   65: astore #7
    //   67: aload #7
    //   69: astore #8
    //   71: aload #7
    //   73: ifnonnull -> 88
    //   76: aload_1
    //   77: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   80: getstatic c/c/a/a/b/b.common_google_play_services_notification_ticker : I
    //   83: invokevirtual getString : (I)Ljava/lang/String;
    //   86: astore #8
    //   88: iload_2
    //   89: bipush #6
    //   91: if_icmpeq -> 113
    //   94: iload_2
    //   95: bipush #19
    //   97: if_icmpne -> 103
    //   100: goto -> 113
    //   103: aload_1
    //   104: iload_2
    //   105: invokestatic c : (Landroid/content/Context;I)Ljava/lang/String;
    //   108: astore #7
    //   110: goto -> 125
    //   113: aload_1
    //   114: ldc 'common_google_play_services_resolution_required_text'
    //   116: aload_1
    //   117: invokestatic a : (Landroid/content/Context;)Ljava/lang/String;
    //   120: invokestatic f : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   123: astore #7
    //   125: aload_1
    //   126: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   129: astore #11
    //   131: aload_1
    //   132: ldc 'notification'
    //   134: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   137: checkcast android/app/NotificationManager
    //   140: astore #9
    //   142: new b/i/d/g
    //   145: dup
    //   146: aload_1
    //   147: invokespecial <init> : (Landroid/content/Context;)V
    //   150: astore #10
    //   152: aload #10
    //   154: iconst_1
    //   155: putfield j : Z
    //   158: aload #10
    //   160: getfield s : Landroid/app/Notification;
    //   163: astore #12
    //   165: aload #12
    //   167: aload #12
    //   169: getfield flags : I
    //   172: bipush #16
    //   174: ior
    //   175: putfield flags : I
    //   178: aload #10
    //   180: aload #8
    //   182: invokestatic a : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   185: putfield d : Ljava/lang/CharSequence;
    //   188: new b/i/d/f
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: astore #8
    //   197: aload #8
    //   199: aload #7
    //   201: invokestatic a : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   204: putfield c : Ljava/lang/CharSequence;
    //   207: aload #10
    //   209: getfield i : Lb/i/d/h;
    //   212: aload #8
    //   214: if_acmpeq -> 249
    //   217: aload #10
    //   219: aload #8
    //   221: putfield i : Lb/i/d/h;
    //   224: aload #8
    //   226: getfield a : Lb/i/d/g;
    //   229: aload #10
    //   231: if_acmpeq -> 249
    //   234: aload #8
    //   236: aload #10
    //   238: putfield a : Lb/i/d/g;
    //   241: aload #10
    //   243: aload #8
    //   245: invokevirtual b : (Lb/i/d/h;)Lb/i/d/g;
    //   248: pop
    //   249: aload_1
    //   250: invokestatic I : (Landroid/content/Context;)Z
    //   253: ifeq -> 336
    //   256: aload_1
    //   257: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   260: getfield icon : I
    //   263: istore #4
    //   265: aload #10
    //   267: getfield s : Landroid/app/Notification;
    //   270: iload #4
    //   272: putfield icon : I
    //   275: aload #10
    //   277: iconst_2
    //   278: putfield g : I
    //   281: aload_1
    //   282: invokestatic J : (Landroid/content/Context;)Z
    //   285: ifeq -> 327
    //   288: getstatic c/c/a/a/b/a.common_full_open_on_phone : I
    //   291: istore #4
    //   293: aload #11
    //   295: getstatic c/c/a/a/b/b.common_open_on_phone : I
    //   298: invokevirtual getString : (I)Ljava/lang/String;
    //   301: astore #7
    //   303: aload #10
    //   305: getfield b : Ljava/util/ArrayList;
    //   308: new b/i/d/e
    //   311: dup
    //   312: iload #4
    //   314: aload #7
    //   316: aload_3
    //   317: invokespecial <init> : (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   320: invokevirtual add : (Ljava/lang/Object;)Z
    //   323: pop
    //   324: goto -> 401
    //   327: aload #10
    //   329: aload_3
    //   330: putfield f : Landroid/app/PendingIntent;
    //   333: goto -> 401
    //   336: aload #10
    //   338: getfield s : Landroid/app/Notification;
    //   341: ldc_w 17301642
    //   344: putfield icon : I
    //   347: aload #11
    //   349: getstatic c/c/a/a/b/b.common_google_play_services_notification_ticker : I
    //   352: invokevirtual getString : (I)Ljava/lang/String;
    //   355: astore #8
    //   357: aload #10
    //   359: getfield s : Landroid/app/Notification;
    //   362: aload #8
    //   364: invokestatic a : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   367: putfield tickerText : Ljava/lang/CharSequence;
    //   370: invokestatic currentTimeMillis : ()J
    //   373: lstore #5
    //   375: aload #10
    //   377: getfield s : Landroid/app/Notification;
    //   380: lload #5
    //   382: putfield when : J
    //   385: aload #10
    //   387: aload_3
    //   388: putfield f : Landroid/app/PendingIntent;
    //   391: aload #10
    //   393: aload #7
    //   395: invokestatic a : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   398: putfield e : Ljava/lang/CharSequence;
    //   401: invokestatic H : ()Z
    //   404: ifeq -> 503
    //   407: invokestatic H : ()Z
    //   410: ifeq -> 495
    //   413: getstatic c/c/a/a/c/d.c : Ljava/lang/Object;
    //   416: astore_3
    //   417: aload_3
    //   418: monitorenter
    //   419: aload_3
    //   420: monitorexit
    //   421: aload #9
    //   423: ldc_w 'com.google.android.gms.availability'
    //   426: invokevirtual getNotificationChannel : (Ljava/lang/String;)Landroid/app/NotificationChannel;
    //   429: astore_3
    //   430: aload_1
    //   431: invokestatic b : (Landroid/content/Context;)Ljava/lang/String;
    //   434: astore_1
    //   435: aload_3
    //   436: ifnonnull -> 455
    //   439: new android/app/NotificationChannel
    //   442: dup
    //   443: ldc_w 'com.google.android.gms.availability'
    //   446: aload_1
    //   447: iconst_4
    //   448: invokespecial <init> : (Ljava/lang/String;Ljava/lang/CharSequence;I)V
    //   451: astore_1
    //   452: goto -> 473
    //   455: aload_1
    //   456: aload_3
    //   457: invokevirtual getName : ()Ljava/lang/CharSequence;
    //   460: invokevirtual contentEquals : (Ljava/lang/CharSequence;)Z
    //   463: ifne -> 479
    //   466: aload_3
    //   467: aload_1
    //   468: invokevirtual setName : (Ljava/lang/CharSequence;)V
    //   471: aload_3
    //   472: astore_1
    //   473: aload #9
    //   475: aload_1
    //   476: invokevirtual createNotificationChannel : (Landroid/app/NotificationChannel;)V
    //   479: aload #10
    //   481: ldc_w 'com.google.android.gms.availability'
    //   484: putfield o : Ljava/lang/String;
    //   487: goto -> 503
    //   490: astore_1
    //   491: aload_3
    //   492: monitorexit
    //   493: aload_1
    //   494: athrow
    //   495: new java/lang/IllegalStateException
    //   498: dup
    //   499: invokespecial <init> : ()V
    //   502: athrow
    //   503: new b/i/d/i
    //   506: dup
    //   507: aload #10
    //   509: invokespecial <init> : (Lb/i/d/g;)V
    //   512: astore #7
    //   514: aload #7
    //   516: getfield b : Lb/i/d/g;
    //   519: getfield i : Lb/i/d/h;
    //   522: astore #8
    //   524: aload #8
    //   526: ifnull -> 572
    //   529: aload #8
    //   531: checkcast b/i/d/f
    //   534: astore_1
    //   535: new android/app/Notification$BigTextStyle
    //   538: dup
    //   539: aload #7
    //   541: getfield a : Landroid/app/Notification$Builder;
    //   544: invokespecial <init> : (Landroid/app/Notification$Builder;)V
    //   547: aconst_null
    //   548: invokevirtual setBigContentTitle : (Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //   551: aload_1
    //   552: getfield c : Ljava/lang/CharSequence;
    //   555: invokevirtual bigText : (Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //   558: astore_3
    //   559: aload_1
    //   560: getfield b : Z
    //   563: ifeq -> 572
    //   566: aload_3
    //   567: aconst_null
    //   568: invokevirtual setSummaryText : (Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
    //   571: pop
    //   572: getstatic android/os/Build$VERSION.SDK_INT : I
    //   575: istore #4
    //   577: iload #4
    //   579: bipush #26
    //   581: if_icmplt -> 596
    //   584: aload #7
    //   586: getfield a : Landroid/app/Notification$Builder;
    //   589: invokevirtual build : ()Landroid/app/Notification;
    //   592: astore_1
    //   593: goto -> 845
    //   596: iload #4
    //   598: bipush #24
    //   600: if_icmplt -> 693
    //   603: aload #7
    //   605: getfield a : Landroid/app/Notification$Builder;
    //   608: invokevirtual build : ()Landroid/app/Notification;
    //   611: astore_3
    //   612: aload_3
    //   613: astore_1
    //   614: aload #7
    //   616: getfield g : I
    //   619: ifeq -> 845
    //   622: aload_3
    //   623: invokevirtual getGroup : ()Ljava/lang/String;
    //   626: ifnull -> 655
    //   629: aload_3
    //   630: getfield flags : I
    //   633: sipush #512
    //   636: iand
    //   637: ifeq -> 655
    //   640: aload #7
    //   642: getfield g : I
    //   645: iconst_2
    //   646: if_icmpne -> 655
    //   649: aload #7
    //   651: aload_3
    //   652: invokevirtual a : (Landroid/app/Notification;)V
    //   655: aload_3
    //   656: astore_1
    //   657: aload_3
    //   658: invokevirtual getGroup : ()Ljava/lang/String;
    //   661: ifnull -> 845
    //   664: aload_3
    //   665: astore_1
    //   666: aload_3
    //   667: getfield flags : I
    //   670: sipush #512
    //   673: iand
    //   674: ifne -> 845
    //   677: aload_3
    //   678: astore_1
    //   679: aload #7
    //   681: getfield g : I
    //   684: iconst_1
    //   685: if_icmpne -> 845
    //   688: aload_3
    //   689: astore_1
    //   690: goto -> 839
    //   693: aload #7
    //   695: getfield a : Landroid/app/Notification$Builder;
    //   698: aload #7
    //   700: getfield f : Landroid/os/Bundle;
    //   703: invokevirtual setExtras : (Landroid/os/Bundle;)Landroid/app/Notification$Builder;
    //   706: pop
    //   707: aload #7
    //   709: getfield a : Landroid/app/Notification$Builder;
    //   712: invokevirtual build : ()Landroid/app/Notification;
    //   715: astore_3
    //   716: aload #7
    //   718: getfield c : Landroid/widget/RemoteViews;
    //   721: astore_1
    //   722: aload_1
    //   723: ifnull -> 731
    //   726: aload_3
    //   727: aload_1
    //   728: putfield contentView : Landroid/widget/RemoteViews;
    //   731: aload #7
    //   733: getfield d : Landroid/widget/RemoteViews;
    //   736: astore_1
    //   737: aload_1
    //   738: ifnull -> 746
    //   741: aload_3
    //   742: aload_1
    //   743: putfield bigContentView : Landroid/widget/RemoteViews;
    //   746: aload #7
    //   748: getfield h : Landroid/widget/RemoteViews;
    //   751: astore_1
    //   752: aload_1
    //   753: ifnull -> 761
    //   756: aload_3
    //   757: aload_1
    //   758: putfield headsUpContentView : Landroid/widget/RemoteViews;
    //   761: aload_3
    //   762: astore_1
    //   763: aload #7
    //   765: getfield g : I
    //   768: ifeq -> 845
    //   771: aload_3
    //   772: invokevirtual getGroup : ()Ljava/lang/String;
    //   775: ifnull -> 804
    //   778: aload_3
    //   779: getfield flags : I
    //   782: sipush #512
    //   785: iand
    //   786: ifeq -> 804
    //   789: aload #7
    //   791: getfield g : I
    //   794: iconst_2
    //   795: if_icmpne -> 804
    //   798: aload #7
    //   800: aload_3
    //   801: invokevirtual a : (Landroid/app/Notification;)V
    //   804: aload_3
    //   805: astore_1
    //   806: aload_3
    //   807: invokevirtual getGroup : ()Ljava/lang/String;
    //   810: ifnull -> 845
    //   813: aload_3
    //   814: astore_1
    //   815: aload_3
    //   816: getfield flags : I
    //   819: sipush #512
    //   822: iand
    //   823: ifne -> 845
    //   826: aload_3
    //   827: astore_1
    //   828: aload #7
    //   830: getfield g : I
    //   833: iconst_1
    //   834: if_icmpne -> 845
    //   837: aload_3
    //   838: astore_1
    //   839: aload #7
    //   841: aload_1
    //   842: invokevirtual a : (Landroid/app/Notification;)V
    //   845: aload #7
    //   847: getfield b : Lb/i/d/g;
    //   850: getfield n : Landroid/widget/RemoteViews;
    //   853: astore_3
    //   854: aload_3
    //   855: ifnull -> 863
    //   858: aload_1
    //   859: aload_3
    //   860: putfield contentView : Landroid/widget/RemoteViews;
    //   863: aload #8
    //   865: ifnull -> 884
    //   868: aload #7
    //   870: getfield b : Lb/i/d/g;
    //   873: getfield i : Lb/i/d/h;
    //   876: ifnull -> 882
    //   879: goto -> 884
    //   882: aconst_null
    //   883: athrow
    //   884: aload #8
    //   886: ifnull -> 894
    //   889: aload_1
    //   890: getfield extras : Landroid/os/Bundle;
    //   893: astore_3
    //   894: iload_2
    //   895: iconst_1
    //   896: if_icmpeq -> 916
    //   899: iload_2
    //   900: iconst_2
    //   901: if_icmpeq -> 916
    //   904: iload_2
    //   905: iconst_3
    //   906: if_icmpeq -> 916
    //   909: ldc_w 39789
    //   912: istore_2
    //   913: goto -> 927
    //   916: sipush #10436
    //   919: istore_2
    //   920: getstatic c/c/a/a/c/g.b : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   923: iconst_0
    //   924: invokevirtual set : (Z)V
    //   927: aload #9
    //   929: iload_2
    //   930: aload_1
    //   931: invokevirtual notify : (ILandroid/app/Notification;)V
    //   934: return
    // Exception table:
    //   from	to	target	type
    //   419	421	490	finally
    //   491	493	490	finally
  }
  
  @SuppressLint({"HandlerLeak"})
  public final class a extends c {
    public final Context a;
    
    public final d b;
    
    public a(d this$0, Context param1Context) {
      super(looper);
      Looper looper;
      this.a = param1Context.getApplicationContext();
    }
    
    public final void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 1) {
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("Don't know how to handle this message: ");
        stringBuilder.append(i);
        Log.w("GoogleApiAvailability", stringBuilder.toString());
      } else {
        i = this.b.b(this.a);
        d d1 = this.b;
        param1Message = null;
        if (d1 != null) {
          if (g.c(i)) {
            PendingIntent pendingIntent;
            d1 = this.b;
            Context context = this.a;
            Intent intent = d1.a(context, i, "n");
            if (intent != null)
              pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728); 
            d1.e(context, i, pendingIntent);
          } 
          return;
        } 
        throw null;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */