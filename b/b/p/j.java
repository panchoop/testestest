package b.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import b.b.c;
import b.b.e;

public final class j {
  public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  
  public static j c;
  
  public n0 a;
  
  public static j a() {
    // Byte code:
    //   0: ldc b/b/p/j
    //   2: monitorenter
    //   3: getstatic b/b/p/j.c : Lb/b/p/j;
    //   6: ifnonnull -> 12
    //   9: invokestatic e : ()V
    //   12: getstatic b/b/p/j.c : Lb/b/p/j;
    //   15: astore_0
    //   16: ldc b/b/p/j
    //   18: monitorexit
    //   19: aload_0
    //   20: areturn
    //   21: astore_0
    //   22: ldc b/b/p/j
    //   24: monitorexit
    //   25: aload_0
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	21	finally
    //   12	16	21	finally
  }
  
  public static PorterDuffColorFilter c(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc b/b/p/j
    //   2: monitorenter
    //   3: iload_0
    //   4: aload_1
    //   5: invokestatic h : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   8: astore_1
    //   9: ldc b/b/p/j
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: ldc b/b/p/j
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	14	finally
  }
  
  public static void e() {
    // Byte code:
    //   0: ldc b/b/p/j
    //   2: monitorenter
    //   3: getstatic b/b/p/j.c : Lb/b/p/j;
    //   6: ifnonnull -> 60
    //   9: new b/b/p/j
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic b/b/p/j.c : Lb/b/p/j;
    //   21: aload_0
    //   22: invokestatic d : ()Lb/b/p/n0;
    //   25: putfield a : Lb/b/p/n0;
    //   28: getstatic b/b/p/j.c : Lb/b/p/j;
    //   31: getfield a : Lb/b/p/n0;
    //   34: astore_0
    //   35: new b/b/p/j$a
    //   38: astore_1
    //   39: aload_1
    //   40: invokespecial <init> : ()V
    //   43: aload_0
    //   44: monitorenter
    //   45: aload_0
    //   46: aload_1
    //   47: putfield g : Lb/b/p/n0$e;
    //   50: aload_0
    //   51: monitorexit
    //   52: goto -> 60
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: ldc b/b/p/j
    //   62: monitorexit
    //   63: return
    //   64: astore_0
    //   65: ldc b/b/p/j
    //   67: monitorexit
    //   68: aload_0
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   3	45	64	finally
    //   45	50	55	finally
    //   50	52	64	finally
    //   56	60	64	finally
  }
  
  public static void f(Drawable paramDrawable, v0 paramv0, int[] paramArrayOfint) {
    n0.l(paramDrawable, paramv0, paramArrayOfint);
  }
  
  public Drawable b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lb/b/p/n0;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public ColorStateList d(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lb/b/p/n0;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual i : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public class a implements n0.e {
    public final int[] a = new int[] { e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha };
    
    public final int[] b = new int[] { e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha };
    
    public final int[] c = new int[] { e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light };
    
    public final int[] d = new int[] { e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult };
    
    public final int[] e = new int[] { e.abc_tab_indicator_material, e.abc_textfield_search_material };
    
    public final int[] f = new int[] { e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim };
    
    public final boolean a(int[] param1ArrayOfint, int param1Int) {
      int i = param1ArrayOfint.length;
      for (byte b = 0; b < i; b++) {
        if (param1ArrayOfint[b] == param1Int)
          return true; 
      } 
      return false;
    }
    
    public final ColorStateList b(Context param1Context, int param1Int) {
      int k = s0.c(param1Context, b.b.a.colorControlHighlight);
      int j = s0.b(param1Context, b.b.a.colorButtonNormal);
      int[] arrayOfInt1 = s0.b;
      int[] arrayOfInt2 = s0.d;
      int i = b.i.f.a.a(k, param1Int);
      int[] arrayOfInt3 = s0.c;
      k = b.i.f.a.a(k, param1Int);
      return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3, s0.f }, new int[] { j, i, k, param1Int });
    }
    
    public ColorStateList c(Context param1Context, int param1Int) {
      if (param1Int == e.abc_edit_text_material)
        return b.b.l.a.a.a(param1Context, c.abc_tint_edittext); 
      if (param1Int == e.abc_switch_track_mtrl_alpha)
        return b.b.l.a.a.a(param1Context, c.abc_tint_switch_track); 
      if (param1Int == e.abc_switch_thumb_material) {
        int[][] arrayOfInt1 = new int[3][];
        int[] arrayOfInt = new int[3];
        ColorStateList colorStateList = s0.d(param1Context, b.b.a.colorSwitchThumbNormal);
        if (colorStateList != null && colorStateList.isStateful()) {
          arrayOfInt1[0] = s0.b;
          arrayOfInt[0] = colorStateList.getColorForState(arrayOfInt1[0], 0);
          arrayOfInt1[1] = s0.e;
          arrayOfInt[1] = s0.c(param1Context, b.b.a.colorControlActivated);
          arrayOfInt1[2] = s0.f;
          arrayOfInt[2] = colorStateList.getDefaultColor();
        } else {
          arrayOfInt1[0] = s0.b;
          arrayOfInt[0] = s0.b(param1Context, b.b.a.colorSwitchThumbNormal);
          arrayOfInt1[1] = s0.e;
          arrayOfInt[1] = s0.c(param1Context, b.b.a.colorControlActivated);
          arrayOfInt1[2] = s0.f;
          arrayOfInt[2] = s0.c(param1Context, b.b.a.colorSwitchThumbNormal);
        } 
        return new ColorStateList(arrayOfInt1, arrayOfInt);
      } 
      return (param1Int == e.abc_btn_default_mtrl_shape) ? b(param1Context, s0.c(param1Context, b.b.a.colorButtonNormal)) : ((param1Int == e.abc_btn_borderless_material) ? b(param1Context, 0) : ((param1Int == e.abc_btn_colored_material) ? b(param1Context, s0.c(param1Context, b.b.a.colorAccent)) : ((param1Int == e.abc_spinner_mtrl_am_alpha || param1Int == e.abc_spinner_textfield_background_material) ? b.b.l.a.a.a(param1Context, c.abc_tint_spinner) : (a(this.b, param1Int) ? s0.d(param1Context, b.b.a.colorControlNormal) : (a(this.e, param1Int) ? b.b.l.a.a.a(param1Context, c.abc_tint_default) : (a(this.f, param1Int) ? b.b.l.a.a.a(param1Context, c.abc_tint_btn_checkable) : ((param1Int == e.abc_seekbar_thumb_material) ? b.b.l.a.a.a(param1Context, c.abc_tint_seek_thumb) : null)))))));
    }
    
    public final void d(Drawable param1Drawable, int param1Int, PorterDuff.Mode param1Mode) {
      Drawable drawable = param1Drawable;
      if (e0.a(param1Drawable))
        drawable = param1Drawable.mutate(); 
      PorterDuff.Mode mode = param1Mode;
      if (param1Mode == null)
        mode = j.b; 
      drawable.setColorFilter((ColorFilter)j.c(param1Int, mode));
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */