package alberto.example.com.tableview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Data> mData;

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
        Data data1 = new Data(
                "13:45", "On time", "15:45", "Origin station", "Destination "
                + "station", "company", "live times", getReservations(2));
        Data data2 = new Data(
                null, null, null, "Origin station very very very very very "
                + "very very very very very long name", "Destination station very very very very "
                        + "very"
                        + " very very very very very long name", "company", null, null);
        Data data3 = new Data(
                "13:45", null, "00:00", "origin station", "destination "
                + "station", "company", "3 stops, 15 mins View", getReservations
                (8));

        Data data4 = new Data(
                "13:45", "On time", "15:45", "Origin station very very very very "
                + "very very very very very very long name", "Destination station very very very"
                        + " very very very very very very very long name", "company", null, null);
        mData = new ArrayList<>(
                Arrays.asList(
                        data1, data2, data3, data4, data1, data2, data3, data4,
                        data1, data2, data3, data4, data1, data2, data3, data4));
    }

    private List<String> getReservations(int reservationNumber) {
        List<String> reservations = new ArrayList<>();
        for (int i = 1; i <= reservationNumber; i++) {
            reservations.add("Seat reservation " + i);
        }
        return reservations;
    }
}
