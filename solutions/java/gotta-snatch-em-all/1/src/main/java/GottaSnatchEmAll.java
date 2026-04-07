import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> newCollection = new HashSet<String>();
        for (String eachCard : cards) {
        	newCollection.add(eachCard);
		}
        return newCollection;
    }

    static boolean addCard(String card, Set<String> collection) {
		boolean isUpdated = false;
		if (!collection.contains(card)) {
			collection.add(card);
			isUpdated = true;
		}
		return isUpdated;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
    boolean iHaveUnique = false;
    boolean theyHaveUnique = false;

    for (String myCard : myCollection) {
        if (!theirCollection.contains(myCard)) {
            iHaveUnique = true;
        }
    }

    for (String theirCard : theirCollection) {
        if (!myCollection.contains(theirCard)) {
            theyHaveUnique = true;
        }
    }

    return iHaveUnique && theyHaveUnique;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
    Set<String> result = new HashSet<>(collections.get(0));

    for (Set<String> collection : collections) {
        result.retainAll(collection);
    }

    return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
    Set<String> result = new HashSet<>();

    for (Set<String> collection : collections) {
        result.addAll(collection);
    }

    return result;
}
}
