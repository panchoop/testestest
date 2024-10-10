package androidx.media;

import b.q.c;
import b.v.a;

public final class AudioAttributesImplBaseParcelizer {
  public static c read(a parama) {
    c c = new c();
    c.a = parama.i(c.a, 1);
    c.b = parama.i(c.b, 2);
    c.c = parama.i(c.c, 3);
    c.d = parama.i(c.d, 4);
    return c;
  }
  
  public static void write(c paramc, a parama) {
    if (parama != null) {
      parama.m(paramc.a, 1);
      parama.m(paramc.b, 2);
      parama.m(paramc.c, 3);
      parama.m(paramc.d, 4);
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\media\AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */