public class OOPSBannerapp {

    // Inner class to store character pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create patterns for characters
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "*   *",
                " *** "
        });

        String[] o = O.getPattern();
        String[] p = P.getPattern();
        String[] s = S.getPattern();

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", o[i], o[i], p[i], s[i]));
        }
    }
}