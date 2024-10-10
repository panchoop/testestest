package c.c.a.a.f.c;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class s<K, V> extends o<K, V> {
  public static final o<Object, Object> h = new s(null, new Object[0], 0);
  
  public final transient Object e;
  
  public final transient Object[] f;
  
  public final transient int g;
  
  public s(Object paramObject, Object[] paramArrayOfObject, int paramInt) {
    this.e = paramObject;
    this.f = paramArrayOfObject;
    this.g = paramInt;
  }
  
  public static IllegalArgumentException a(Object paramObject1, Object paramObject2, Object[] paramArrayOfObject, int paramInt) {
    paramObject1 = String.valueOf(paramObject1);
    String str2 = String.valueOf(paramObject2);
    paramObject2 = String.valueOf(paramArrayOfObject[paramInt]);
    String str1 = String.valueOf(paramArrayOfObject[paramInt ^ 0x1]);
    paramInt = paramObject1.length();
    int i = str2.length();
    int j = paramObject2.length();
    StringBuilder stringBuilder = new StringBuilder(str1.length() + j + i + paramInt + 39);
    stringBuilder.append("Multiple entries with same key: ");
    stringBuilder.append((String)paramObject1);
    stringBuilder.append("=");
    stringBuilder.append(str2);
    stringBuilder.append(" and ");
    stringBuilder.append((String)paramObject2);
    stringBuilder.append("=");
    stringBuilder.append(str1);
    return new IllegalArgumentException(stringBuilder.toString());
  }
  
  @NullableDecl
  public final V get(@NullableDecl Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Ljava/lang/Object;
    //   4: astore #6
    //   6: aload_0
    //   7: getfield f : [Ljava/lang/Object;
    //   10: astore #5
    //   12: aload_0
    //   13: getfield g : I
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 23
    //   21: aconst_null
    //   22: areturn
    //   23: iload_2
    //   24: iconst_1
    //   25: if_icmpne -> 46
    //   28: aload #5
    //   30: iconst_0
    //   31: aaload
    //   32: aload_1
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifeq -> 44
    //   39: aload #5
    //   41: iconst_1
    //   42: aaload
    //   43: areturn
    //   44: aconst_null
    //   45: areturn
    //   46: aload #6
    //   48: ifnonnull -> 53
    //   51: aconst_null
    //   52: areturn
    //   53: aload #6
    //   55: instanceof [B
    //   58: ifeq -> 132
    //   61: aload #6
    //   63: checkcast [B
    //   66: astore #6
    //   68: aload #6
    //   70: arraylength
    //   71: istore_3
    //   72: aload_1
    //   73: invokevirtual hashCode : ()I
    //   76: invokestatic l0 : (I)I
    //   79: istore_2
    //   80: iload_2
    //   81: iload_3
    //   82: iconst_1
    //   83: isub
    //   84: iand
    //   85: istore #4
    //   87: aload #6
    //   89: iload #4
    //   91: baload
    //   92: sipush #255
    //   95: iand
    //   96: istore_2
    //   97: iload_2
    //   98: sipush #255
    //   101: if_icmpne -> 106
    //   104: aconst_null
    //   105: areturn
    //   106: aload #5
    //   108: iload_2
    //   109: aaload
    //   110: aload_1
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 124
    //   117: aload #5
    //   119: iload_2
    //   120: iconst_1
    //   121: ixor
    //   122: aaload
    //   123: areturn
    //   124: iload #4
    //   126: iconst_1
    //   127: iadd
    //   128: istore_2
    //   129: goto -> 80
    //   132: aload #6
    //   134: instanceof [S
    //   137: ifeq -> 209
    //   140: aload #6
    //   142: checkcast [S
    //   145: astore #6
    //   147: aload #6
    //   149: arraylength
    //   150: istore_3
    //   151: aload_1
    //   152: invokevirtual hashCode : ()I
    //   155: invokestatic l0 : (I)I
    //   158: istore_2
    //   159: iload_2
    //   160: iload_3
    //   161: iconst_1
    //   162: isub
    //   163: iand
    //   164: istore_2
    //   165: aload #6
    //   167: iload_2
    //   168: saload
    //   169: ldc 65535
    //   171: iand
    //   172: istore #4
    //   174: iload #4
    //   176: ldc 65535
    //   178: if_icmpne -> 183
    //   181: aconst_null
    //   182: areturn
    //   183: aload #5
    //   185: iload #4
    //   187: aaload
    //   188: aload_1
    //   189: invokevirtual equals : (Ljava/lang/Object;)Z
    //   192: ifeq -> 203
    //   195: aload #5
    //   197: iload #4
    //   199: iconst_1
    //   200: ixor
    //   201: aaload
    //   202: areturn
    //   203: iinc #2, 1
    //   206: goto -> 159
    //   209: aload #6
    //   211: checkcast [I
    //   214: astore #6
    //   216: aload #6
    //   218: arraylength
    //   219: istore_3
    //   220: aload_1
    //   221: invokevirtual hashCode : ()I
    //   224: invokestatic l0 : (I)I
    //   227: istore_2
    //   228: iload_2
    //   229: iload_3
    //   230: iconst_1
    //   231: isub
    //   232: iand
    //   233: istore #4
    //   235: aload #6
    //   237: iload #4
    //   239: iaload
    //   240: istore_2
    //   241: iload_2
    //   242: iconst_m1
    //   243: if_icmpne -> 248
    //   246: aconst_null
    //   247: areturn
    //   248: aload #5
    //   250: iload_2
    //   251: aaload
    //   252: aload_1
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifeq -> 266
    //   259: aload #5
    //   261: iload_2
    //   262: iconst_1
    //   263: ixor
    //   264: aaload
    //   265: areturn
    //   266: iload #4
    //   268: iconst_1
    //   269: iadd
    //   270: istore_2
    //   271: goto -> 228
  }
  
  public final int size() {
    return this.g;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */