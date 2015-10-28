package lib.dt.com.imagehunter.Activity;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import lib.dt.com.imagehunter.Helper.TestHelper;
import lib.dt.com.imagehunter.R;

/**
 * Created by Winter on 2015/10/19 0019.
 */
public class SearchFragment extends Fragment {

    List<String> imageList;

    RecyclerView recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        init(rootView);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        getData();
    }

    private void init(View view) {
        imageList = new ArrayList<>();

        recycler = (RecyclerView) view.findViewById(R.id.recycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position % 3 == 0 ? 2 : 1;
            }
        });
//        gridLayoutManager.setStackFromEnd(true);
        recycler.setLayoutManager(gridLayoutManager);
        recycler.setAdapter(new SearchAdapter());
        recycler.setItemAnimator(new DefaultItemAnimator());
    }

    private void getData() {
        for (int i = 0; i < 20; i++) {
            imageList.add(TestHelper.randomImageUrl());
        }
        recycler.getAdapter().notifyDataSetChanged();
    }

    private class SearchAdapter extends RecyclerView.Adapter {
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = getActivity().getLayoutInflater().inflate(R.layout.fragment_search_item, parent, false);
            return new Holder(itemView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof Holder) {
                ((Holder) holder).simpleDraweeView.setAspectRatio(1f);
                ((Holder) holder).simpleDraweeView.setImageURI(Uri.parse(imageList.get(position)));
            }
        }

        @Override
        public int getItemCount() {
            return imageList.size();
        }

        class Holder extends RecyclerView.ViewHolder {

            SimpleDraweeView simpleDraweeView;

            public Holder(View itemView) {
                super(itemView);
                simpleDraweeView = (SimpleDraweeView) itemView;
            }
        }
    }
}
