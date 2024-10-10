package c.a.a.a;

import android.util.Pair;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import c.c.a.a.c.l.q;
import org.xmlpull.v1.XmlPullParser;

public class a {
  public static String a(RecyclerView paramRecyclerView, StringBuilder paramStringBuilder) {
    paramStringBuilder.append(paramRecyclerView.exceptionLabel());
    return paramStringBuilder.toString();
  }
  
  public static String b(String paramString1, Fragment paramFragment, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(paramFragment);
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  public static String c(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  public static String d(XmlPullParser paramXmlPullParser, StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramXmlPullParser.getPositionDescription());
    paramStringBuilder.append(paramString);
    return paramStringBuilder.toString();
  }
  
  public static StringBuilder e(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    return stringBuilder;
  }
  
  public static void f(int paramInt1, String paramString, int paramInt2, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder(paramInt1);
    stringBuilder.append(paramString);
    stringBuilder.append(paramInt2);
    q.i(paramBoolean, stringBuilder.toString());
  }
  
  public static void g(String paramString1, String paramString2, SparseArray paramSparseArray, int paramInt) {
    paramSparseArray.put(paramInt, new Pair(paramString1, paramString2));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */