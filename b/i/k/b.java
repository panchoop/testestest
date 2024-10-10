package b.i.k;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public class b implements Spannable {
  public char charAt(int paramInt) {
    throw null;
  }
  
  public int getSpanEnd(Object paramObject) {
    throw null;
  }
  
  public int getSpanFlags(Object paramObject) {
    throw null;
  }
  
  public int getSpanStart(Object paramObject) {
    throw null;
  }
  
  @SuppressLint({"NewApi"})
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass) {
    paramInt1 = Build.VERSION.SDK_INT;
    throw null;
  }
  
  public int length() {
    throw null;
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass) {
    throw null;
  }
  
  @SuppressLint({"NewApi"})
  public void removeSpan(Object paramObject) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      int i = Build.VERSION.SDK_INT;
      throw null;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  @SuppressLint({"NewApi"})
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3) {
    if (!(paramObject instanceof android.text.style.MetricAffectingSpan)) {
      paramInt1 = Build.VERSION.SDK_INT;
      throw null;
    } 
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2) {
    throw null;
  }
  
  public String toString() {
    throw null;
  }
  
  public static final class a {
    public final TextPaint a;
    
    public final TextDirectionHeuristic b;
    
    public final int c;
    
    public final int d;
    
    public a(PrecomputedText.Params param1Params) {
      this.a = param1Params.getTextPaint();
      this.b = param1Params.getTextDirection();
      this.c = param1Params.getBreakStrategy();
      this.d = param1Params.getHyphenationFrequency();
      int i = Build.VERSION.SDK_INT;
    }
    
    @SuppressLint({"NewApi"})
    public a(TextPaint param1TextPaint, TextDirectionHeuristic param1TextDirectionHeuristic, int param1Int1, int param1Int2) {
      if (Build.VERSION.SDK_INT >= 29)
        (new PrecomputedText.Params.Builder(param1TextPaint)).setBreakStrategy(param1Int1).setHyphenationFrequency(param1Int2).setTextDirection(param1TextDirectionHeuristic).build(); 
      this.a = param1TextPaint;
      this.b = param1TextDirectionHeuristic;
      this.c = param1Int1;
      this.d = param1Int2;
    }
    
    public boolean a(a param1a) {
      if (Build.VERSION.SDK_INT >= 23) {
        if (this.c != param1a.c)
          return false; 
        if (this.d != param1a.d)
          return false; 
      } 
      if (this.a.getTextSize() != param1a.a.getTextSize())
        return false; 
      if (this.a.getTextScaleX() != param1a.a.getTextScaleX())
        return false; 
      if (this.a.getTextSkewX() != param1a.a.getTextSkewX())
        return false; 
      if (this.a.getLetterSpacing() != param1a.a.getLetterSpacing())
        return false; 
      if (!TextUtils.equals(this.a.getFontFeatureSettings(), param1a.a.getFontFeatureSettings()))
        return false; 
      if (this.a.getFlags() != param1a.a.getFlags())
        return false; 
      if (Build.VERSION.SDK_INT >= 24) {
        if (!this.a.getTextLocales().equals(param1a.a.getTextLocales()))
          return false; 
      } else if (!this.a.getTextLocale().equals(param1a.a.getTextLocale())) {
        return false;
      } 
      if (this.a.getTypeface() == null) {
        if (param1a.a.getTypeface() != null)
          return false; 
      } else if (!this.a.getTypeface().equals(param1a.a.getTypeface())) {
        return false;
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == this)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return !a((a)param1Object) ? false : (!(this.b != ((a)param1Object).b));
    }
    
    public int hashCode() {
      return (Build.VERSION.SDK_INT >= 24) ? Objects.hash(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) }) : Objects.hash(new Object[] { 
            Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), 
            Integer.valueOf(this.d) });
    }
    
    public String toString() {
      Locale locale;
      StringBuilder stringBuilder3;
      StringBuilder stringBuilder4 = new StringBuilder("{");
      StringBuilder stringBuilder2 = c.a.a.a.a.e("textSize=");
      stringBuilder2.append(this.a.getTextSize());
      stringBuilder4.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", textScaleX=");
      stringBuilder2.append(this.a.getTextScaleX());
      stringBuilder4.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", textSkewX=");
      stringBuilder2.append(this.a.getTextSkewX());
      stringBuilder4.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", letterSpacing=");
      stringBuilder2.append(this.a.getLetterSpacing());
      stringBuilder4.append(stringBuilder2.toString());
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append(", elegantTextHeight=");
      stringBuilder2.append(this.a.isElegantTextHeight());
      stringBuilder4.append(stringBuilder2.toString());
      if (Build.VERSION.SDK_INT >= 24) {
        stringBuilder3 = c.a.a.a.a.e(", textLocale=");
        LocaleList localeList = this.a.getTextLocales();
      } else {
        stringBuilder3 = c.a.a.a.a.e(", textLocale=");
        locale = this.a.getTextLocale();
      } 
      stringBuilder3.append(locale);
      stringBuilder4.append(stringBuilder3.toString());
      StringBuilder stringBuilder1 = c.a.a.a.a.e(", typeface=");
      stringBuilder1.append(this.a.getTypeface());
      stringBuilder4.append(stringBuilder1.toString());
      if (Build.VERSION.SDK_INT >= 26) {
        stringBuilder1 = c.a.a.a.a.e(", variationSettings=");
        stringBuilder1.append(this.a.getFontVariationSettings());
        stringBuilder4.append(stringBuilder1.toString());
      } 
      stringBuilder1 = c.a.a.a.a.e(", textDir=");
      stringBuilder1.append(this.b);
      stringBuilder4.append(stringBuilder1.toString());
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(", breakStrategy=");
      stringBuilder1.append(this.c);
      stringBuilder4.append(stringBuilder1.toString());
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(", hyphenationFrequency=");
      stringBuilder1.append(this.d);
      stringBuilder4.append(stringBuilder1.toString());
      stringBuilder4.append("}");
      return stringBuilder4.toString();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */