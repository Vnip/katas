class ResistorColorDuo {
    int value(String[] colors) {
         int first = colorCode(colors[0]);
        int second = colorCode(colors[1]);

        return first * 10 + second;
        }

    private int colorCode(String color) {
        switch (color) {
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "grey": return 8;
            case "white": return 9;
            default:
                throw new IllegalArgumentException("Invalid color: " + color);
        }
    }
}
