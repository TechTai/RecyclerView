package nyc.c4q.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by MsNehisi on 11/4/17.
 */


// Create and add an adapter to adapt your dataset
public class ColorAdapter extends RecyclerView.Adapter {

    private List<Model> models;

    // Type is an Object and the Object is Model in this example
    public ColorAdapter (List<Model> models) {
        // Empty constructor at first then updated with the below
        this.models = models;
    }
    // There was a error when only the above text was written. You must implement the below methods which are given to you when using "option + enter"

    // Gets viewgroup of the parent - this is what the layout is going to attach to which will give you access to be passed to next method.
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //This can be done within our view holder class itself but you will also see the layout defined in the adapter as such
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_viewholder, parent, false);

        //The view is then passed to an instance of our CustomViewHolder
        return new ColorViewHolder(view);
    }

    // Passes the view holder created by adapter and the position (zero indexed to n (list.size))
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ColorViewHolder colorViewHolder = (ColorViewHolder) holder;
        colorViewHolder.bind(models.get(position));

    }
    // Returns # of RecyclerView. if out of bounds then it will crash.
    @Override
    public int getItemCount() {
//        return 0; // generated by Android Studio for the method then updated below
        return models.size();
    }
}
