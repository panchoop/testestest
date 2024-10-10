package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b.v.a;
import b.v.b;
import b.v.c;

public class RemoteActionCompatParcelizer {
  public static RemoteActionCompat read(a parama) {
    c c;
    RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
    IconCompat iconCompat = remoteActionCompat.a;
    if (parama.h(1))
      c = parama.k(); 
    remoteActionCompat.a = (IconCompat)c;
    remoteActionCompat.b = parama.g(remoteActionCompat.b, 2);
    remoteActionCompat.c = parama.g(remoteActionCompat.c, 3);
    remoteActionCompat.d = (PendingIntent)parama.j((Parcelable)remoteActionCompat.d, 4);
    remoteActionCompat.e = parama.f(remoteActionCompat.e, 5);
    remoteActionCompat.f = parama.f(remoteActionCompat.f, 6);
    return remoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, a parama) {
    if (parama != null) {
      IconCompat iconCompat = paramRemoteActionCompat.a;
      parama.l(1);
      parama.o((c)iconCompat);
      CharSequence charSequence = paramRemoteActionCompat.b;
      parama.l(2);
      b b = (b)parama;
      TextUtils.writeToParcel(charSequence, b.e, 0);
      charSequence = paramRemoteActionCompat.c;
      parama.l(3);
      TextUtils.writeToParcel(charSequence, b.e, 0);
      parama.n((Parcelable)paramRemoteActionCompat.d, 4);
      boolean bool = paramRemoteActionCompat.e;
      parama.l(5);
      b.e.writeInt(bool);
      bool = paramRemoteActionCompat.f;
      parama.l(6);
      b.e.writeInt(bool);
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\core\app\RemoteActionCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */