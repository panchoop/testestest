package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import b.q.b;
import b.v.a;

public final class AudioAttributesImplApi21Parcelizer {
  public static b read(a parama) {
    b b = new b();
    b.a = (AudioAttributes)parama.j((Parcelable)b.a, 1);
    b.b = parama.i(b.b, 2);
    return b;
  }
  
  public static void write(b paramb, a parama) {
    if (parama != null) {
      parama.n((Parcelable)paramb.a, 1);
      parama.m(paramb.b, 2);
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\media\AudioAttributesImplApi21Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */