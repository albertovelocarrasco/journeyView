package alberto.example.com.tableview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Alberto Velo Carrasco on 12/09/15.
 */
public class ListAdapter extends RecyclerView.Adapter<JourneyViewHolder> {

    List<Data> mData;
    Context mContext;

    public ListAdapter(Context context) {
        mContext = context;
    }

    public void setData(List<Data> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        if (isDataNotEmpty() && mData.size() > position) {
            return mData.get(position).hashCode();
        } else {
            return 0;
        }
    }

    @Override
    public JourneyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JourneyViewHolder(inflateLayout(parent, R.layout.list_item), mContext);
    }

    private View inflateLayout(ViewGroup parent, int resourceId) {
        return LayoutInflater.from(parent.getContext()).inflate(resourceId, parent, false);
    }

    @Override
    public void onBindViewHolder(
            JourneyViewHolder holder, int position) {
        if (isDataNotEmpty() && mData.size() > position) {
            Data data = mData.get(position);
            holder.setDepartureStation(data.originStationName);
            holder.setDepartureStatus(data.departureStatus);
            holder.setDepartureTime(data.departureTime);
            holder.setCompanyName(data.company);
            holder.setArrivalStation(data.destinationStationName);
            holder.setArrivalTime(data.arrivalTime);
            holder.setButtonLabel(data.buttonLabel);
            holder.setSeatReservations(data.seatRervation);
        }
    }

    private boolean isDataNotEmpty() {
        return mData != null && mData.size() > 0;
    }

    @Override
    public int getItemCount() {
        return mData != null ? mData.size() : 0;
    }

}
