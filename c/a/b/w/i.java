package c.a.b.w;

import java.io.ByteArrayOutputStream;

public class i extends ByteArrayOutputStream {
  public final c b;
  
  public i(c paramc, int paramInt) {
    this.b = paramc;
    this.buf = paramc.a(Math.max(paramInt, 256));
  }
  
  public final void a(int paramInt) {
    int j = this.count;
    if (j + paramInt <= this.buf.length)
      return; 
    byte[] arrayOfByte = this.b.a((j + paramInt) * 2);
    System.arraycopy(this.buf, 0, arrayOfByte, 0, this.count);
    this.b.b(this.buf);
    this.buf = arrayOfByte;
  }
  
  public void close() {
    this.b.b(this.buf);
    this.buf = null;
    super.close();
  }
  
  public void finalize() {
    this.b.b(this.buf);
  }
  
  public void write(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: invokevirtual a : (I)V
    //   7: aload_0
    //   8: iload_1
    //   9: invokespecial write : (I)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_2
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_2
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_3
    //   4: invokevirtual a : (I)V
    //   7: aload_0
    //   8: aload_1
    //   9: iload_2
    //   10: iload_3
    //   11: invokespecial write : ([BII)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */