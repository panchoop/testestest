package b.i.j;

import android.util.Base64;
import java.util.List;

public final class a {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final List<List<byte[]>> d;
  
  public final int e;
  
  public final String f;
  
  public a(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    if (paramList != null) {
      this.d = paramList;
      this.e = 0;
      StringBuilder stringBuilder = new StringBuilder(paramString1);
      stringBuilder.append("-");
      stringBuilder.append(this.b);
      stringBuilder.append("-");
      stringBuilder.append(this.c);
      this.f = stringBuilder.toString();
      return;
    } 
    throw null;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = c.a.a.a.a.e("FontRequest {mProviderAuthority: ");
    stringBuilder2.append(this.a);
    stringBuilder2.append(", mProviderPackage: ");
    stringBuilder2.append(this.b);
    stringBuilder2.append(", mQuery: ");
    stringBuilder2.append(this.c);
    stringBuilder2.append(", mCertificates:");
    stringBuilder1.append(stringBuilder2.toString());
    for (byte b = 0; b < this.d.size(); b++) {
      stringBuilder1.append(" [");
      List<byte[]> list = this.d.get(b);
      for (byte b1 = 0; b1 < list.size(); b1++) {
        stringBuilder1.append(" \"");
        stringBuilder1.append(Base64.encodeToString(list.get(b1), 0));
        stringBuilder1.append("\"");
      } 
      stringBuilder1.append(" ]");
    } 
    stringBuilder1.append("}");
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("mCertificatesArray: ");
    stringBuilder2.append(this.e);
    stringBuilder1.append(stringBuilder2.toString());
    return stringBuilder1.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */