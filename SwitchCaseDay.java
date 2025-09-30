public class SwitchCaseDay {

    public static void main(String[] args) {

        int ch = 2; // 🔧 You can change this value between 1 and 7

        System.out.println("Select a day (1-7):");
        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");

        System.out.println("Your choice: " + ch + "\n");

        switch (ch) {
            case 1:
                System.out.println(
                    "Planet: Sun (Surya)\n" +
                    "Deity: Surya Bhagavan (Sun God)\n" +
                    "Significance:\n" +
                    "- Associated with vitality, health, authority, and leadership.\n" +
                    "- Fasting on Sundays is believed to remove ailments, especially related to the eyes, bones, and skin.\n" +
                    "- People worship Surya by offering water (Arghya) at sunrise.\n" +
                    "- Considered auspicious for government or leadership work."
                );
                break;

            case 2:
                System.out.println(
                    "Planet: Moon (Chandra)\n" +
                    "Deity: Lord Shiva\n" +
                    "Significance:\n" +
                    "- Represents calmness, emotions, and the mind.\n" +
                    "- Fasting on Mondays (Somavar Vrat) pleases Lord Shiva; popular among unmarried girls for getting a good spouse.\n" +
                    "- Worship includes offering milk, bilva leaves, and water to Shiva Linga.\n" +
                    "- Considered good for travel and spiritual practices."
                );
                break;

            case 3:
                System.out.println(
                    "Planet: Mars (Mangal)\n" +
                    "Deity: Hanuman, Durga, Kartikeya\n" +
                    "Significance:\n" +
                    "- Symbolizes strength, courage, and protection.\n" +
                    "- People fast on Tuesdays to reduce effects of Mangal Dosh.\n" +
                    "- Hanuman is worshiped with red flowers and sindoor.\n" +
                    "- Good for legal and property-related work."
                );
                break;

            case 4:
                System.out.println(
                    "Planet: Mercury (Budha)\n" +
                    "Deity: Lord Vishnu, Krishna\n" +
                    "Significance:\n" +
                    "- Represents intelligence, communication, and trade.\n" +
                    "- Wednesday fasts help with memory and financial stability.\n" +
                    "- Green items and tulsi leaves are considered auspicious.\n" +
                    "- Good day for studies and communication."
                );
                break;

            case 5:
                System.out.println(
                    "Planet: Jupiter (Guru)\n" +
                    "Deity: Lord Vishnu, Brihaspati, Sai Baba\n" +
                    "Significance:\n" +
                    "- Associated with wisdom, prosperity, and learning.\n" +
                    "- Thursday fasts bring blessings of teachers and deities.\n" +
                    "- Yellow is auspicious; offerings include chana dal and yellow flowers.\n" +
                    "- Good for starting education or spiritual activities."
                );
                break;

            case 6:
                System.out.println(
                    "Planet: Venus (Shukra)\n" +
                    "Deity: Goddess Lakshmi, Santoshi Mata\n" +
                    "Significance:\n" +
                    "- Represents love, beauty, wealth, and luxury.\n" +
                    "- Fasting on Friday helps with prosperity and family happiness.\n" +
                    "- White or pink clothes, sweets, and milk are offered.\n" +
                    "- Ideal for investments or home-related work."
                );
                break;

            case 7:
                System.out.println(
                    "Planet: Saturn (Shani)\n" +
                    "Deity: Shani Dev, Hanuman, Vishnu\n" +
                    "Significance:\n" +
                    "- Linked to discipline, justice, and karma.\n" +
                    "- Saturday fasts reduce effects of Sade-Sati or Dhaiya.\n" +
                    "- Devotees light sesame oil lamps under Peepal trees.\n" +
                    "- Good for charity, humility, and service."
                );
                break;

            default:
                System.out.println("Invalid Day. Please enter a number between 1 and 7.");
                break;
        }
    }
}
