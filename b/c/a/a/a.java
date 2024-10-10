package b.c.a.a;

public class a extends c {
  public static volatile a c;
  
  public c a;
  
  public c b;
  
  public a() {
    b b = new b();
    this.b = b;
    this.a = b;
  }
  
  public static a b() {
    // Byte code:
    //   0: getstatic b/c/a/a/a.c : Lb/c/a/a/a;
    //   3: ifnull -> 10
    //   6: getstatic b/c/a/a/a.c : Lb/c/a/a/a;
    //   9: areturn
    //   10: ldc b/c/a/a/a
    //   12: monitorenter
    //   13: getstatic b/c/a/a/a.c : Lb/c/a/a/a;
    //   16: ifnonnull -> 31
    //   19: new b/c/a/a/a
    //   22: astore_0
    //   23: aload_0
    //   24: invokespecial <init> : ()V
    //   27: aload_0
    //   28: putstatic b/c/a/a/a.c : Lb/c/a/a/a;
    //   31: ldc b/c/a/a/a
    //   33: monitorexit
    //   34: getstatic b/c/a/a/a.c : Lb/c/a/a/a;
    //   37: areturn
    //   38: astore_0
    //   39: ldc b/c/a/a/a
    //   41: monitorexit
    //   42: aload_0
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   13	31	38	finally
    //   31	34	38	finally
    //   39	42	38	finally
  }
  
  public boolean a() {
    return this.a.a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\c\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */