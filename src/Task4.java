public class Task4 {
    private String text;

    public Task4(String text) {
        this.text = text;
    }

    public void method1() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String punctuation = " ,.!?";
        String currentWord = "";
        int wordLength = 0;
        boolean wordIsAlphabetical = false;
        boolean punctuationFlag = false;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < punctuation.length(); j++) {
                if (text.charAt(i) == punctuation.charAt(j)) {
                    punctuationFlag = true;
                    break;
                }
            }
            if (punctuationFlag == true) {
                if (wordLength > 0) {
                    // Перевіряємо, чи є слово алфавітним
                    for (int k = 0; k < currentWord.length() - 1; k++) {
                        if (alphabet.indexOf(Character.toLowerCase(currentWord.charAt(k))) < alphabet
                                .indexOf(Character.toLowerCase(currentWord.charAt(k + 1)))) {
                            wordIsAlphabetical = true;
                        } else {
                            wordIsAlphabetical = false;
                            break;
                        }
                    }
                    if (wordIsAlphabetical == true) {
                        // Виводимо слово, якщо воно алфавітне
                        System.out.println(currentWord);
                    }
                    currentWord = "";
                    wordLength = 0;
                }
                punctuationFlag = false;
            } else {
                currentWord += text.charAt(i);
                wordLength++;
            }
        }
    }
}
