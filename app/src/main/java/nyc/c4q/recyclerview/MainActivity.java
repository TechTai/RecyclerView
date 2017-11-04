package nyc.c4q.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the reference in your context(activity). -- Remember findViewById()
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // Add a layout manager - you can use these keywords for context - "this"(just the activity), "getBaseContext", "getApplicationContext" (strongest keyword for use - i.e. - bluetooth)
        // Build necessities
        LinearLayoutManager manager = new LinearLayoutManager(this);
        ColorAdapter adapter = new ColorAdapter(buildModelList());

        // Create and add an adapter to adapt your dataset - after declaring it here then hit "option + enter" to create the ColorAdapter class for me as a shortcut
//        recyclerView.setAdapter(new ColorAdapter(new ArrayList<Model>()));  This was an empty arrayList

        // Assign values
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    // Builds List Model and returns it
    private List<Model> buildModelList(){
        List<Model> modelList = new ArrayList<>();
        modelList.add(new Model("#ffffff"));
        modelList.add(new Model("#f9982f"));
        modelList.add(new Model("#e3ee31"));
        modelList.add(new Model("#4366b0"));
        modelList.add(new Model("#2f90f9"));
        modelList.add(new Model ("#bbbbbb"));
        modelList.add(new Model("#aaaaaa"));
        return modelList;
    }
}
