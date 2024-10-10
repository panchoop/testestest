package b.b.p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class x {
  public TextView a;
  
  public TextClassifier b;
  
  public x(TextView paramTextView) {
    this.a = paramTextView;
  }
  
  public TextClassifier a() {
    TextClassifier textClassifier2 = this.b;
    TextClassifier textClassifier1 = textClassifier2;
    if (textClassifier2 == null) {
      TextClassificationManager textClassificationManager = (TextClassificationManager)this.a.getContext().getSystemService(TextClassificationManager.class);
      if (textClassificationManager != null)
        return textClassificationManager.getTextClassifier(); 
      textClassifier1 = TextClassifier.NO_OP;
    } 
    return textClassifier1;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */