import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> dialingCodes = new HashMap<>();

    // 1. Return the map
    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    // 2. Add or update (overwrite if exists)
    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    // 3. Get country by code
    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    // 4. Add only if BOTH code and country are new
    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)) {
            dialingCodes.put(code, country);
        }
    }

    // 5. Find code by country (value → key)
    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 6. Update code for existing country
    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);

        if (oldCode != null) {
            dialingCodes.remove(oldCode);
            dialingCodes.put(code, country);
        }
    }
}