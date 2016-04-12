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
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        // Add some sample items.

        addItem(new DummyItem("1",
                "Lead Scientist (Formulas)",
                "Lead formula creation team to produce world-class food and treats that pets truly love.",
                "Barkeley, CA",
                new Company(4.2f, "Purina", "We make pet food, treats, and litter.", R.drawable.purina_logo),
                "• PhD in Genetic Engineering, Biochemistry, Bioengineering, Cell Biology, or a related discipline\n" +
                        "• A passion for dog food and a desire to create new formulas that will make dogs salivate like never before\n" +
                        "• Working knowledge of Microsoft Word a plus"
        ));

        addItem(new DummyItem("2",
                "Quality Assurance Analyst (Bones Department)",
                "Insure industry-leading quality through rigorous primary source testing",
                "Sheddington, CA",
                new Company(4.0f, "Greenies", "We sell dog treats.", R.drawable.greenies_logo),
                "• 5+ years experience A/B testing wide variety of dog treats\n" +
                        "• Expert-level understanding of what makes a truly exceptional dog bone\n" +
                        "• Experience using multiple industry-standard testing tools (Selenium, Appium, Charles, Wireshark, etc.)\n" +
                        "• Desired: Experience testing in an agile development team; ScrumMaster certification"
        ));

        addItem(new DummyItem("3,",
                "Senior Counsel, Territorial Disputes",
                "Provide legal counsel to canines in crises",
                "San Francisco, CA",
                new Company(3.5f, "Slobbinger & Pawlmer LLP", "We help dogs in need.\n" +
                        "**Slobbinger & Pawlmer LLP is an equal opportunity employer and does " +
                        "not discriminate based on breed, size, or neutered/spayed status.**", R.drawable.slobbinger_logo),
                "• Minimum 6 Bachelor’s degrees, 4 Master's degrees, 2 Doctorates\n" +
                        "• 4+ years experience in Territorial Dispute Litigation\n" +
                        "• Proven record of winning cases. If you always lose your cases this is not the place for you.\n" +
                        "• Proficiency in Microsoft Excel a major plus"
        ));

        addItem(new DummyItem("4",
                "Junior Security Officer",
                "Ensure premises are secure at all times",
                "Sausalito, CA",
                new Company(2.1f, "Lassie's Luxury Treat House", "We feed dogs.", R.drawable.luxury_logo),
                "• 100 decibels minimum bark level\n" +
                        "• Demonstrated ability to understand and effectively react to situations of adversity with tact, diplomacy, and courtesy\n" +
                        "• Your hair must be neatly cut and groomed. Hair will be cut short enough to prevent it from standing out when the uniform cap or hat is worn"
        ));

        addItem(new DummyItem("5",
                "Lead Breeder",
                "Ensure posterity of species through reproductive means",
                "Palo Alto, CA",
                new Company(3.0f, "Litter of Fun", "We make dogs.", R.drawable.litteroffun_logo),
                "• Track record of consistent ability to execute with proven results\n" +
                        "• Have you won any awards at dog shows? We'd love to hear from you!\n" +
                        "• To apply: Send headshots and CV to litteroffun@gmale.com"
        ));

        addItem(new DummyItem("6",
                "Canine Engagement Manager",
                "Promote office dog engagement and satisfaction at Glassdoor's offices, rated among the best in the world for dogs." +
                        " Handle grievances aired by office dogs against human employees.",
                "Mill Valley, CA",
                new Company(4.5f, "Glassdoor", "We help people find jobs they love.", R.drawable.glassdoor_logo),
                "• A high level of energy with a keen sense for motivating others\n" +
                        "• High degree of creativity and out-of-the-box thinking\n" +
                        "• At least 4 years of progressively responsible canine resources experience\n" +
                        "• Perks: Our office is human-friendly! Bring your humans to work whenever you please."
        ));

        addItem(new DummyItem("7",
                "Human Walker (Contract)",
                "Lead my (Tammy's) human companions on daily walks around the Bay Area, ensuring they are familiar with the local territories (hydrants, trees, etc.)" +
                        " that I (Tammy) have dominion over. I'm going on vacation for awhile.",
                "San Francisco, CA",
                new Company(3.4f, "Tammy", "Just looking for someone to walk my humans until the end of the month.", R.drawable.australian_shepherd),
                "• Must have deep knowledge of San Francisco's city layout\n" +
                        "• Minimum 3 years experience in Human Walking industry\n" +
                        "• Expertise in relative human-friendliness of each San Francisco neighborhood\n" +
                        "• Excellent people skills a must\n" +
                        "• Must be willing to listen to humans talk about SF's best vegan restaurants"
        ));

        addItem(new DummyItem("8",
                "Senior Editor, 3 Under 3",
                "Cover the most influential pups under the age of 3 for our new series \"Forbes 3 Under 3\". Be on the front lines of the dogs making the biggest bark" +
                        " in the areas of dogpreneurship, social impact, and technology.",
                "San Jose, CA",
                new Company(3.8f, "Forbes", "We are the world's premier magazine covering the foremost purebred and mixed breed thought leaders.", R.drawable.forbes_logo),
                "• Deep familiarity with Forbes' content, tone, style, and lens\n" +
                        "• Fluency in English a must\n" +
                        "• Working knowledge of Spanish a big plus\n" +
                        "• 2+ years creating content for a major publisher or agency, in either a freelance or full-time capacity\n" +
                        "• Demonstrated in-depth knowledge of national dog startup landscape"
        ));

        addItem(new DummyItem("9",
                "Director of Interspecies Relations",
                "Make sure all pets in the Petco family maintain peaceful relations with each other",
                "Houndsville, CA",
                new Company(3.0f, "Petco", "We sell pets.", R.drawable.petco_logo),
                "• Minimum 7 (dog) years experience in Interspecies Conflict Resolution\n" +
                        "• Fluency in Cat, Ferret, Parakeet, and Hamster an absolute must\n" +
                        "• Ability, maturity level and discretion required to be exposed to highly confidential personal issues\n" +
                        "• HUGE PLUS: California motor vehicle operator’s license"
        ));

    }
    //bullet point: \u2022

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
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
        public final String skills;

        public DummyItem(String id, String position, String description, String location, Company company, String skills) {

            this.id = id;
            this.position = position;
            this.description = description;
            this.location = location;
            this.company = company;
            this.skills = skills;

        }

        @Override
        public String toString() {
            return position;
        }
    }
}
