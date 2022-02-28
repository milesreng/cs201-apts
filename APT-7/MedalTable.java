import java.util.*;

public class MedalTable {

    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for (String s : results) {
            String[] data = s.split(" ");
            for (int i = 0; i < data.length; i++) {
                String c = data[i];
                if (!map.containsKey(c)) {
                    map.put(c, new MedalCountry(c));
                }
                if (i == 0) {
                    map.get(c).myGold++;
                } else if (i == 1) {
                    map.get(c).mySilver++;
                } else {
                    map.get(c).myBronze++;
                }

            }
        }

        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry::getGold).reversed();
        Comparator<MedalCountry> silver = Comparator.comparing(MedalCountry::getSilver).reversed();
        Comparator<MedalCountry> bronze = Comparator.comparing(MedalCountry::getBronze).reversed();
        Comparator<MedalCountry> country = Comparator.comparing(MedalCountry::getName);
        Comparator<MedalCountry> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(country);
        Collections.sort(list, comp);

        String[] countries = new String[list.size()];
        int i = 0;
        for (MedalCountry m : list) {
            countries[i] = m.toString();
            i++;
        }
        return countries;
    }

    private class MedalCountry {
        String myName;
        int myGold;
        int mySilver;
        int myBronze;

        public MedalCountry(String name) {
            myName = name;
        }

        public int getGold() {
            return myGold;
        }

        public int getSilver() {
            return mySilver;
        }
        public int getBronze() {
            return myBronze;
        }

        public String getName() {
            return myName;
        }

        @Override
        public String toString() {
            return String.format("%s %d %d %d", myName, myGold, mySilver, myBronze);
        }
    }
}