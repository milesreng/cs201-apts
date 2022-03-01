import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        ArrayList<Word> words = new ArrayList<>();
        ArrayList<String> dataList = new ArrayList<>(Arrays.asList(data));
        Set<String> unique = new HashSet<>(Arrays.asList(data));

        for (String word : unique) {
            Word w = new Word(word, Collections.frequency(dataList, word));
            words.add(w);
        }

        Comparator<Word> alph = Comparator.comparing(Word::getWord);
        Comparator<Word> frequencies = Comparator.comparing(Word::getFreq).reversed().thenComparing(alph);
        Collections.sort(words, frequencies);

        String[] ret = new String[words.size()];
        int i = 0;
        for (Word w : words) {
            ret[i] = w.getWord();
            i++;
        }

        return ret;
    }

    private class Word {
        private String word;
        private int freq;

        public Word(String word, int freq) {
            this.word = word;
            this.freq = freq;
        }

        public int getFreq() {
            return this.freq;
        }

        public String getWord() {
            return this.word;
        }
    }
}