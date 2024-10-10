package c.c.b.h;

import android.net.Uri;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.r;
import c.c.a.a.f.c.s;
import java.util.Arrays;
import java.util.Set;

public class a {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  static {
    r r = new r();
    r.a("recoverEmail", Integer.valueOf(2));
    int j = 0;
    byte b = 0;
    int i = 0;
    r.a("resetPassword", Integer.valueOf(0));
    r.a("signIn", Integer.valueOf(4));
    r.a("verifyEmail", Integer.valueOf(1));
    r.a("verifyBeforeChangeEmail", Integer.valueOf(5));
    r.a("revertSecondFactorAddition", Integer.valueOf(6));
    int k = r.b;
    Object[] arrayOfObject = r.a;
    if (k == 0) {
      s s = (s)s.h;
    } else {
      Object object1;
      Object object2;
      if (k == 1) {
        object1 = arrayOfObject[0];
        object2 = arrayOfObject[1];
      } else {
        q.A0(k, object2.length >> 1);
        int n = Math.max(k, 2);
        int m = 1073741824;
        if (n < 751619276) {
          int i1 = Integer.highestOneBit(n - 1) << 1;
          while (true) {
            m = i1;
            if (i1 * 0.7D < n) {
              i1 <<= 1;
              continue;
            } 
            break;
          } 
        } else {
          boolean bool;
          if (n < 1073741824) {
            bool = true;
          } else {
            bool = false;
          } 
          if (!bool)
            throw new IllegalArgumentException("collection too large"); 
        } 
        if (k == 1) {
          object1 = object2[0];
          object2 = object2[1];
        } else {
          n = m - 1;
          if (m <= 128) {
            byte[] arrayOfByte = new byte[m];
            Arrays.fill(arrayOfByte, (byte)-1);
            int i1 = i;
            label69: while (i1 < k) {
              i = i1 * 2;
              Object object = object2[i];
              object1 = object2[i ^ 0x1];
              q.x0(object, object1);
              m = q.l0(object.hashCode());
              while (true) {
                j = m & n;
                m = arrayOfByte[j] & 0xFF;
                if (m == 255) {
                  arrayOfByte[j] = (byte)i;
                  i1++;
                  continue label69;
                } 
                if (!object2[m].equals(object)) {
                  m = j + 1;
                  continue;
                } 
                throw s.a(object, object1, object2, m);
              } 
            } 
          } else if (m <= 32768) {
            short[] arrayOfShort = new short[m];
            Arrays.fill(arrayOfShort, (short)-1);
            int i1 = j;
            label70: while (i1 < k) {
              i = i1 * 2;
              Object object = object2[i];
              object1 = object2[i ^ 0x1];
              q.x0(object, object1);
              m = q.l0(object.hashCode());
              while (true) {
                m &= n;
                j = arrayOfShort[m] & 0xFFFF;
                if (j == 65535) {
                  arrayOfShort[m] = (short)i;
                  i1++;
                  continue label70;
                } 
                if (!object2[j].equals(object)) {
                  m++;
                  continue;
                } 
                throw s.a(object, object1, object2, j);
              } 
            } 
          } else {
            int[] arrayOfInt = new int[m];
            Arrays.fill(arrayOfInt, -1);
            byte b1 = b;
            label71: while (b1 < k) {
              i = b1 * 2;
              Object object = object2[i];
              object1 = object2[i ^ 0x1];
              q.x0(object, object1);
              m = q.l0(object.hashCode());
              while (true) {
                j = m & n;
                m = arrayOfInt[j];
                if (m == -1) {
                  arrayOfInt[j] = i;
                  b1++;
                  continue label71;
                } 
                if (!object2[m].equals(object)) {
                  m = j + 1;
                  continue;
                } 
                throw s.a(object, object1, object2, m);
              } 
            } 
          } 
          return;
        } 
      } 
      q.x0(object1, object2);
    } 
  }
  
  public a(String paramString) {
    this.a = b(paramString, "apiKey");
    this.b = b(paramString, "oobCode");
    String str = b(paramString, "mode");
    this.c = str;
    if (this.a != null && this.b != null && str != null) {
      b(paramString, "continueUrl");
      b(paramString, "languageCode");
      this.d = b(paramString, "tenantId");
      return;
    } 
    throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[] { "apiKey", "oobCode", "mode" }));
  }
  
  public static a a(String paramString) {
    q.d(paramString);
    try {
      return new a(paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      return null;
    } 
  }
  
  public static String b(String paramString1, String paramString2) {
    Uri uri = Uri.parse(paramString1);
    try {
      Set set = uri.getQueryParameterNames();
      if (set.contains(paramString2))
        return uri.getQueryParameter(paramString2); 
      if (set.contains("link"))
        return Uri.parse(uri.getQueryParameter("link")).getQueryParameter(paramString2); 
    } catch (UnsupportedOperationException unsupportedOperationException) {}
    return null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */