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
                "Lead Scientist (Formulas)",
                "Lead formula creation team to produce world-class food and treats that pets truly love.",
                "Barkeley, CA",
                new Company(4.2f, "Purina", "We make pet food, treats, and litter.", R.drawable.purina_logo)
        ));

        addItem(new DummyItem("2",
                "Quality Assurance Analyst (Bones Department)",
                "Insure industry-leading quality through rigorous primary source testing",
                "Sheddington, CA",
                new Company(4.0f, "Greenies", "We sell dog treats.", R.drawable.greenies_logo)
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

        addItem(new DummyItem("6",
                "Canine Engagement Manager",
                "Promote office dog engagement and satisfaction at Glassdoor's offices, rated among the best in the world for dogs." +
                        " Handle grievances aired by office dogs against human employees.",
                "Mill Valley, CA",
                new Company(4.5f, "Glassdoor", "We help people find jobs they love.", R.drawable.glassdoor_logo)));

        addItem(new DummyItem("7",
                "Human Walker (Contract)",
                "Lead my (Tammy's) human companions on daily walks around the Bay Area, ensuring they are familiar with the local territories (hydrants, trees, etc.)" +
                        " that I (Tammy) have dominion over. I'm going on vacation for awhile.",
                "San Francisco, CA",
                new Company(3.4f, "Tammy", "Just looking for someone to walk my humans until the end of the month.", R.drawable.australian_shepherd)));

        addItem(new DummyItem("8",
                "Senior Editor, 3 Under 3",
                "Cover the most influential pups under the age of 3 for our new series \"Forbes 3 Under 3\". Be on the front lines of the dogs making the biggest bark" +
                        " in the areas of dogpreneurship, social impact, and technology.",
                "San Jose, CA",
                new Company(3.8f, "Forbes", "We are the world's premier magazine covering the foremost purebred and mixed breed thought leaders.", R.drawable.forbes_logo)));

        addItem(new DummyItem("9",
                "Director of Interspecies Relations",
                "Make sure all pets maintain peaceful relations with each other",
                "Houndsville, CA",
                new Company(3.0f, "Petco", "We sell pets.", R.drawable.petco_logo)
        ));

    }
    //bullet point: \u2022

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
