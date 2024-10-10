package b.j.a;

import android.database.Cursor;
import android.widget.Filter;
import b.b.p.r0;

public class b extends Filter {
  public a a;
  
  public b(a parama) {
    this.a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject) {
    a a1 = this.a;
    paramObject = paramObject;
    return ((r0)a1).c((Cursor)paramObject);
  }
  
  public Filter.FilterResults performFiltering(CharSequence paramCharSequence) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/j/a/b$a;
    //   4: checkcast b/b/p/r0
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 132
    //   12: aload_1
    //   13: ifnonnull -> 22
    //   16: ldc ''
    //   18: astore_1
    //   19: goto -> 29
    //   22: aload_1
    //   23: invokeinterface toString : ()Ljava/lang/String;
    //   28: astore_1
    //   29: aload_2
    //   30: getfield m : Landroidx/appcompat/widget/SearchView;
    //   33: invokevirtual getVisibility : ()I
    //   36: ifne -> 88
    //   39: aload_2
    //   40: getfield m : Landroidx/appcompat/widget/SearchView;
    //   43: invokevirtual getWindowVisibility : ()I
    //   46: ifeq -> 52
    //   49: goto -> 88
    //   52: aload_2
    //   53: aload_2
    //   54: getfield n : Landroid/app/SearchableInfo;
    //   57: aload_1
    //   58: bipush #50
    //   60: invokevirtual h : (Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
    //   63: astore_1
    //   64: aload_1
    //   65: ifnull -> 88
    //   68: aload_1
    //   69: invokeinterface getCount : ()I
    //   74: pop
    //   75: goto -> 90
    //   78: astore_1
    //   79: ldc 'SuggestionsAdapter'
    //   81: ldc 'Search suggestions query threw an exception.'
    //   83: aload_1
    //   84: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aconst_null
    //   89: astore_1
    //   90: new android/widget/Filter$FilterResults
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: astore_2
    //   98: aload_1
    //   99: ifnull -> 120
    //   102: aload_2
    //   103: aload_1
    //   104: invokeinterface getCount : ()I
    //   109: putfield count : I
    //   112: aload_2
    //   113: aload_1
    //   114: putfield values : Ljava/lang/Object;
    //   117: goto -> 130
    //   120: aload_2
    //   121: iconst_0
    //   122: putfield count : I
    //   125: aload_2
    //   126: aconst_null
    //   127: putfield values : Ljava/lang/Object;
    //   130: aload_2
    //   131: areturn
    //   132: aconst_null
    //   133: athrow
    // Exception table:
    //   from	to	target	type
    //   52	64	78	java/lang/RuntimeException
    //   68	75	78	java/lang/RuntimeException
  }
  
  public void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults) {
    a a1 = this.a;
    Cursor cursor = ((a)a1).d;
    Object object = paramFilterResults.values;
    if (object != null && object != cursor) {
      object = object;
      ((r0)a1).b((Cursor)object);
    } 
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\j\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */