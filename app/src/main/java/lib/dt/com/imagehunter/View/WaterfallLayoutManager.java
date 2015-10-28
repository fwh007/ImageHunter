package lib.dt.com.imagehunter.View;

import android.support.v7.widget.RecyclerView;

/**
 * 瀑布流LayoutManager
 * Created by Winter on 2015/10/17 0017.
 */
public class WaterfallLayoutManager extends RecyclerView.LayoutManager {
    @Override
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(
                RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public boolean canScrollVertically() {
        //We do allow scrolling
        return true;
    }
}
