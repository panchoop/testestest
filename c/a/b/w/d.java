package c.a.b.w;

import android.os.SystemClock;
import c.a.b.b;
import c.a.b.h;
import c.a.b.v;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class d implements b {
  public final Map<String, a> a = new LinkedHashMap<String, a>(16, 0.75F, true);
  
  public long b = 0L;
  
  public final File c;
  
  public final int d;
  
  public d(File paramFile) {
    this.c = paramFile;
    this.d = 5242880;
  }
  
  public static int g(InputStream paramInputStream) {
    int i = paramInputStream.read();
    if (i != -1)
      return i; 
    throw new EOFException();
  }
  
  public static int h(InputStream paramInputStream) {
    int j = g(paramInputStream);
    int i = g(paramInputStream);
    int k = g(paramInputStream);
    return g(paramInputStream) << 24 | j << 0 | 0x0 | i << 8 | k << 16;
  }
  
  public static long i(InputStream paramInputStream) {
    return (g(paramInputStream) & 0xFFL) << 0L | 0x0L | (g(paramInputStream) & 0xFFL) << 8L | (g(paramInputStream) & 0xFFL) << 16L | (g(paramInputStream) & 0xFFL) << 24L | (g(paramInputStream) & 0xFFL) << 32L | (g(paramInputStream) & 0xFFL) << 40L | (g(paramInputStream) & 0xFFL) << 48L | (0xFFL & g(paramInputStream)) << 56L;
  }
  
  public static String j(b paramb) {
    return new String(l(paramb, i(paramb)), "UTF-8");
  }
  
  public static byte[] l(b paramb, long paramLong) {
    long l = paramb.b - paramb.c;
    if (paramLong >= 0L && paramLong <= l) {
      int i = (int)paramLong;
      if (i == paramLong) {
        byte[] arrayOfByte = new byte[i];
        (new DataInputStream(paramb)).readFully(arrayOfByte);
        return arrayOfByte;
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("streamToBytes length=");
    stringBuilder.append(paramLong);
    stringBuilder.append(", maxLength=");
    stringBuilder.append(l);
    throw new IOException(stringBuilder.toString());
  }
  
  public static void m(OutputStream paramOutputStream, int paramInt) {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  public static void n(OutputStream paramOutputStream, long paramLong) {
    paramOutputStream.write((byte)(int)(paramLong >>> 0L));
    paramOutputStream.write((byte)(int)(paramLong >>> 8L));
    paramOutputStream.write((byte)(int)(paramLong >>> 16L));
    paramOutputStream.write((byte)(int)(paramLong >>> 24L));
    paramOutputStream.write((byte)(int)(paramLong >>> 32L));
    paramOutputStream.write((byte)(int)(paramLong >>> 40L));
    paramOutputStream.write((byte)(int)(paramLong >>> 48L));
    paramOutputStream.write((byte)(int)(paramLong >>> 56L));
  }
  
  public static void o(OutputStream paramOutputStream, String paramString) {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    n(paramOutputStream, arrayOfByte.length);
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/io/File;
    //   6: invokevirtual listFiles : ()[Ljava/io/File;
    //   9: astore_3
    //   10: aload_3
    //   11: ifnull -> 37
    //   14: aload_3
    //   15: arraylength
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_1
    //   19: iload_1
    //   20: iload_2
    //   21: if_icmpge -> 37
    //   24: aload_3
    //   25: iload_1
    //   26: aaload
    //   27: invokevirtual delete : ()Z
    //   30: pop
    //   31: iinc #1, 1
    //   34: goto -> 19
    //   37: aload_0
    //   38: getfield a : Ljava/util/Map;
    //   41: invokeinterface clear : ()V
    //   46: aload_0
    //   47: lconst_0
    //   48: putfield b : J
    //   51: ldc 'Cache cleared.'
    //   53: iconst_0
    //   54: anewarray java/lang/Object
    //   57: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_3
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	63	finally
    //   14	17	63	finally
    //   24	31	63	finally
    //   37	60	63	finally
  }
  
  public File b(String paramString) {
    return new File(this.c, c(paramString));
  }
  
  public final String c(String paramString) {
    int i = paramString.length() / 2;
    StringBuilder stringBuilder = c.a.a.a.a.e(String.valueOf(paramString.substring(0, i).hashCode()));
    stringBuilder.append(String.valueOf(paramString.substring(i).hashCode()));
    return stringBuilder.toString();
  }
  
  public final void d(int paramInt) {
    int i;
    long l2 = this.b;
    long l1 = paramInt;
    if (l2 + l1 < this.d)
      return; 
    if (v.a)
      v.d("Pruning old cache entries.", new Object[0]); 
    long l3 = this.b;
    l2 = SystemClock.elapsedRealtime();
    Iterator<Map.Entry> iterator = this.a.entrySet().iterator();
    paramInt = 0;
    while (true) {
      i = paramInt;
      if (iterator.hasNext()) {
        a a = (a)((Map.Entry)iterator.next()).getValue();
        if (b(a.b).delete()) {
          this.b -= a.a;
        } else {
          String str = a.b;
          v.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { str, c(str) });
        } 
        iterator.remove();
        paramInt++;
        if ((float)(this.b + l1) < this.d * 0.9F) {
          i = paramInt;
          break;
        } 
        continue;
      } 
      break;
    } 
    if (v.a)
      v.d("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.b - l3), Long.valueOf(SystemClock.elapsedRealtime() - l2) }); 
  }
  
  public void e(String paramString, b.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: getfield a : [B
    //   7: arraylength
    //   8: invokevirtual d : (I)V
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual b : (Ljava/lang/String;)Ljava/io/File;
    //   16: astore_3
    //   17: new java/io/BufferedOutputStream
    //   20: astore #4
    //   22: new java/io/FileOutputStream
    //   25: astore #5
    //   27: aload #5
    //   29: aload_3
    //   30: invokespecial <init> : (Ljava/io/File;)V
    //   33: aload #4
    //   35: aload #5
    //   37: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   40: new c/a/b/w/d$a
    //   43: astore #5
    //   45: aload #5
    //   47: aload_1
    //   48: aload_2
    //   49: invokespecial <init> : (Ljava/lang/String;Lc/a/b/b$a;)V
    //   52: aload #5
    //   54: aload #4
    //   56: invokevirtual c : (Ljava/io/OutputStream;)Z
    //   59: ifeq -> 86
    //   62: aload #4
    //   64: aload_2
    //   65: getfield a : [B
    //   68: invokevirtual write : ([B)V
    //   71: aload #4
    //   73: invokevirtual close : ()V
    //   76: aload_0
    //   77: aload_1
    //   78: aload #5
    //   80: invokevirtual f : (Ljava/lang/String;Lc/a/b/w/d$a;)V
    //   83: aload_0
    //   84: monitorexit
    //   85: return
    //   86: aload #4
    //   88: invokevirtual close : ()V
    //   91: ldc_w 'Failed to write header for %s'
    //   94: iconst_1
    //   95: anewarray java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload_3
    //   101: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   104: aastore
    //   105: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: new java/io/IOException
    //   111: astore_1
    //   112: aload_1
    //   113: invokespecial <init> : ()V
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: aload_3
    //   120: invokevirtual delete : ()Z
    //   123: ifne -> 143
    //   126: ldc_w 'Could not clean up file %s'
    //   129: iconst_1
    //   130: anewarray java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_3
    //   136: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_0
    //   144: monitorexit
    //   145: return
    //   146: astore_1
    //   147: aload_0
    //   148: monitorexit
    //   149: aload_1
    //   150: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	146	finally
    //   17	83	118	java/io/IOException
    //   17	83	146	finally
    //   86	118	118	java/io/IOException
    //   86	118	146	finally
    //   119	143	146	finally
  }
  
  public final void f(String paramString, a parama) {
    if (!this.a.containsKey(paramString)) {
      this.b += parama.a;
    } else {
      a a1 = this.a.get(paramString);
      long l = this.b;
      this.b = parama.a - a1.a + l;
    } 
    this.a.put(paramString, parama);
  }
  
  public void k(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual b : (Ljava/lang/String;)Ljava/io/File;
    //   7: invokevirtual delete : ()Z
    //   10: istore_2
    //   11: aload_0
    //   12: getfield a : Ljava/util/Map;
    //   15: aload_1
    //   16: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast c/a/b/w/d$a
    //   24: astore_3
    //   25: aload_3
    //   26: ifnull -> 42
    //   29: aload_0
    //   30: aload_0
    //   31: getfield b : J
    //   34: aload_3
    //   35: getfield a : J
    //   38: lsub
    //   39: putfield b : J
    //   42: iload_2
    //   43: ifne -> 67
    //   46: ldc 'Could not delete cache entry for key=%s, filename=%s'
    //   48: iconst_2
    //   49: anewarray java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: aload_1
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: aload_0
    //   59: aload_1
    //   60: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   63: aastore
    //   64: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	25	70	finally
    //   29	42	70	finally
    //   46	67	70	finally
  }
  
  public static class a {
    public long a;
    
    public final String b;
    
    public final String c;
    
    public final long d;
    
    public final long e;
    
    public final long f;
    
    public final long g;
    
    public final List<h> h;
    
    public a(String param1String, b.a param1a) {
      this(param1String, str, l1, l2, l3, l4, list);
      this.a = param1a.a.length;
    }
    
    public a(String param1String1, String param1String2, long param1Long1, long param1Long2, long param1Long3, long param1Long4, List<h> param1List) {
      this.b = param1String1;
      param1String1 = param1String2;
      if ("".equals(param1String2))
        param1String1 = null; 
      this.c = param1String1;
      this.d = param1Long1;
      this.e = param1Long2;
      this.f = param1Long3;
      this.g = param1Long4;
      this.h = param1List;
    }
    
    public static a a(d.b param1b) {
      if (d.h(param1b) == 538247942) {
        String str2 = d.j(param1b);
        String str1 = d.j(param1b);
        long l1 = d.i(param1b);
        long l4 = d.i(param1b);
        long l3 = d.i(param1b);
        long l2 = d.i(param1b);
        int i = d.h(param1b);
        if (i >= 0) {
          List<?> list;
          if (i == 0) {
            list = Collections.emptyList();
          } else {
            list = new ArrayList();
          } 
          for (byte b1 = 0; b1 < i; b1++)
            list.add(new h(d.j(param1b).intern(), d.j(param1b).intern())); 
          return new a(str2, str1, l1, l4, l3, l2, (List)list);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("readHeaderList size=");
        stringBuilder.append(i);
        throw new IOException(stringBuilder.toString());
      } 
      throw new IOException();
    }
    
    public b.a b(byte[] param1ArrayOfbyte) {
      b.a a1 = new b.a();
      a1.a = param1ArrayOfbyte;
      a1.b = this.c;
      a1.c = this.d;
      a1.d = this.e;
      a1.e = this.f;
      a1.f = this.g;
      List<h> list = this.h;
      TreeMap<String, Object> treeMap = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
      for (h h : list)
        treeMap.put(h.a, h.b); 
      a1.g = treeMap;
      a1.h = Collections.unmodifiableList(this.h);
      return a1;
    }
    
    public boolean c(OutputStream param1OutputStream) {
      try {
        String str;
        d.m(param1OutputStream, 538247942);
        d.o(param1OutputStream, this.b);
        if (this.c == null) {
          str = "";
        } else {
          str = this.c;
        } 
        d.o(param1OutputStream, str);
        d.n(param1OutputStream, this.d);
        d.n(param1OutputStream, this.e);
        d.n(param1OutputStream, this.f);
        d.n(param1OutputStream, this.g);
        List<h> list = this.h;
        if (list != null) {
          d.m(param1OutputStream, list.size());
          for (h h : list) {
            d.o(param1OutputStream, h.a);
            d.o(param1OutputStream, h.b);
          } 
        } else {
          d.m(param1OutputStream, 0);
        } 
        param1OutputStream.flush();
        return true;
      } catch (IOException iOException) {
        v.b("%s", new Object[] { iOException.toString() });
        return false;
      } 
    }
  }
  
  public static class b extends FilterInputStream {
    public final long b;
    
    public long c;
    
    public b(InputStream param1InputStream, long param1Long) {
      super(param1InputStream);
      this.b = param1Long;
    }
    
    public int read() {
      int i = super.read();
      if (i != -1)
        this.c++; 
      return i;
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      param1Int1 = super.read(param1ArrayOfbyte, param1Int1, param1Int2);
      if (param1Int1 != -1)
        this.c += param1Int1; 
      return param1Int1;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */