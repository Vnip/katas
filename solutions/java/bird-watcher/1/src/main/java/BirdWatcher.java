
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCountCopy = {0,2,5,3,7,8,4};
        return lastWeekCountCopy;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length == 0) {
        return; // safety check if array is empty
    }
    birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
       int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);

        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) { // a busy day is 5 or more birds
                count++;
            }
        }
        return count;
    }
}
