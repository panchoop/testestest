package b.o.a;

import b.n.g;
import b.n.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
  public static <T extends g & t> a b(T paramT) {
    return new b((g)paramT, ((t)paramT).f());
  }
  
  @Deprecated
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\o\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */