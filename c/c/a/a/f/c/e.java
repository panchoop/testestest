package c.c.a.a.f.c;

public abstract class e {
  public int a(CharSequence paramCharSequence, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface length : ()I
    //   6: istore_3
    //   7: iload_2
    //   8: iflt -> 48
    //   11: iload_2
    //   12: iload_3
    //   13: if_icmpgt -> 48
    //   16: iload_2
    //   17: iload_3
    //   18: if_icmpge -> 44
    //   21: aload_0
    //   22: aload_1
    //   23: iload_2
    //   24: invokeinterface charAt : (I)C
    //   29: invokevirtual b : (C)Z
    //   32: ifeq -> 38
    //   35: goto -> 46
    //   38: iinc #2, 1
    //   41: goto -> 16
    //   44: iconst_m1
    //   45: istore_2
    //   46: iload_2
    //   47: ireturn
    //   48: new java/lang/IndexOutOfBoundsException
    //   51: dup
    //   52: iload_2
    //   53: iload_3
    //   54: ldc 'index'
    //   56: invokestatic B0 : (IILjava/lang/String;)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: athrow
  }
  
  public abstract boolean b(char paramChar);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */