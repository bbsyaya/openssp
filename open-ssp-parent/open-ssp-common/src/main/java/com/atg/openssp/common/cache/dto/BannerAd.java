package com.atg.openssp.common.cache.dto;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.annotations.SerializedName;
import openrtb.tables.BannerAdType;
import openrtb.tables.CreativeAttribute;
import openrtb.tables.ExpandableDirectionType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Sorensen
 *
 */
public class BannerAd implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("id")
    private String id;

    @SerializedName("bidfloor_currency")
    private String bidfloorCurrency = "EUR";

    @SerializedName("bidfloor_price")
    private float bidfloorPrice;

    private Integer w;
    private Integer h;

    private String adUnitCode;
    private String size;
    private String promo_sizes;

    @SerializedName("placement_id")
    private String placementId;

    private List<String> mimes;
    private List<BannerAdType> btypes;
    private List<CreativeAttribute> battrs;

    private int topframe;
    private List<ExpandableDirectionType> expdir;
    private List<Integer> api;
    private Object ext;
    private int wmax;
    private int hmax;
    private int wmin;
    private int hmin;
    private List<Object> format;

    // ?Public Service Ad (unpaid);
//    private String psa;

    public BannerAd() {
        mimes = new ArrayList<>();
        btypes = new ArrayList<>();
        battrs = new ArrayList<>();
        expdir = new ArrayList<>();
        api = new ArrayList<>();
        format = new ArrayList<>();
    }

    public final String getId() {
        return id;
    }

    public final void setId(final String id) {
        this.id = id;
    }

    public String getBidfloorCurrency() {
        return bidfloorCurrency;
    }

    public final void setBidfloorCurrency(final String bidfloorCurrency) {
        this.bidfloorCurrency = bidfloorCurrency;
    }

    public final float getBidfloorPrice() {
        return bidfloorPrice;
    }

    public final void setBidfloorPrice(final float bidfloorPrice) {
        this.bidfloorPrice = bidfloorPrice;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public void setAdUnitCode(String adUnitCode) {
        this.adUnitCode = adUnitCode;
    }

    public String getAdUnitCode() {
        return adUnitCode;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setPromoSizes(String promoSizes) {
        this.promo_sizes = promoSizes;
    }

    public String getPromoSizes() {
        return promo_sizes;
    }

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    public String getPlacementId() {
        return placementId;
    }

    public void addMime(String mime) {
        mimes.add(mime);
    }

    public List<String> getMimes() {
        ArrayList<String> list = new ArrayList();
        list.addAll(mimes);
        return list;
    }

    public void setMimes(List<String> mimes) {
        this.mimes.clear();
        if (mimes != null) {
            this.mimes.addAll(mimes);
        }
    }

    public void addBtype(BannerAdType btype) {
        btypes.add(btype);
    }

    public List<BannerAdType> getBtypes() {
        ArrayList<BannerAdType> list = new ArrayList();
        list.addAll(btypes);
        return list;
    }

    public void setBtypes(List<BannerAdType> btypes) {
        this.btypes.clear();
        if (btypes != null) {
            this.btypes.addAll(btypes);
        }
    }

    public void addBattr(CreativeAttribute battr) {
        if (battr != null) {
            battrs.add(battr);
        }
    }

    public List<CreativeAttribute> getBattrs() {
        ArrayList<CreativeAttribute> list = new ArrayList();
        list.addAll(battrs);
        return list;
    }

    public void setBattrs(List<CreativeAttribute> battrs) {
        this.battrs.clear();
        if (battrs != null) {
            this.battrs.addAll(battrs);
        }
    }

    public void setTopframe(int topframe) {
        this.topframe = topframe;
    }

    public int getTopframe() {
        return topframe;
    }


    public void addExpdir(ExpandableDirectionType expdir) {
        if (expdir != null) {
            this.expdir.add(expdir);
        }
    }

    public void setExpdir(List<ExpandableDirectionType> expdir) {
        this.expdir.clear();
        if (expdir != null) {
            this.expdir.addAll(expdir);
        }
    }

    public List<ExpandableDirectionType> getExpdir() {
        return expdir;
    }


    public void addApi(Integer api) {
        if (api != null) {
            this.api.add(api);
        }
    }

    public void setApi(List<Integer> api) {
        this.api.clear();
        if (api!= null) {
            this.api.addAll(api);
        }
    }

    public List<Integer> getApi() {
        return api;
    }


    public void setExt(Object ext) {
        this.ext = ext;
    }

    public Object getExt() {
        return ext;
    }


    public void setWmax(int wmax) {
        this.wmax = wmax;
    }

    public int getWmax() {
        return wmax;
    }


    public void setHmax(int hmax) {
        this.hmax = hmax;
    }

    public int getHmax() {
        return hmax;
    }


    public void setWmin(int wmin) {
        this.wmin = wmin;
    }

    public int getWmin() {
        return wmin;
    }


    public void setHmin(int hmin) {
        this.hmin = hmin;
    }

    public int getHmin() {
        return hmin;
    }

    public void addFormat(Object format) {
        if (format != null) {
            this.format.add(format);
        }
    }

    public void setFormat(List<Object> format) {
        this.format.clear();
        if (format!= null) {
            this.format.addAll(format);
        }
    }

    public List<Object> getFormat() {
        return format;
    }


//    public void setPsa(String psa) {
//        this.psa = psa;
//    }

//    public String getPsa() {
//        return psa;
//    }

    @Override
    public String toString() {
        return String.format("BannerAd [id=%s, placementId=%s, bidfloorCurrency=%s, bidfloorPrice=%s, adUnitCode=%s, size=%s, promoSizes=%s]", id, placementId, bidfloorCurrency, bidfloorPrice,
                adUnitCode, size, promo_sizes);
    }

    /**
     * This method is used to add type adapters for use in Gson.  If we want to have an enum index in the json but have the code use the enum, for example.
     * Currently we store the "String" value we want in the object, and the methods do the conversion, but when we change them to hold the enum instead, we need an adapter
     * to handle the conversion for us.
     * @param builder
     */
    public static void populateTypeAdapters(GsonBuilder builder) {
        builder.registerTypeAdapter(BannerAdType.class, (JsonDeserializer<BannerAdType>) (json, typeOfT, context) -> BannerAdType.convertValue(json.getAsInt()));
        builder.registerTypeAdapter(CreativeAttribute.class, (JsonDeserializer<CreativeAttribute>) (json, typeOfT, context) -> CreativeAttribute.convertValue(json.getAsInt()));
        builder.registerTypeAdapter(ExpandableDirectionType.class, (JsonDeserializer<ExpandableDirectionType>) (json, typeOfT, context) -> ExpandableDirectionType.convertValue(json.getAsInt()));
    }

}
