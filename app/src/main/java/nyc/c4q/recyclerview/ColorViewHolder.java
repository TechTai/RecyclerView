package nyc.c4q.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by MsNehisi on 11/4/17.
 */

public class ColorViewHolder extends RecyclerView.ViewHolder {
    public ColorViewHolder(View itemView) {
        super(itemView);
    }
    public void bind(Model model){
//        String colorValue = model.getColor();
//        int colorInt = Color.parseColor(colorValue);
//        itemView.setBackgroundColor(colorInt);
        itemView.setBackgroundColor(Color.parseColor(model.getColor()));
    }
}
