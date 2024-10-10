package c.a.b.w;

import c.a.b.h;
import c.a.b.o;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class f extends a {
  public final b a = null;
  
  public final SSLSocketFactory b = null;
  
  public static void b(HttpURLConnection paramHttpURLConnection, o<?> paramo, byte[] paramArrayOfbyte) {
    paramHttpURLConnection.setDoOutput(true);
    if (!paramHttpURLConnection.getRequestProperties().containsKey("Content-Type"))
      paramHttpURLConnection.setRequestProperty("Content-Type", paramo.e()); 
    DataOutputStream dataOutputStream = new DataOutputStream(paramHttpURLConnection.getOutputStream());
    dataOutputStream.write(paramArrayOfbyte);
    dataOutputStream.close();
  }
  
  public static List<h> c(Map<String, List<String>> paramMap) {
    ArrayList<h> arrayList = new ArrayList(paramMap.size());
    for (Map.Entry<String, List<String>> entry : paramMap.entrySet()) {
      if (entry.getKey() != null)
        for (String str : entry.getValue())
          arrayList.add(new h((String)entry.getKey(), str));  
    } 
    return arrayList;
  }
  
  public static void d(HttpURLConnection paramHttpURLConnection, o<?> paramo) {
    String str;
    switch (paramo.c) {
      default:
        throw new IllegalStateException("Unknown method type.");
      case 7:
        paramHttpURLConnection.setRequestMethod("PATCH");
        arrayOfByte = paramo.d();
        if (arrayOfByte != null)
          b(paramHttpURLConnection, paramo, arrayOfByte); 
        return;
      case 6:
        str = "TRACE";
        paramHttpURLConnection.setRequestMethod(str);
        return;
      case 5:
        str = "OPTIONS";
        paramHttpURLConnection.setRequestMethod(str);
        return;
      case 4:
        str = "HEAD";
        paramHttpURLConnection.setRequestMethod(str);
        return;
      case 3:
        str = "DELETE";
        paramHttpURLConnection.setRequestMethod(str);
        return;
      case 2:
        paramHttpURLConnection.setRequestMethod("PUT");
        arrayOfByte = str.d();
        if (arrayOfByte != null)
          b(paramHttpURLConnection, (o<?>)str, arrayOfByte); 
        return;
      case 1:
        paramHttpURLConnection.setRequestMethod("POST");
        arrayOfByte = str.d();
        if (arrayOfByte != null)
          b(paramHttpURLConnection, (o<?>)str, arrayOfByte); 
        return;
      case 0:
        str = "GET";
        paramHttpURLConnection.setRequestMethod(str);
        return;
      case -1:
        break;
    } 
    byte[] arrayOfByte = str.h();
    if (arrayOfByte != null) {
      paramHttpURLConnection.setRequestMethod("POST");
      b(paramHttpURLConnection, (o<?>)str, arrayOfByte);
    } 
  }
  
  public e a(o<?> paramo, Map<String, String> paramMap) {
    String str2 = paramo.d;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.putAll(paramMap);
    hashMap.putAll(paramo.g());
    b b1 = this.a;
    String str1 = str2;
    if (b1 != null) {
      str1 = b1.a(str2);
      if (str1 == null)
        throw new IOException(c.a.a.a.a.c("URL blocked by rewriter: ", str2)); 
    } 
    URL uRL = new URL(str1);
    HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
    httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
    int i = paramo.n.a;
    httpURLConnection.setConnectTimeout(i);
    httpURLConnection.setReadTimeout(i);
    boolean bool = false;
    httpURLConnection.setUseCaches(false);
    httpURLConnection.setDoInput(true);
    if ("https".equals(uRL.getProtocol())) {
      SSLSocketFactory sSLSocketFactory = this.b;
      if (sSLSocketFactory != null)
        ((HttpsURLConnection)httpURLConnection).setSSLSocketFactory(sSLSocketFactory); 
    } 
    try {
      for (String str : hashMap.keySet())
        httpURLConnection.setRequestProperty(str, (String)hashMap.get(str)); 
      d(httpURLConnection, paramo);
      int j = httpURLConnection.getResponseCode();
    } finally {
      paramo = null;
    } 
    if (i == 0)
      httpURLConnection.disconnect(); 
    throw paramo;
  }
  
  public static class a extends FilterInputStream {
    public final HttpURLConnection b;
    
    public a(HttpURLConnection param1HttpURLConnection) {
      super(inputStream);
      InputStream inputStream;
      this.b = param1HttpURLConnection;
    }
    
    public void close() {
      super.close();
      this.b.disconnect();
    }
  }
  
  public static interface b {
    String a(String param1String);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */