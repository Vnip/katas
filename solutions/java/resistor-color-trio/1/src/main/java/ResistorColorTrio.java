class ResistorColorTrio {
    String label(String[] colors) {

    long value = colorCode(colors[0]) * 10L
               + colorCode(colors[1]);

    int zeros = colorCode(colors[2]);

    for (int i = 0; i < zeros; i++) {
        value *= 10;
    }

    String[] units = {"ohms", "kiloohms", "megaohms", "gigaohms"};

    int unitIndex = 0;

    while (value >= 1000 && unitIndex < units.length - 1) {
        value /= 1000;
        unitIndex++;
    }

    return value + " " + units[unitIndex];
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
