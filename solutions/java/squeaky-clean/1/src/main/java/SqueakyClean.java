class SqueakyClean {
    static String clean(String identifier) {
       StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            // 1. Replace spaces with underscore
            if (ch == ' ') {
                result.append('_');
                continue;
            }

            // 2. Convert kebab-case to camelCase
            if (ch == '-') {
                capitalizeNext = true;
                continue;
            }

            // 3. Convert leetspeak
            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
            }

            // 4. Omit non-letters (except underscore)
            if (!Character.isLetter(ch) && ch != '_') {
                continue;
            }

            // Apply camelCase capitalization
            if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }

            result.append(ch);
        }

        return result.toString();
    }
}
