package library.slidewell.com.customlibrary.CustomView;

import android.app.SearchManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import library.slidewell.com.customlibrary.R;


public class searchView extends AppCompatActivity {

    android.widget.SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
       // setContentView(R.layout.activity_main);
//        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView = (android.widget.SearchView) findViewById(R.id.searchView);
        searchView.onActionViewExpanded();
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                searchView.clearFocus();
            }
        }, 300);

        listView = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Lychee");
        list.add("Gavava");
        list.add("Peech");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Papaya");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                if(list.contains(query))
                {
                    adapter.getFilter().filter(query);
                }
                else
                {
                    Toast.makeText(searchView.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                    adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}