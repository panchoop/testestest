package androidx.media;

import b.q.a;
import b.v.a;
import b.v.c;

public final class AudioAttributesCompatParcelizer {
  public static AudioAttributesCompat read(a parama) {
    a a1;
    c c;
    AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
    a a2 = audioAttributesCompat.a;
    if (!parama.h(1)) {
      a1 = a2;
    } else {
      c = a1.k();
    } 
    audioAttributesCompat.a = (a)c;
    return audioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, a parama) {
    if (parama != null) {
      a a1 = paramAudioAttributesCompat.a;
      parama.l(1);
      parama.o((c)a1);
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\media\AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */