package alberto.example.com.tableview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> mData;

    RecyclerView mListView;
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();
    }

    private void getData() {
        mAdapter.setData(mData);
    }

    private void initRecyclerView() {
        mListView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mAdapter = new ListAdapter(this);
        mListView.setLayoutManager(new LinearLayoutManager(this));
        mListView.setAdapter(mAdapter);
    }

    private void initData() {
        mData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    }
}
