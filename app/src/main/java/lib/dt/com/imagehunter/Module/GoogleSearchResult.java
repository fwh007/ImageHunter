package lib.dt.com.imagehunter.Module;

/**
 * Created by Winter on 2015/11/13 0013.
 */
public class GoogleSearchResult {

    public ResponseData responseData;

    public String responseDetails;

    public int responseStatus;

    public class ResponseData {
        public Result[] results;

        public Cursor cursor;

        public class Result implements Image {

            public String GsearchResultClass;

            public String width;

            public String height;

            public String imageId;

            public String tbWidth;

            public String tbHeight;

            public String unescapedUrl;

            public String url;

            public String visibleUrl;

            public String title;

            public String titleNoFormatting;

            public String originalContextUrl;

            public String content;

            public String contentNoFormatting;

            public String tbUrl;

            @Override
            public String getImageUrl() {
                return url;
            }
        }

        public class Cursor {
            public String resultCount;

            public Page[] pages;

            public long estimatedResultCount;

            public int currentPageIndex;

            public String moreResultsUrl;

            public float searchResultTime;

            public class Page {
                public String start;

                public int label;
            }
        }
    }

}
