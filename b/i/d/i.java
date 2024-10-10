package b.i.d;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

public class i {
  public final Notification.Builder a;
  
  public final g b;
  
  public RemoteViews c;
  
  public RemoteViews d;
  
  public final List<Bundle> e;
  
  public final Bundle f;
  
  public int g;
  
  public RemoteViews h;
  
  public i(g paramg) {
    RemoteInput.Builder builder;
    boolean bool1;
    this.e = new ArrayList<Bundle>();
    this.f = new Bundle();
    this.b = paramg;
    if (Build.VERSION.SDK_INT >= 26) {
      builder1 = new Notification.Builder(paramg.a, paramg.o);
    } else {
      builder1 = new Notification.Builder(paramg.a);
    } 
    this.a = builder1;
    Notification notification = paramg.s;
    Notification.Builder builder1 = builder1.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
    int j = notification.flags;
    boolean bool2 = true;
    if ((j & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder1 = builder1.setOngoing(bool1);
    if ((notification.flags & 0x8) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder1 = builder1.setOnlyAlertOnce(bool1);
    if ((notification.flags & 0x10) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    builder1 = builder1.setAutoCancel(bool1).setDefaults(notification.defaults).setContentTitle(paramg.d).setContentText(paramg.e).setContentInfo(null).setContentIntent(paramg.f).setDeleteIntent(notification.deleteIntent);
    if ((notification.flags & 0x80) != 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    builder1.setFullScreenIntent(null, bool1).setLargeIcon(null).setNumber(0).setProgress(0, 0, false);
    this.a.setSubText(null).setUsesChronometer(false).setPriority(paramg.g);
    for (e e : paramg.b) {
      Notification.Action.Builder builder2;
      Bundle bundle1;
      IconCompat iconCompat = e.a();
      if (Build.VERSION.SDK_INT >= 23) {
        if (iconCompat != null) {
          Icon icon = iconCompat.f();
        } else {
          iconCompat = null;
        } 
        builder2 = new Notification.Action.Builder((Icon)iconCompat, e.j, e.k);
      } else {
        if (builder2 != null) {
          j = builder2.c();
        } else {
          j = 0;
        } 
        builder2 = new Notification.Action.Builder(j, e.j, e.k);
      } 
      k[] arrayOfK = e.c;
      if (arrayOfK != null) {
        int k = arrayOfK.length;
        RemoteInput[] arrayOfRemoteInput = new RemoteInput[k];
        if (arrayOfK.length <= 0) {
          for (j = 0; j < k; j++)
            builder2.addRemoteInput(arrayOfRemoteInput[j]); 
        } else {
          k k1 = arrayOfK[0];
          builder = new RemoteInput.Builder();
          throw null;
        } 
      } 
      if (e.a != null) {
        bundle1 = new Bundle(e.a);
      } else {
        bundle1 = new Bundle();
      } 
      bundle1.putBoolean("android.support.allowGeneratedReplies", e.e);
      if (Build.VERSION.SDK_INT >= 24)
        builder2.setAllowGeneratedReplies(e.e); 
      bundle1.putInt("android.support.action.semanticAction", e.g);
      if (Build.VERSION.SDK_INT >= 28)
        builder2.setSemanticAction(e.g); 
      if (Build.VERSION.SDK_INT >= 29)
        builder2.setContextual(e.h); 
      bundle1.putBoolean("android.support.action.showsUserInterface", e.f);
      builder2.addExtras(bundle1);
      this.a.addAction(builder2.build());
    } 
    Bundle bundle = ((g)builder).k;
    if (bundle != null)
      this.f.putAll(bundle); 
    this.c = null;
    this.d = null;
    this.a.setShowWhen(((g)builder).h);
    this.a.setLocalOnly(((g)builder).j).setGroup(null).setGroupSummary(false).setSortKey(null);
    this.g = ((g)builder).q;
    this.a.setCategory(null).setColor(((g)builder).l).setVisibility(((g)builder).m).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
    for (String str : ((g)builder).t)
      this.a.addPerson(str); 
    this.h = null;
    if (((g)builder).c.size() > 0) {
      if (((g)builder).k == null)
        ((g)builder).k = new Bundle(); 
      Bundle bundle1 = ((g)builder).k.getBundle("android.car.EXTENSIONS");
      bundle = bundle1;
      if (bundle1 == null)
        bundle = new Bundle(); 
      bundle1 = new Bundle();
      for (j = 0; j < ((g)builder).c.size(); j++)
        bundle1.putBundle(Integer.toString(j), j.a(((g)builder).c.get(j))); 
      bundle.putBundle("invisible_actions", bundle1);
      if (((g)builder).k == null)
        ((g)builder).k = new Bundle(); 
      ((g)builder).k.putBundle("android.car.EXTENSIONS", bundle);
      this.f.putBundle("android.car.EXTENSIONS", bundle);
    } 
    if (Build.VERSION.SDK_INT >= 24)
      this.a.setExtras(((g)builder).k).setRemoteInputHistory(null); 
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setBadgeIconType(((g)builder).p).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(((g)builder).q);
      if (!TextUtils.isEmpty(((g)builder).o))
        this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null); 
    } 
    if (Build.VERSION.SDK_INT >= 29) {
      this.a.setAllowSystemGeneratedContextualActions(((g)builder).r);
      this.a.setBubbleMetadata(null);
    } 
  }
  
  public final void a(Notification paramNotification) {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    int j = paramNotification.defaults & 0xFFFFFFFE;
    paramNotification.defaults = j;
    paramNotification.defaults = j & 0xFFFFFFFD;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */