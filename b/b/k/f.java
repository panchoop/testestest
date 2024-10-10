package b.b.k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class f implements AdapterView.OnItemClickListener {
  public final AlertController b;
  
  public final AlertController.b c;
  
  public f(AlertController.b paramb, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.c.r.onClick((DialogInterface)this.b.b, paramInt);
    if (!this.c.v)
      this.b.b.dismiss(); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */