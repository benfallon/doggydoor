package com.benjaminafallon.androidapps.example999.dummy;

import com.benjaminafallon.androidapps.example999.Company;
import com.benjaminafallon.androidapps.example999.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem("1",
                "Director of Interspecies Relations",
                "Make sure all pets maintain peaceful relations with each other",
                "Houndsville, CA",
                new Company(4.5f, "Petco", "We sell animals.", R.drawable.petco_logo)
        ));

        addItem(new DummyItem("2",
                "Quality Assurance Analyst (Bones Department)",
                "Insure industry-leading quality through rigorous primary source testing",
                "Sheddington, CA",
                new Company(4.2f, "Greenies", "We sell dog treats.", R.drawable.greenies_logo)
        ));


        addItem(new DummyItem("3,",
                "Senior Counsel, Territorial Disputes",
                "Provide legal counsel to canines in crises",
                "San Francisco, CA",
                new Company(3.5f, "Slobbinger & Pawlmer LLP", "We help dogs in need.", R.drawable.slobbinger_logo)
        ));

        addItem(new DummyItem("4",
                "Junior Security Officer",
                "Ensure premises are secure at all times",
                "Sausalito, CA",
                new Company(2.1f, "Lassie's Luxury Treat House", "We feed dogs.", R.drawable.luxury_logo)));

        addItem(new DummyItem("5",
                "Lead Breeder",
                "Ensure posterity of species through reproductive means",
                "Palo Alto, CA",
                new Company(3.0f, "Litter of Fun", "We make dogs.", R.drawable.litteroffun_logo)));
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        //return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
        return new DummyItem("id: " + position, String.valueOf(position), "Job " + position, makeDetails(position), new Company(2.1f, "Lassie's Luxury Treat House", "We feed dogs.", R.drawable.luxury_logo));

    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String position;
        public final String description;
        public final String location;
        public final Company company;

        public DummyItem(String id, String position, String description, String location, Company company) {

            this.id = id;
            this.position = position;
            this.description = description;
            this.location = location;
            this.company = company;

        }

        @Override
        public String toString() {
            return position;
        }
    }
}
